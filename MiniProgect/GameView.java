package com.Game;

import java.util.Scanner;
import java.util.ArrayList;

import com.DAO.GameDAO;
import com.VO.MemberVO;

public class GameView {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);

			System.out.println("========== 시작 화면 =========="); // 텍스트 이미지를 사용한다면 여기

			System.out.println("팀 이름: ****** ");
			System.out.println("팀원: 김지은, 박승현, 송영지, 한우규");
			System.out.print("=====================================");
			String sp = sc.nextLine();
			
			int memno = 0;
			String id = null;
			String password = null;
			String name = null;
			int score = 0;

			String temp = null;

			MemberVO vo = null;
			GameDAO dao = null;
			boolean result = false; // 기본적으로 실패라 해놓고 성공했을 때만 성공으로 뜨게 한다

			while (true) {
				System.out.println("[1]회원가입 [2]로그인 [3]게임 종료 ");
				System.out.print("메뉴 선택 해주세요.");
				int start = sc.nextInt();
				switch (start) {
				case 0:
					dao = new GameDAO();
					dao.isLogin("abc", "1111");
				case 1:
					System.out.println("[1]회원가입을 위해 ID, Password, Name을 입력해주세요.");

					System.out.print("아이디: ");
					id = sc.next();
					System.out.print("비밀번호: ");
					password = sc.next();
					System.out.print("이름: ");
					name = sc.next();

					dao = new GameDAO();
					// 이 부분이 포인트
					result = dao.insertStd(id, password, name, score);
					if (result == true) {
						System.out.println("회원가입 성공했습니다.");
					} else {
						System.out.println("회원가입 실패했습니다. 다시 확인해주세요.");
					}
					break;
				case 2:
					System.out.println("[2]LogIn");
					System.out.print("ID : ");
					id = sc.next();
					System.out.print("PW : ");
					password = sc.next();
					
					dao = new GameDAO();
					vo = dao.oneSelectStd(id);
					if(vo.getMemno() > 0) {
						System.out.println("[2]LogIn 해주세요");
						System.out.print(vo.getMemno() + "\t");
						System.out.print( vo.getId() + "\t");
						System.out.print(vo.getPassword() + "\t");
						System.out.println();	
					} else {
						System.out.println("아이디 혹은 비밀번호가 잘못되었습니다. 다시 확인해주세요.");
					}	
					break;
				
				case 3:
					System.out.println("[3]게임 종료");
				}
				if (start == 3) {
					break;
				}
			}
		}
	}
}
