package com.iu.study2;
import java.util.Scanner;

public class Study3_ex1 {

	public static void main(String[] args) {

		// 국어, 영어, 수학 입력
		// 총점, 평균 계산 (평균은 int)
		// 90:A, 80:B, 70:C, 60:D, 그 외:F
		// switch사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해주세요 >> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력해주세요 >> ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력해주세요 >> ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int avg = total / 3;
		
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + avg + "점");
		
		
		switch(avg/10) {
			case 10 :
			case 9 :
				System.out.println("A");
				break;
			case 8 :
				System.out.println("B");
				break;
			case 7 :
				System.out.println("C");
				break;
			case 6 :
				System.out.println("D");
				break;
			default :
				System.out.println("F");
		}

	}

}
