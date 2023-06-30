package com.iu.study3;

public class Array6 {

	public static void main(String[] args) {
		double [] ar = new double [3];
		ar[0] = 1.2;
		ar[1] = (double)3;
		
		int [] nums1 = new int[3];
		int [] nums2 = new int[3];
		System.out.println(nums1 == nums2);
		nums1 = nums2;
		System.out.println(nums1 == nums2);
		// 데이터타입 [] 변수명
//		int [][] ars = new int[2][2];
		
		int [][]ars = {{1,2}, {3,4}};
		
		// 한 배열 안에 두 개의 배열이 있고, 가변배열이다.
		// 아래의 배열 선언처럼 배열 안의 두 배열이 각자 크기가 달라고 된다.
		ars = new int[2][];
		ars[0] = new int[3];
		ars[1] = new int[6];
		// {{0,0,0}, {0,0,0,0,0,0}};
		
		
		for(int i=0; i<ars.length; i++) {
			for(int j=0; j<ars[i].length; j++) {
				System.out.println(ars[i][j]);
			}
		}	// for문 끝

	}
}
