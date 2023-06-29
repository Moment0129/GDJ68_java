package com.iu.study3;

public class Array3 {

	public static void main(String[] args) {
		
		
		// 한번 선언된 배열의 크기(갯수)는 바꿀 수 없다.
		// 따라서 '그렇게 보이도록' 하는 방법밖에 없음!!
		
		
		// 배열명.length
		// 배열의 길이를 모를 때 쓸 수 있는 방법.
		// length를 쓰면 배열의 길이를 알 수 있다.
		int [] nums = {1,2,3,4,5};
		System.out.println(nums.length);
		
		// length 사용예시
		// nums 배열에 데이터 한 칸만 더 추가하고싶다!
		// 하지만 이미 선언된 배열의 길이를 중간에 바꿀 수는 없기 때문에
		// 또 다른 배열 copyNums을 선언하면서 기존의 배열보다
		// 배열 한 칸을 더 만드는 방법밖에 없다.
		//                        선언하며 한 칸 더 생성
		//							▼▼▼▼▼▼▼▼▼▼▼
		int [] copyNums = new int [nums.length+1];
		
		// nums에 있는 값을 copyNums에 복사
		for(int i=0; i<=nums.length-1; i++) {
			copyNums [i] = nums [i];
		}
		
		copyNums[nums.length] = 5;
		
//		// copyNums 출력
//		for(int i=0; i<nums.length-1; i++) {
//			System.out.print(copyNums[i] + ",");
//		}
		
		// heap에서 nums의 주소가 100, copyNums의 주소가 200이라면
		// stack에서 둘의 주소도 동일해진다.
		nums = copyNums;
		
		// nums : 5칸
		// copyNums를 4칸으로 만들기
		
		copyNums = new int [nums.length-1];	// 4
		

		for(int i=0; i<copyNums.length-1;i++) {
			copyNums [i] = nums[i];
		}
		
		for(int i=0; i<copyNums.length-1; i++) {
			System.out.print(copyNums[i] + ",");
		}
		
	}

}
