package com.Game;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

import com.DAO.GameDAO;
import com.VO.GameVO;
import com.VO.MemberVO;
import com.VO.WrongVO;

public class GameView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("================ Intro =============="); // 텍스트 이미지를 사용한다면 여기
		System.out.println();
		System.out.println("팀 이름: DBJARA ");
		System.out.println();
		System.out.println("팀원: 김지은, 박승현, 송영지, 한우규");

		System.out.print("====================================");
		System.out.println();
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
		WrongVO vo2 = null;

		ArrayList<GameVO> al2 = null;

		GameDAO dao = null;
		boolean result = false;

		while (true) {
			System.out.println("============== 시작 화면 ==============");
			System.out.println("[1]회원가입 [2]로그인 [3]게임 종료 ");
			System.out.print("메뉴를 선택하세요: ");
			int start = sc.nextInt();
			System.out.println();

			switch (start) {

			case 1: // 회원가입
				System.out.println("[1]회원가입하세요.");

				System.out.print("아이디: ");
				id = sc.next();
				System.out.print("비밀번호: ");
				password = sc.next();
				System.out.print("이름: ");
				name = sc.next();

				dao = new GameDAO();

				result = dao.insertStd(id, password, name, score);
				if (result == true) {
					System.out.println("\r\n아이디 생성 성공");
				} else {
					System.out.println("\r\n아이디 생성 실패");
				}
				break;

			case 2: // 로그인
				System.out.println("[2]로그인하세요. ");
				System.out.print("아이디 입력: ");
				temp = sc.next();
				System.out.print("패스워드 입력: ");
				temp2 = sc.next();

				dao = new GameDAO();
				vo = dao.oneSelectStd(temp, temp2);
				// vo가 null 이거나 null이 아니어도 id, password 가 같지 않으면 위 값 도출
				if (vo == null) {
					System.out.println("\r\n등록된 정보가 없습니다. 다시 확인해주세요.");
				} else {
					if (temp.equals(vo.getId()) && temp2.equals(vo.getPassword())) {
						System.out.println("\r\n로그인 성공");

						while (true) { // 메뉴 화면
							System.out.println();
							System.out.println("============== 메뉴 화면 ==============");
							System.out.println("[1]게임 시작 [2]오답 노트 확인 [3]랭킹 확인 [4]로그아웃 ");
							System.out.print("메뉴를 선택하세요: ");
							int menu = sc.nextInt();
							switch (menu) {

							case 1: // 게임 시작
								// System.out.println("[1]게임 시작");
								try {
									System.out.println(
											"\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@@@=$@@@@#=@@@@@@@@@@@@@@==@@@@@@$;*@@@@@; =@@@@@@@@@@@@@$=@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@@# .@@@@! =@@@        ~@,.@@@@@* .-:@@* ..#@@@@@!:$@@@@@;.@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@$.: :@@@! =@@@@@#  ~@@@@-.@@@@~ *@$.-##=~ #@@! !!!: ;@$$-.@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@--@= !@@;  :@@@@-,@..@@@, ::@;-@@@@#--@@*,$@@- @@@@~.@~:.,@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@-.@@@. @@; =@@@@- @@= ;@@,,@@@@@@@@@@,..~@@@@@= .##: -@@@,,@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@: $@@@@,.@; $@@@: =@@@# *@.,@@@@@@@@@- !! ,@@@@@*!!!!$@@@@,,@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@@@@@@#@@*,$@@@@@@@@@@@@@~-#@@@@@@@@, ;! ,@@@@@@@@@@@@@@@:-@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@@@#$$$$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@:..:;!*!#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@~,#@@@@@@@@@@@;:,-,,,,@@@,,,,:~-,~!@@@@$;~,..~$@@@@!@@@@@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@# ;@@$,,~-*@@# .$@@@-,@@@@: #@  @@: $@@#  *###. *@@@. !#@@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@#.;@@@$$* !@@* *@@@@~ @@@@:.#@, @@* $@@: ..,-:::!@@@.  .~@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@! ;*$#$* ;@@$,:!**;. @@@@:.#@, @@: $@@$ ~!!***!=@@@.     :=@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@@:,.....!@@@@:.~,-,.@@@@:,#@,.@@;,#@@@@~.~,..:!@@@.        $@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.         ,*@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@$!:~~::!@@@@~:@@@@@@@@@@@@@@@@@@@@@@@@@@@@$:=@@@@@@.         ~=@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@$ :@@@@@@@@@#, ####@@@@@@######@@@@#@###@@#= !###@@@.       .@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@$ .:=#@@@@@=*  **!*@@@@- ;*!; ~#@@:  ;=!*@*~ :!**#@@.     !$@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@!:::~ ~@@@@ ,@@@@@@@  @@@@@ =@@@; $@@@@@@! #@@@@@@.  ,;@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@@@@@@: #@@@. @@@@@@@ .@@@@@ ;@@@: $@@@@@@= *@@@@@@. =@@@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@$-~----.-@@@@! ----~@@=.,---  :@@@: $@@@@@@#.,----=@=@@@@@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@######@@@@@@@@##=$@@@@@@#@@@##@@@@#@@@@@@@@@@@==#@@@@@@@@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
									Thread.sleep(20);
									System.out.println(
											"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n");
								} catch (InterruptedException e) {
									System.err.format("IOException: %s%n", e);
								}

								System.out.println("<난이도 선택>\r\n[1]EASY [2]NORMAL [3]HARD [4]RANDOM ");
								System.out.print("메뉴를 선택하세요: ");
								int level = sc.nextInt();
								System.out.println();

								if (level == 1) { // EASY 난이도
									al2 = dao.levelSelectStd(level);
									for (int i = 0; i < al2.size(); i++) {
										System.out.println("문제>> " + (i + 1) + ". " + al2.get(i).getQuestion());
										System.out.print("정답 입력: ");
										String answer2 = sc.next();
										if (answer2.equals(al2.get(i).getAnswer())) {
											System.out.println("\r\n정답입니다.\r\n");
											System.out.println(
													al2.get(i).getAnswer() + " : " + al2.get(i).getQuestion() + "\r\n");
											sum += al2.get(i).getQscore();
										} else {
											System.out.println("\r\n틀렸습니다. 정답은 '" + al2.get(i).getAnswer() + "'입니다.");
											fail++;
											// 오답 노트 등록
											dao = new GameDAO();

											id = vo.getId();
											question = al2.get(i).getQuestion();
											answer = al2.get(i).getAnswer();
											grade = al2.get(i).getGrade();
											result = dao.insertWrong(id, question, answer, grade);

											if (result == true) {
												System.out.println("틀린 문제는 오답 노트에 등록되었습니다.");
											} else {
												System.out.println("\r\n오답 노트 등록 실패\r\n");
											}
											System.out.println();

											if (fail == 5) {
												// System.out.println("========== GAME OVER!! ==========");
												try {
													System.out.println(
															"\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@,   .;@@@@@@@@@@@@-.:@@@@#,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@#-    ..$@@@@=-$@@@@-..=@@#..#@@@#$**;,.;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@:..,=-..$@@@$..,$@@@-  .$#- .$*~........;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@;.. #@@@@@@@#.....#@@-   . . .*..........;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@; ..$@$====@#.......$@-.    ...!,.......-:=@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@-...#@:   -@*. .-,..~@-.     ..;~... ~*=#@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~...#@*:: -@-..=@-..~#~..    ..~;.......=@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~...~$##= -=...!$,..~#,..,  ~..-!......,$@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~.......  -;.    ...~$..-*.~#,..*...,$##@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@#........ !..   ....~!..;@:#@,..*....,,,,-@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@$...... ,!... *!...~:..=@@@@,..!........,@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@$-----,$!:::!@=---:;~-#@@@@;::*--------~@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@~..*@@@$*-*@@!@@@@@@@@@$=*:!@@@@#=*:#@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@#:....*@:...-@@..$@##*~....  :##*,....,#@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@!...,..*#..  @#.. ,-.....    :..   ....-@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@!...=*...!~.. ==...:~....     :    :. ...:@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@*...*@@-..-*...*!...=:....~*$#@@.   @#;...~@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@-...$@@~..-#,..:;  .@;. .....*@@,  .@@$   :@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~....$=...-@!...;. !@!  ..   *@@,   #@*. ~@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@*.....-...-@$.....,#@*  ...*#@@@~   .,. :@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@!........$@@-....,@@=.  ,;;;;;@:    . ~#@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@!.....,$@@@$....=@@#         @;      .;#@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@:~~~~$@@@@@,..,@@@#        .@!   .  .. !@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!  ~@@@@@@@@@@@@@@*..,#*,   ;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!*#@@@@@@@@@@@@@@#**$@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
												} catch (InterruptedException e) {
													System.err.format("IOException: %s%n", e);
												}
												break;
											}
										}
									}

									if (fail < 5) {
										// System.out.println("========== WINNER!!! ==========");
										try {
											System.out.println(
													"\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~-@@@@-*@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@-:@@ -@@#,@@ @@@.-@@@,=@@~-@@@-;@* ....=-@...  .=@@@~ @@@@.!@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@:~@@ -@@..@@ @@@. @@@,=@@~ @@@,;@@;-$$$##@# #$#$ @@@. @@@@ *@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@*.@@  @@ @@@ #@@. -@@.=@@~ ,@@.;@@!~@@@@@@@ @@@@ @@@. @@@@ !@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@ @=  !@ @@@ @@@.! =@.=@@~! !@ ;@@! ...~@@@ $@@# @@@. @@@@.*@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@ ~*-=.$ @@@ @@@.*; # =@@~*; # ;@@!~@@@@@@@     :@@@. @@@@.*@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@*  :$ *.@@@ @@@.#@,: =@@~*@:: ;@@!~@@@@@@@ =@@ @@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@  @@=.,@@@ @@@.;@@  =@@~:@@  ;@@!-@@@@@@@ @@@, @@@~!@@@@~#@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@*-@@$ @@@@ @@@.-@@: =@@~-@@; ;@@!     ,@@ @@@@ @@@. @@@@ !@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
										} catch (InterruptedException e) {
											System.err.format("IOException: %s%n", e);
										}
									}
								} else if (level == 2) { // NORMAL 난이도
									al2 = dao.levelSelectStd(level);
									for (int i = 0; i < al2.size(); i++) {
										System.out.println("문제>> " + (i + 1) + ". " + al2.get(i).getQuestion());
										System.out.print("정답 입력: ");
										String answer2 = sc.next();
										if (answer2.equals(al2.get(i).getAnswer())) {
											System.out.println("\r\n정답입니다.\r\n");
											System.out.println(
													al2.get(i).getAnswer() + " : " + al2.get(i).getQuestion() + "\r\n");
											sum += al2.get(i).getQscore();
										} else {
											System.out.println("\r\n틀렸습니다. 정답은 '" + al2.get(i).getAnswer() + "'입니다.");
											fail++;

											dao = new GameDAO();

											id = vo.getId();
											question = al2.get(i).getQuestion();
											answer = al2.get(i).getAnswer();
											grade = al2.get(i).getGrade();
											result = dao.insertWrong(id, question, answer, grade);

											if (result == true) {
												System.out.println("틀린 문제는 오답 노트에 등록되었습니다.");
											} else {
												System.out.println("\r\n오답 노트 등록 실패\r\n");
											}
											System.out.println();

											if (fail == 5) {
												// System.out.println("========== GAME OVER!! ==========");
												try {
													System.out.println(
															"\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@,   .;@@@@@@@@@@@@-.:@@@@#,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@#-    ..$@@@@=-$@@@@-..=@@#..#@@@#$**;,.;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@:..,=-..$@@@$..,$@@@-  .$#- .$*~........;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@;.. #@@@@@@@#.....#@@-   . . .*..........;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@; ..$@$====@#.......$@-.    ...!,.......-:=@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@-...#@:   -@*. .-,..~@-.     ..;~... ~*=#@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~...#@*:: -@-..=@-..~#~..    ..~;.......=@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~...~$##= -=...!$,..~#,..,  ~..-!......,$@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~.......  -;.    ...~$..-*.~#,..*...,$##@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@#........ !..   ....~!..;@:#@,..*....,,,,-@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@$...... ,!... *!...~:..=@@@@,..!........,@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@$-----,$!:::!@=---:;~-#@@@@;::*--------~@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@~..*@@@$*-*@@!@@@@@@@@@$=*:!@@@@#=*:#@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@#:....*@:...-@@..$@##*~....  :##*,....,#@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@!...,..*#..  @#.. ,-.....    :..   ....-@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@!...=*...!~.. ==...:~....     :    :. ...:@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@*...*@@-..-*...*!...=:....~*$#@@.   @#;...~@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@-...$@@~..-#,..:;  .@;. .....*@@,  .@@$   :@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~....$=...-@!...;. !@!  ..   *@@,   #@*. ~@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@*.....-...-@$.....,#@*  ...*#@@@~   .,. :@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@!........$@@-....,@@=.  ,;;;;;@:    . ~#@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@!.....,$@@@$....=@@#         @;      .;#@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@:~~~~$@@@@@,..,@@@#        .@!   .  .. !@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!  ~@@@@@@@@@@@@@@*..,#*,   ;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!*#@@@@@@@@@@@@@@#**$@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
												} catch (InterruptedException e) {
													System.err.format("IOException: %s%n", e);
												}
												break;
											}
										}
									}

									if (fail < 5) {
										// System.out.println("========== WINNER!!! ==========");
										try {
											System.out.println(
													"\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~-@@@@-*@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@-:@@ -@@#,@@ @@@.-@@@,=@@~-@@@-;@* ....=-@...  .=@@@~ @@@@.!@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@:~@@ -@@..@@ @@@. @@@,=@@~ @@@,;@@;-$$$##@# #$#$ @@@. @@@@ *@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@*.@@  @@ @@@ #@@. -@@.=@@~ ,@@.;@@!~@@@@@@@ @@@@ @@@. @@@@ !@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@ @=  !@ @@@ @@@.! =@.=@@~! !@ ;@@! ...~@@@ $@@# @@@. @@@@.*@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@ ~*-=.$ @@@ @@@.*; # =@@~*; # ;@@!~@@@@@@@     :@@@. @@@@.*@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@*  :$ *.@@@ @@@.#@,: =@@~*@:: ;@@!~@@@@@@@ =@@ @@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@  @@=.,@@@ @@@.;@@  =@@~:@@  ;@@!-@@@@@@@ @@@, @@@~!@@@@~#@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@*-@@$ @@@@ @@@.-@@: =@@~-@@; ;@@!     ,@@ @@@@ @@@. @@@@ !@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
										} catch (InterruptedException e) {
											System.err.format("IOException: %s%n", e);
										}
									}
								} else if (level == 3) { // HARD 난이도
									al2 = dao.levelSelectStd(level);
									for (int i = 0; i < al2.size(); i++) {
										System.out.println("문제>> " + (i + 1) + ". " + al2.get(i).getQuestion());
										System.out.print("정답 입력: ");
										String answer2 = sc.next();
										if (answer2.equals(al2.get(i).getAnswer())) {
											System.out.println("\r\n정답입니다.\r\n");
											System.out.println(
													al2.get(i).getAnswer() + " : " + al2.get(i).getQuestion() + "\r\n");
											sum += al2.get(i).getQscore();
										} else {
											System.out.println("\r\n틀렸습니다. 정답은 '" + al2.get(i).getAnswer() + "'입니다.");
											fail++;

											dao = new GameDAO();

											id = vo.getId();
											question = al2.get(i).getQuestion();
											answer = al2.get(i).getAnswer();
											grade = al2.get(i).getGrade();
											result = dao.insertWrong(id, question, answer, grade);

											if (result == true) {
												System.out.println("틀린 문제는 오답 노트에 등록되었습니다.");
											} else {
												System.out.println("\r\n오답 노트 등록 실패\r\n");
											}
											System.out.println();

											if (fail == 5) {
												// System.out.println("========== GAME OVER!! ==========");
												try {
													System.out.println(
															"\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@,   .;@@@@@@@@@@@@-.:@@@@#,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@#-    ..$@@@@=-$@@@@-..=@@#..#@@@#$**;,.;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@:..,=-..$@@@$..,$@@@-  .$#- .$*~........;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@;.. #@@@@@@@#.....#@@-   . . .*..........;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@; ..$@$====@#.......$@-.    ...!,.......-:=@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@-...#@:   -@*. .-,..~@-.     ..;~... ~*=#@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~...#@*:: -@-..=@-..~#~..    ..~;.......=@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~...~$##= -=...!$,..~#,..,  ~..-!......,$@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~.......  -;.    ...~$..-*.~#,..*...,$##@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@#........ !..   ....~!..;@:#@,..*....,,,,-@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@$...... ,!... *!...~:..=@@@@,..!........,@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@$-----,$!:::!@=---:;~-#@@@@;::*--------~@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@~..*@@@$*-*@@!@@@@@@@@@$=*:!@@@@#=*:#@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@#:....*@:...-@@..$@##*~....  :##*,....,#@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@!...,..*#..  @#.. ,-.....    :..   ....-@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@!...=*...!~.. ==...:~....     :    :. ...:@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@*...*@@-..-*...*!...=:....~*$#@@.   @#;...~@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@-...$@@~..-#,..:;  .@;. .....*@@,  .@@$   :@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~....$=...-@!...;. !@!  ..   *@@,   #@*. ~@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@*.....-...-@$.....,#@*  ...*#@@@~   .,. :@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@!........$@@-....,@@=.  ,;;;;;@:    . ~#@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@!.....,$@@@$....=@@#         @;      .;#@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@:~~~~$@@@@@,..,@@@#        .@!   .  .. !@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!  ~@@@@@@@@@@@@@@*..,#*,   ;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!*#@@@@@@@@@@@@@@#**$@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
												} catch (InterruptedException e) {
													System.err.format("IOException: %s%n", e);
												}
												break;
											}
										}
									}

									if (fail < 5) {
										// System.out.println("========== WINNER!!! ==========");
										try {
											System.out.println(
													"\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~-@@@@-*@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@-:@@ -@@#,@@ @@@.-@@@,=@@~-@@@-;@* ....=-@...  .=@@@~ @@@@.!@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@:~@@ -@@..@@ @@@. @@@,=@@~ @@@,;@@;-$$$##@# #$#$ @@@. @@@@ *@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@*.@@  @@ @@@ #@@. -@@.=@@~ ,@@.;@@!~@@@@@@@ @@@@ @@@. @@@@ !@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@ @=  !@ @@@ @@@.! =@.=@@~! !@ ;@@! ...~@@@ $@@# @@@. @@@@.*@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@ ~*-=.$ @@@ @@@.*; # =@@~*; # ;@@!~@@@@@@@     :@@@. @@@@.*@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@*  :$ *.@@@ @@@.#@,: =@@~*@:: ;@@!~@@@@@@@ =@@ @@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@  @@=.,@@@ @@@.;@@  =@@~:@@  ;@@!-@@@@@@@ @@@, @@@~!@@@@~#@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@*-@@$ @@@@ @@@.-@@: =@@~-@@; ;@@!     ,@@ @@@@ @@@. @@@@ !@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
										} catch (InterruptedException e) {
											System.err.format("IOException: %s%n", e);
										}
									}
								} else if (level == 4) { // RANDOM 난이도
									al2 = dao.RandomSelectStd();
									for (int i = 0; i < al2.size(); i++) {
										System.out.println("문제>> " + (i + 1) + ". " + al2.get(i).getQuestion());
										System.out.print("정답 입력: ");
										String answer2 = sc.next();
										if (answer2.equals(al2.get(i).getAnswer())) {
											System.out.println("\r\n정답입니다.\r\n");
											System.out.println(
													al2.get(i).getAnswer() + " : " + al2.get(i).getQuestion() + "\r\n");
											sum += al2.get(i).getQscore();
										} else {
											System.out.println("\r\n틀렸습니다. 정답은 '" + al2.get(i).getAnswer() + "'입니다.");
											fail++;

											dao = new GameDAO();

											id = vo.getId();
											question = al2.get(i).getQuestion();
											answer = al2.get(i).getAnswer();
											grade = al2.get(i).getGrade();
											result = dao.insertWrong(id, question, answer, grade);

											if (result == true) {
												System.out.println("틀린 문제는 오답 노트에 등록되었습니다.");
											} else {
												System.out.println("\r\n오답 노트 등록 실패\r\n");
											}
											System.out.println();
											if (fail == 5) {
												// System.out.println("========== GAME OVER!! ==========");
												try {
													System.out.println(
															"\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@,   .;@@@@@@@@@@@@-.:@@@@#,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@#-    ..$@@@@=-$@@@@-..=@@#..#@@@#$**;,.;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@:..,=-..$@@@$..,$@@@-  .$#- .$*~........;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@;.. #@@@@@@@#.....#@@-   . . .*..........;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@; ..$@$====@#.......$@-.    ...!,.......-:=@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@-...#@:   -@*. .-,..~@-.     ..;~... ~*=#@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~...#@*:: -@-..=@-..~#~..    ..~;.......=@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~...~$##= -=...!$,..~#,..,  ~..-!......,$@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~.......  -;.    ...~$..-*.~#,..*...,$##@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@#........ !..   ....~!..;@:#@,..*....,,,,-@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@$...... ,!... *!...~:..=@@@@,..!........,@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@$-----,$!:::!@=---:;~-#@@@@;::*--------~@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@~..*@@@$*-*@@!@@@@@@@@@$=*:!@@@@#=*:#@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@#:....*@:...-@@..$@##*~....  :##*,....,#@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@!...,..*#..  @#.. ,-.....    :..   ....-@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@!...=*...!~.. ==...:~....     :    :. ...:@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@*...*@@-..-*...*!...=:....~*$#@@.   @#;...~@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@-...$@@~..-#,..:;  .@;. .....*@@,  .@@$   :@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@~....$=...-@!...;. !@!  ..   *@@,   #@*. ~@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@*.....-...-@$.....,#@*  ...*#@@@~   .,. :@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@!........$@@-....,@@=.  ,;;;;;@:    . ~#@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@!.....,$@@@$....=@@#         @;      .;#@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@:~~~~$@@@@@,..,@@@#        .@!   .  .. !@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!  ~@@@@@@@@@@@@@@*..,#*,   ;@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!*#@@@@@@@@@@@@@@#**$@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
													Thread.sleep(20);
													System.out.println(
															"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
												} catch (InterruptedException e) {
													System.err.format("IOException: %s%n", e);
												}
												break;
											}
										}
									}

									if (fail < 5) {
										// System.out.println("========== WINNER!!! ==========");
										try {
											System.out.println(
													"\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~-@@@@-*@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@-:@@ -@@#,@@ @@@.-@@@,=@@~-@@@-;@* ....=-@...  .=@@@~ @@@@.!@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@:~@@ -@@..@@ @@@. @@@,=@@~ @@@,;@@;-$$$##@# #$#$ @@@. @@@@ *@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@*.@@  @@ @@@ #@@. -@@.=@@~ ,@@.;@@!~@@@@@@@ @@@@ @@@. @@@@ !@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@ @=  !@ @@@ @@@.! =@.=@@~! !@ ;@@! ...~@@@ $@@# @@@. @@@@.*@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@ ~*-=.$ @@@ @@@.*; # =@@~*; # ;@@!~@@@@@@@     :@@@. @@@@.*@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@*  :$ *.@@@ @@@.#@,: =@@~*@:: ;@@!~@@@@@@@ =@@ @@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@  @@=.,@@@ @@@.;@@  =@@~:@@  ;@@!-@@@@@@@ @@@, @@@~!@@@@~#@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@*-@@$ @@@@ @@@.-@@: =@@~-@@; ;@@!     ,@@ @@@@ @@@. @@@@ !@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
											Thread.sleep(20);
											System.out.println(
													"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
										} catch (InterruptedException e) {
											System.err.format("IOException: %s%n", e);
										}
									}
								} // 게임 끝난 다음 점수 계산 및 갱신

								System.out.println("\r\n당신의 점수는 " + sum + "점 입니다.");
								if (sum > vo.getScore()) {
									memno = vo.getMemno();
									id = vo.getId();
									password = vo.getPassword();
									name = vo.getName();
									score = sum;

									dao = new GameDAO();
									result = dao.updateScore(memno, id, password, name, score);

									if (result == true) {
										System.out.println("\r\n점수를 갱신하였습니다.");
									} else {
										System.out.println("\r\n점수 갱신 실패");
									}
								} else {
									System.out.println("\r\n더 높은 기록이 있으므로 갱신하지 않습니다.");
								}
								sum = 0;
								fail = 0;
								break;

							case 2: // 오답노트 관련
								System.out.println();
								System.out.println("[2]오답 노트 확인");
								System.out.println("============== 오답 노트 ==============");

								dao = new GameDAO();
								System.out.println("접속 ID: " + vo.getId());
								ArrayList<WrongVO> al3 = dao.WrongselectStd(vo.getId()); // 여기는 그냥 id
								for (int i = 0; i < al3.size(); i++) {
									vo2 = al3.get(i);
									System.out.print((i + 1) + "번 문제: ");
									// System.out.print(vo2.getWrno()+"\t"+"|");
									System.out.print(vo2.getQuestion() + "\t" + "|");
									System.out.print(vo2.getAnswer() + "\t");
									System.out.println();
								}
								System.out.println("\r\n[1]오답 노트 비우기 [2]메뉴로 나가기");
								System.out.print("메뉴를 선택하세요: ");
								int delete = sc.nextInt();
								if (delete == 1) {
									dao = new GameDAO();
									result = dao.deleteWrong(vo.getId());
									if (result == true) {
										System.out.println();
										System.out.println("오답 노트 비우기 성공!");
										System.out.println();
										break;
									} else {
										System.out.println("오답 노트 비우기 실패");
										break;
									}
								} else if (delete == 2) {
									System.out.println();
									System.out.println("[2]메뉴로 나가기");
									System.out.println();
									break;
								}

							case 3: // 랭킹 관련
								System.out.println();
								System.out.println("[3]랭킹 확인");
								System.out.println("============== 랭킹 화면 ==============");

								dao = new GameDAO();
								ArrayList<MemberVO> al = dao.RankselectStd();
								for (int i = 0; i < al.size(); i++) {
									vo = al.get(i);
									System.out.print((i + 1) + "등: ");
									// System.out.print(vo.getMemno()+"\t"+"|");
									System.out.print(vo.getId() + "\t" + "|");
									System.out.print(vo.getName() + "\t" + "|");
									System.out.print(vo.getScore() + "\t");
									System.out.println();
								}
								break;

							case 4: // 메뉴에서 게임 종료
								System.out.println("\r\n로그아웃 되었습니다. 다시 선택해주세요.\r\n");
								break;
							}
							if (menu == 4) {
								break;
							}
						}
					}
				}
			}

			if (start == 3) {// 로그인 화면에서 완전히 종료
				// System.out.println("[3]게임 종료");
				try {
					System.out
							.println("\r\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
					Thread.sleep(20);
					System.out
							.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
					Thread.sleep(20);
					System.out
							.println("@@@@@@@=@=====@@=@@@@@@@@@@@@@@@@@@@=====$#@@@@@@@@@@@@@@@=@@@@@@@@@@@@@@@@@@@");
					Thread.sleep(20);
					System.out
							.println("@@@@@@@@@@ @@@@@ *@**@@@@**~*=@@@@@@! @@@@@@@**$**@@@@**** @@@@@@@@@@@@@@@@@@@");
					Thread.sleep(20);
					System.out
							.println("@@@@@@@@@@ @@@@@ :@: #@@; :;:.@@@@@@! !!!*@@@ ~*: $@@!.::: @@@@@@@@@@@@@@@@@@@");
					Thread.sleep(20);
					System.out
							.println("@@@@@@@@@@ @@@@@ @@@ *@@ ,;;; @@@@@@= ;;;!@@@ #@@ !@@ *@@@ @@@@@@@@@@@@@@@@@@@");
					Thread.sleep(20);
					System.out
							.println("@@@@@@@@@@ @@@@@ @@@ =@@ *;;;;@@@@@@= @@@@@@@ #@@ !@@ @@@@ @@@@@@@@@@@@@@@@@@@");
					Thread.sleep(20);
					System.out
							.println("@@@@@@@@@@ @@@@@ @@@ =@@ :;##!@@@@@@! @@@@#@@ $@@ !@@ :### @@@@@@@@@@@@@@@@@@@");
					Thread.sleep(20);
					System.out
							.println("@@@@@@@@@@~@@@@@ @@@ !@@*  --.@@@@@@; ~~~~-@@ $@@ :@@* ---,@@@@@@@@@@@@@@@@@@@");
					Thread.sleep(20);
					System.out
							.println("@@@@@@@@@@#@@@@@=@@@=#@@@=====@@@@@@#======@@=@@@=$@@@====$@@@@@@@@@@@@@@@@@@@");
					Thread.sleep(20);
					System.out
							.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
					Thread.sleep(20);
					System.out
							.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				} catch (InterruptedException e) {
					System.err.format("IOException: %s%n", e);
				}
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					System.err.format("IOException: %s%n", e);
				}
				break;
			}
		}
	}
}