package com.iu.study3;

import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		Random random = new Random();

		
		int [] nums = new int [6];
		

		// 번호 하나 뽑고 배열 내의 중복데이터 있나 검사
		// 중복 검사 반복문 01
		// 중복 빼기
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = random.nextInt(45)+1;
			
			for(int j=0; j<i; j++) {
				// 중복 확인 코드
				// i:0 이면 X
				// i:1 이면 0번 비교
				// i:2 이면 0,1번 비교
				// i:3 이면 0,1,2 비교
				// ...
				if(nums[i]==nums[j]) {
					i--;
				}
			}	// for(j)문 끝
		}	// for(i)문 끝
		
		
		// 배열 내 데이터 정렬하기
		// 첫번째 데이터
		
		int copyNums = 0;
		
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++)
				if(nums[i]>nums[j]) {
					copyNums = nums[i];
					nums[i] = nums[j];
					nums[j] = copyNums;
				}	
			
			
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		


	}

}
