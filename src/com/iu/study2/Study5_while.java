package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		Random random = new Random();
		
		// 0 이상 10 미만 랜덤으로 돌려 숫자 출력함.
		int result = random.nextInt(10);
		
		while(check) {
			System.out.println("0부터 10미만 숫자를 입력하세요");
			
			int num = sc.nextInt();
			
//			result값이 내가 입력한 값과 같다면
			if(result==num) {
				System.out.println("정답입니다.");	
				check =! check;
				// 반복문 안에서 break를 못쓰는 경우, switch-case문엔 쓰지못함.
				break;
			}
			else {
				System.out.println("틀렸습니다.");
			}
		} 
		System.out.println("While문 종료");

	}
}