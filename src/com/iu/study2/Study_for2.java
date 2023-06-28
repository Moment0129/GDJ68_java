package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study_for2 {

	public static void main(String[] args) {
		// Random : 무작위 수를 뽑을 때 사용함
		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		
//		// 구구단 출력 연습
//		for(int i=1; i<10; i++) {
//			System.out.println(3 + "*" + i + "=" + 3*i);
//		}
		
		
//		// for문을 이용한 구구단 출력
//		for(int dan=2; dan<10; dan++) {
//			for(int i=1; i<10; i++) {
//			System.out.println(dan + "*" + i + "=" + dan*i);
//			}
//		}
		
		
//		for(int si=1; si<=12; si++) {
//			for(int bun=0; bun<=60; bun++) {
//				for(int cho=0; cho<=60; cho++) {
//					System.out.println(si + "시" + bun + "분" + cho + "초 입니다.");
//				}
//			}
//		}

		
		
		// 종료할 분,초를 입력받아서
		// 해당 분,초가 되면 종료
		
//		System.out.print("분 입력 : ");
//		int ymin = sc.nextInt();
//		System.out.print("초 입력 : ");
//		int ysec = sc.nextInt();
//	
//		for(int min=0; min<=ymin; min++) {
//			for(int sec=0; sec<=ysec; sec++) {
//				System.out.println(min + ":" + sec);
//			}
//		}

		
		// 전자레인지 문제
		// 선생님 코드
//		System.out.print("분 입력 : ");
//		int m = sc.nextInt();
//		System.out.print("초 입력 : ");
//		int s = sc.nextInt();
//		
//		boolean check=false;
//		
//		for(int min=0; min<6; min++) {
//			for(int sec=0; sec<60; sec++) {
//				System.out.println(min+":"+sec);
//				if(min==m && sec==s) {
//					check=true;
//					min=6;
//					break;
//				}
//			}
//		}
		
//		for(int i=0; i<5; i++) {
//			// 0부터 3 미만의 정수 한 개를 랜덤으로 뽑기
//			int num = random.nextInt(3);
//			
//			switch(num) {
//			case 0:
//				System.out.println(num);
//				i = 5;
//				break;
//			case 1:
//				System.out.println(num);
//			default:
//				System.out.println(num);
//			}
//		}
		
		System.out.println("프로그램 종료");

	}

}
