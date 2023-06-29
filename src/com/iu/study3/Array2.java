package com.iu.study3;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		// int를 모을 배열 생성
//		int [] nums = new int [3];
		
//		//nums의 n번 인덱스에 n을 넣음 
//		nums[0] = 3;
//		nums[1] = 2;
//		nums[2] = 1;
//		
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
		
//		System.out.println(nums[3]);	// 에러!! 배열의 범위를 벗어남
		
		
//		// int [] nums = new int [10000];
//		// 10000개의 배열을 생성하게되면 하나하나 넣기 힘듦!
//		// -> 이럴 때 반복문을 쓰면 됨!!!
//		for(int i=0; i<3; i++) {
//			System.out.println(i+1 + " 번째 숫자 입력");
//			nums[i]=sc.nextInt();
//		}
		
		
		System.out.println("배열의 갯수를 입력하세요.");
		int count = sc.nextInt();
		
		int [] array = new int [count];
		
		for(int i=0; i<count; i++) {
			System.out.println(i+1 + "번째 숫자 입력");
			array[i] = sc.nextInt();
		}
		
		for(int i=0; i<count; i++) {
			System.out.print(array[i] + ", ");
		}

	}

}
