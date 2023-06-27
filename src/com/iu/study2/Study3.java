package com.iu.study2;

import java.util.Scanner;

public class Study3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 회원가입시 입력한 Data
		// int id = 1234;
		// int pw = 5678;
		
		// 로그인 과정
		// ID와 PW를 입력받아서 로그인 처리
		// 로그인 성공, 로그인 실패
		
		
		//--- 로그인 처리 후 작성
		// 로그인이 성공한 사람만 실행 가능
		// 1.정규직, 2.계약직
		// 급여 입력
		// 정규직 : 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재보험 1%
		// 계약직 : 원천징수 3.3%
		// 실급여 출력
		
		
		// 아이디 입력
		System.out.print("아이디 : ");
		int id = sc.nextInt();
		
		// 패스워드 입력
		System.out.print("비밀번호 : "); 
		int pw = sc.nextInt();
		
		// 로그인 여부
		int login = 0;
		
		// 직급
		int jic = 0;
		
		// 급여
		int sal = 0;
		
		// 실급여
		int sil = 0;
		
		
		if(id==1234 && pw==5678) {
			login = 1;
			System.out.println("로그인 성공");
		} else {
			login = 2;
			System.out.println("로그인 실패");
		}
		
		/*
		 * 위에서 로그인 여부 변수에 0을 대입한 상태니
		 * 로그인 실패일 시에는 디폴트값인 0, 성공일때만 1이 되도록
		 * 설정할 수도 있다.
		 * 
		if(id==1234 && pw==5678) {
			login = 1;
			System.out.println("로그인 성공");
		} else {
			login = 2;
			System.out.println("로그인 실패");
		}
		*/
		
		
		
		switch(login) {
		case 1 :
			System.out.print("정규직은 1번, 계약직은 2번을 눌러주세요. >> ");
			jic = sc.nextInt();
			
			System.out.print("급여를 입력해주세요. >> ");
			sal = sc.nextInt();
			
				switch(jic) {
					case 1 : //             건강보험 3%,     국민연금 2%,      고용보험 1%,     산재보험 1%
						sil = (int)(sal - (sal*0.03f) - (sal*0.02f) - (sal*0.01f) - (sal*0.01f));
						break;
					case 2 : //			원천징수 3.3%
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
		
		
		
		
		
		
		

//		if(loginResult) {
//			System.out.println("1.정규직, 2.계약직");
//			int select = sc.nextInt();
//			System.out.println("급여 입력");
//			int salary = sc.nextInt();
//			
//			switch(select) {
//			case 1:
//				double tax1 = salary * 0.03;
//				tax1 = tax1 + salary * 0.02;
//				tax1 = tax1 + salary * 0.01;
//				tax1 = tax1 + salary * 0.01;
//				salary = (int)(salary-tax1);
//				System.out.println("실 급여 : " + salary);
//				break;
//			case 2 :
//				salary = (int)(salary*0.967);
//				System.out.println("실 급여 : " + salary);
//			case 3 :
//				System.out.println("잘못 누르셨습니다.");
//			}
//		}

		
		

		
	}
}
