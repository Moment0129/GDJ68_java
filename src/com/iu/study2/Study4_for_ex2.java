package com.iu.study2;

import java.util.Scanner;

public class Study4_for_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 로그인 아이디(id), 비밀번호(pw)
		int id = 1234;
		int pw = 5678;

		// 로그인 횟수
		int loginSum = 0;
		
//		// 로그인 성공은 1/실패는 2
//		int login = 2;
		
		boolean check = false;


		
		// 로그인 시도는 최대 5번까지
		for (loginSum=1; loginSum<=5; loginSum++) {
			
			// 아이디, 패스워드 입력
			System.out.print("ID : ");
			int yid = sc.nextInt();
				
			System.out.print("PW : ");
			int ypw = sc.nextInt();
				
			if(id==yid && pw==ypw) {
				System.out.println("로그인 성공");
				loginSum = 5;
				check = true;	// check != check;
			} else {
				System.out.println(loginSum + "번 틀렸습니다.");
				System.out.println("ID와 PW를 다시 입력해주세요.");
			}
			
			
		}
		
		// 로그인 성공시 급여계산 출력
		if(check) {
		System.out.println("1.정규직, 2.계약직");
		int select = sc.nextInt();
		System.out.println("급여 입력");
		int salary = sc.nextInt();
		
		switch(select) {
		case 1:
			double tax1 = salary * 0.03;
			tax1 = tax1 + salary * 0.02;
			tax1 = tax1 + salary * 0.01;
			tax1 = tax1 + salary * 0.01;
			salary = (int)(salary-tax1);
			System.out.println("실 급여 : " + salary);
			break;
		case 2 :
			salary = (int)(salary*0.967);
			System.out.println("실 급여 : " + salary);
		case 3 :
			System.out.println("잘못 누르셨습니다.");
		}
	}
		
		/*
		// 직급 선택 1번 정규직 / 2번 계약직
		int select = 1;
		
		// 급여
		int sal = 0;
		
		// 실급여
		int sil = 0;
		
		switch(login) {
		case 1 :
			System.out.print("정규직은 1번, 계약직은 2번을 눌러주세요. >> ");
			select = sc.nextInt();
			
			System.out.print("급여를 입력해주세요. >> ");
			sal = sc.nextInt();
			
				switch(select) {
					case 1 : //             건강보험 3%,     국민연금 2%,      고용보험 1%,     산재보험 1%
						sil = (int)(sal - (sal*0.03f) - (sal*0.02f) - (sal*0.01f) - (sal*0.01f));
						break;
					case 2 : //			   원천징수 3.3%
						sil = (int)(sal - (sal*0.033f));
						break;
					default :
						System.out.println("잘못 누르셨습니다.");
						System.out.println("다시 시도해주시기 바랍니다.");
						break;
			}			

			System.out.println("실급여 : " + sil);
			break;
			
		default :
			break;
		}
		
		*/
		
		System.out.println("프로그램 종료");
	}
}

