package com.Game;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

import com.DAO.GameDAO;
import com.VO.GameVO;
import com.VO.MemberVO;
import com.VO.WrongVO;

public class Tester01 {

	public static void main(String[] args) {Scanner sc = new Scanner(System.in);
	
	System.out.println("========== 시작 화면 ==========");	//텍스트 이미지를 사용한다면 여기
	
	System.out.println("팀 이름: ****** ");
    System.out.println("팀원: 김지은, 박승현, 송영지, 한우규");
    System.out.print("==============================");
    String sp = sc.nextLine();
	
	
	int memno = 0;
	String id = null;
	String password = null;
	String name = null;
	int score = 0;
	int sum = 0;
	int fail = 0;	
	
	int qnum = 0;
	String question = null;
	String answer = null;
	int qscore = 0;
	int grade = 0;
	int wrno = 0;
	
	Connection con = null;
	PreparedStatement pst = null;
	
	String temp = null;
	String temp2 = null;
	
	MemberVO vo = null;
	GameVO vo1 = null;
	WrongVO vo2 =null;
	
	ArrayList<GameVO> al2 = null;
	
	GameDAO dao = null;
	boolean result = false;		//기본적으로 실패라 해놓고 성공했을 때만 성공으로 뜨게 한다
	
	while(true) {
		System.out.println("[1]회원가입 [2]로그인 [3]게임 종료 ");			
		System.out.print("메뉴를 선택하세요. ");
		int start = sc.nextInt();	
		switch(start) {
		case 0: dao = new GameDAO();
		dao.isLogin("abc", "1111");
		case 1:
			System.out.println("[1]회원가입");
			
			System.out.print("아이디 : ");
			id = sc.next();
			System.out.print("비밀번호 : ");
			password = sc.next();
			System.out.print("이름 : ");
			name = sc.next();
			
			
			dao = new GameDAO();
			//이 부분이 포인트
			result = dao.insertStd(id, password, name, score);
			if(result == true) {
				System.out.println("아이디 생성 성공");
			} else {
				System.out.println("아이디 생성 실패");
			}
			break;
		case 2:
			System.out.println("[2]로그인 ");
			System.out.print("아이디 입력: ");
			temp =sc.next();
			System.out.print("패스워드 입력: ");
			temp2 =sc.next();
			
			dao = new GameDAO();
			vo = dao.oneSelectStd(temp, temp2);
			//vo가 null 이거나 null이 아니어도 id, password 가 같지 않으면 위 값 도출
			if(vo == null) {
				System.out.println("등록된 정보가 없습니다.");
			}
			else {
				if( temp.equals(vo.getId()) && temp2.equals(vo.getPassword()) ) {
					System.out.println("로그인 성공");
					
					while(true) {
						System.out.println("========== 메뉴 화면 ==========");
						System.out.println("[1]게임 시작 [2]오답 노트 확인 [3]랭킹 확인 [4]게임 종료 ");			
						System.out.print("메뉴를 선택하세요. ");
						int menu = sc.nextInt();
						switch(menu) {
						case 1: 
							System.out.println("[1]게임 시작");
							System.out.println("난이도 선택 : [1]EASY [2]NORMAL [3]HARD [4]RANDOM ");
							System.out.print("메뉴를 선택하세요. ");
							int level = sc.nextInt();
													
							if(level == 1) {								
								al2 = dao.levelSelectStd(level);
								for(int i =0; i<al2.size();i++) {
									System.out.println("문제 "+(i+1)+". "+al2.get(i).getQuestion());
									System.out.print("정답 입력: ");
									String answer2 = sc.next();
									if(answer2.equals(al2.get(i).getAnswer())) {
										System.out.println("정답입니다.");
										System.out.println(al2.get(i).getAnswer()+" : "+al2.get(i).getQuestion()+"\n");
										sum += al2.get(i).getQscore();
									} else {
										System.out.println("틀렸습니다. 정답은 '"+al2.get(i).getAnswer()+"'입니다.");										
										fail++;
										
										dao = new GameDAO();
										//이 부분이 포인트
										id = vo.getId();
										question = al2.get(i).getQuestion();
										answer = al2.get(i).getAnswer();
										grade = al2.get(i).getGrade();
										result = dao.insertWrong(id, question, answer, grade);
										
										if(result == true) {
											System.out.println("틀린 문제는 오답 노트에 등록되었습니다.");
										} else {
											System.out.println("오답 노트 등록 실패");
										}
										System.out.println();
										if(fail==5) {
											System.out.println("========== GAME OVER!! ==========");
											break;
										} 										
									}
								}
								if(fail<5) {
									System.out.println("========== WINNER!!! ==========");
								}								
								
							} else if(level == 2){
								al2 = dao.levelSelectStd(level);
								for(int i =0; i<al2.size();i++) {
									System.out.println("문제 "+(i+1)+". "+al2.get(i).getQuestion());
									System.out.print("정답 입력: ");
									String answer2 = sc.next();
									if(answer2.equals(al2.get(i).getAnswer())) {
										System.out.println("정답입니다.");
										System.out.println(al2.get(i).getAnswer()+" : "+al2.get(i).getQuestion()+"\n");
										sum += al2.get(i).getQscore();
									} else {
										System.out.println("틀렸습니다. 정답은 '"+al2.get(i).getAnswer()+"'입니다.");
										fail++;
										
										dao = new GameDAO();
										//이 부분이 포인트
										id = vo.getId();
										question = al2.get(i).getQuestion();
										answer = al2.get(i).getAnswer();
										grade = al2.get(i).getGrade();
										result = dao.insertWrong(id, question, answer, grade);
										
										if(result == true) {
											System.out.println("틀린 문제는 오답 노트에 등록되었습니다.");
										} else {
											System.out.println("오답 노트 등록 실패");
										}
										System.out.println();
										if(fail==5) {
											System.out.println("========== GAME OVER!! ==========");
											break;
										} 
									}
								}
								if(fail<5) {
									System.out.println("========== WINNER!!! ==========");
								}
								
							} else if(level ==3) {
								al2 = dao.levelSelectStd(level);
								for(int i =0; i<al2.size();i++) {
									System.out.println("문제 "+(i+1)+". "+al2.get(i).getQuestion());
									System.out.print("정답 입력: ");
									String answer2 = sc.next();
									if(answer2.equals(al2.get(i).getAnswer())) {
										System.out.println("정답입니다.");
										System.out.println(al2.get(i).getAnswer()+" : "+al2.get(i).getQuestion()+"\n");										
										sum += al2.get(i).getQscore();
									} else {
										System.out.println("틀렸습니다. 정답은 '"+al2.get(i).getAnswer()+"'입니다.");										
										fail++;
										
										dao = new GameDAO();
										//이 부분이 포인트
										id = vo.getId();
										question = al2.get(i).getQuestion();
										answer = al2.get(i).getAnswer();
										grade = al2.get(i).getGrade();
										result = dao.insertWrong(id, question, answer, grade);
										
										if(result == true) {
											System.out.println("틀린 문제는 오답 노트에 등록되었습니다.");
										} else {
											System.out.println("오답 노트 등록 실패");
										}
										System.out.println();
										if(fail==5) {
											System.out.println("========== GAME OVER!! ==========");
											break;
										} 
									}
								}
								if(fail<5) {
									System.out.println("========== WINNER!!! ==========");
								}
								
							} else if(level ==4) {
								al2 = dao.RandomSelectStd();
								for(int i =0; i<al2.size();i++) {
									System.out.println("문제 "+(i+1)+". "+al2.get(i).getQuestion());
									System.out.print("정답 입력: ");
									String answer2 = sc.next();
									if(answer2.equals(al2.get(i).getAnswer())) {
										System.out.println("정답입니다.");
										System.out.println(al2.get(i).getAnswer()+" : "+al2.get(i).getQuestion()+"\n");										
										sum += al2.get(i).getQscore();
									} else {
										System.out.println("틀렸습니다. 정답은 '"+al2.get(i).getAnswer()+"'입니다.");										
										fail++;
										
										dao = new GameDAO();
										//이 부분이 포인트
										id = vo.getId();
										question = al2.get(i).getQuestion();
										answer = al2.get(i).getAnswer();
										grade = al2.get(i).getGrade();
										result = dao.insertWrong(id, question, answer, grade);
										
										if(result == true) {
											System.out.println("틀린 문제는 오답 노트에 등록되었습니다.");
										} else {
											System.out.println("오답 노트 등록 실패");
										}
										System.out.println();
										if(fail==5) {
											System.out.println("========== GAME OVER!! ==========");
											break;
										} 
									}
								}
								if(fail<5) {
									System.out.println("========== WINNER!!! ==========");							
								}						
							}//게임 끝난 다음
							System.out.println("당신의 점수는 "+sum+"점 입니다.");
							if(sum > vo.getScore()) {
								memno = vo.getMemno();
								id = vo.getId();
								password = vo.getPassword();
								name = vo.getName();
								score = sum;
								
								dao = new GameDAO();
								result = dao.updateScore(memno, id, password, name, score);
								
								if(result == true) {
									System.out.println("점수를 갱신하였습니다.");
								} else {
									System.out.println("점수 갱신 실패");
								}									
							} else {
								System.out.println("더 높은 기록이 있으므로 갱신하지 않습니다.");
							}
							
							break;
							
						
						case 2: //오답노트 관련 내용
							System.out.println("[2]오답 노트 확인");
							System.out.println("========== 오답 노트 ==========");
							// 어레이 리스트 오답 노트 출력
							
							
							dao = new GameDAO();
							System.out.println("접속 ID: "+vo.getId());
							ArrayList<WrongVO> al3 = dao.WrongselectStd(vo.getId());	//여기는 그냥 id
							for(int i=0; i<al3.size(); i++) {					
								vo2 = al3.get(i);
								System.out.print((i+1)+"번 문제: ");
								//System.out.print(vo2.getWrno()+"\t"+"|");								
								System.out.print(vo2.getQuestion()+"\t"+"|");
								System.out.print(vo2.getAnswer()+"\t");																
								System.out.println();
							}
							break;
													
						case 3:
							System.out.println("[3]랭킹 확인");
							System.out.println("========== 랭킹 화면 ==========");
							
							dao = new GameDAO();
							ArrayList<MemberVO> al = dao.RankselectStd();
							for(int i=0; i<al.size(); i++) {					
								vo = al.get(i);
								System.out.print((i+1)+"등: ");
								//System.out.print(vo.getMemno()+"\t"+"|");								
								System.out.print(vo.getId()+"\t"+"|");
								System.out.print(vo.getName()+"\t"+"|");
								System.out.print(vo.getScore()+"\t");																
								System.out.println();
							}
							break;
							
						case 4:
							System.out.println("[4]게임 종료");
							
						}
				}
			}			
			break;
			
		
	} 
	
			
	 

 }
		/*case 3: 	// 로그인 화면 게임 종료
		System.out.println("[3]게임 종료");
		break;
	}
	if(start==6) {
		break;
	}*/	
		}
	}
}
	
	

