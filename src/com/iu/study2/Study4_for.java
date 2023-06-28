package com.iu.study2;

import java.util.Scanner;

public class Study4_for {

	public static void main(String[] args) {
		
		
		/*
		for (int i=0; i<5; i++) {
			System.out.println("hello");
		}	// 증감식을 없애거나 조건에 따라 출력이 계속된다!
		*/
		
		/*----------------------------------------*/
		
		/*
		int j =567;
		for(j=0; j<3; j--) {
			
		}
		*/
		
		//---------------
		Scanner sc = new Scanner(System.in);
		
		// hello 출력
		// 키보드로부터 출력 횟수를 입력받음
		
		System.out.print("숫자를 입력해주세요. >> ");
		int num = sc.nextInt();
		
		for (int i=0; i<num; i++) {
			System.out.println("hello");
		}
		
		/*
		// 또 다른 방법
		for (int i=num; i>0; i--) {
			System.out.println("hello");
		}
		*/
		
		
	}

}
