package com.iu.study2;

public class Study4_for_ex1 {

	public static void main(String[] args) {
		
		/*
		// 0-10 미만의 숫자 중에서 짝수만을 출력해주세요.
		for (int i=0; i<10; i++) {
			if(i%2==0 && i!=0) {
				System.out.println(i);
			}
		}
		*/
		
		/*
		// 0-10 미만의 숫자 중에서 짝수만을 출력해주세요.
		// 단, if문 사용 X
		for (int j=0; j<10; j=j+2) {
			System.out.println(j);
		}
		*/
		
		// A부터 Z까지 출력
		for(int eng=97; eng<=122; eng++ ) {
			System.out.print((char)eng + ",");
		}
		
		for(int c='a'; c<='z'; c++) {
			System.out.println((char)c);
		}
	}

}
