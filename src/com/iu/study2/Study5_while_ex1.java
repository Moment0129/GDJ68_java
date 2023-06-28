//package com.iu.study2;
//
//import java.util.Scanner;
//
//public class Study5_while_ex1 {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		// while문 사용
//		// 1.로그인 시도 / 2.프로그램 종료
//		
//		boolean login = true;
//		
//		int sijak = 1;
//		
//		int id = 1234;
//		int pw = 5678;
//		
//		System.out.println("1번을 누르면 로그인, 2번을 누르면 프로그램 종료");
//		System.out.print("입력 : ");
//		sijak = sc.nextInt();
//		
//		switch(sijak) {
//			case 1:
//				while(login) {
//					System.out.print("ID : ");
//					int yid = sc.nextInt();
//					System.out.print("PW : ");
//					int ypw = sc.nextInt();
//						
//					if(id==yid && pw==ypw) {
//						System.out.println("로그인 되었습니다.");
//						login =! login;
//							
//						break;	
//					} else {
//						System.out.println();
//						System.out.println("ID 또는 PW가 틀렸습니다.");
//						System.out.println("다시 시도해주세요.");
//						System.out.println();
//					}
//					
//				}
//				
//			case 2:
//				System.out.println();
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			
//		
//		}
//		
//	}
//
//}
//


/*------------------------------------------------------------*/



//package com.iu.study2;
//
//import java.util.Scanner;
//
//public class Study5_while_ex1 {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		// while문 사용
//		// 1.로그인 시도 / 2.프로그램 종료
//
//		int id = 1234;
//		int pw = 5678;
//		
//		boolean check = true;
//		int a = 1;
//		while(check) {
//			System.out.println("1.로그인 2.종료");
//			int select = sc.nextInt();
//			if(select==1) {
//				System.out.println("ID 입력");
//				int yId = sc.nextInt();
//				System.out.println("Pw 입력");
//				int yPw=sc.nextInt();
//				if(id==yId && pw==yPw) {
//					System.out.println("로그인 성공");
//					break;
//				}else {
//					System.out.println("로그인 실패");
//				}
//			}else {
//				break;
//			}
//			
//		} // while 끝
//		
//		
//		// 로그인 성공 했을 때만 진행
//		
//		System.out.println("프로그램을 종료합니다.");
//		
//	}
//
//}

/* ------------------------------------------------------------------*/

package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 로그인 성공했을 때만 진행
		// MMORPG
		// 시작레벨 : 1
		// 모든 몬스터의 경험치는 동일
		// 최대 레벨 : 15
		// GOLD : 0
		// 최초 5레벨 달성시 : 1000gold 지급
		// 10레벨 달성시 : 2000gold 지급
		// 15레벨 달성시 : 3000gold 지급
		
		// 레벨 1 -> 레벨 2 : 3마리 (사냥성공)
		// 레벨 2 -> 레벨 3 : 6마리
		// 레벨 3 -> 레벨 4 : 9마리
		// 레벨 4 -> 레벨 5 : 12마리
		// ...
		// 레벨 14 -> 레벨 15 : 42마리
		// 렙업시 게임을 계속할지 종료할지 선택
		
		// 현재 레벨, GOLD가 출력
		
		// 아이디, 비밀번호
		int id = 1234;
		int pw = 5678;
		

		
		// 아이디 입력
		System.out.print("ID : ");
		int yid = sc.nextInt();
		
		// 비밀번호 입력
		System.out.print("PW : ");
		int ypw = sc.nextInt();
		
		// 레벨
		int level = 1;
		
		// 사냥 여부
		int hunt = 0;
		
		// 잡은 몬스터의 수
		int mon = 0;
		
		// 골드
		int gold = 0;
		
		
		
		for(level=1; level<15; level++) {
			
			System.out.println("몬스터를 잡으시겠습니까?");
			System.out.println("1-잡는다 / 2-종료");
			hunt = sc.nextInt();
			
			if(hunt==1) {
				System.out.println("몬스터 사냥에 성공하셨습니다!");
				mon++;
				
				if(mon%3==0) {
					System.out.println("축하합니다!");
					System.out.println("레벨 " + (level+1) + "이 되었습니다.");
					break;
				}
			} else {
				break;
			}
		}
		
		

	}
}
