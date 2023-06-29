package com.iu.study3;

public class Array1 {

	public static void main(String[] args) {
		// 배열 (Array) 
		int num = 0;
		int num2 = 2;
		double d = 3.12;
		
		// 데이터타입 변수명 => 변수 선언 규칙이니까 배열도 순서는 같다
		// 배열을 담는 부분이 추가될뿐!
		// 모을려고 하는 데이터타입 [] 변수명 = new 모으려고하는데이터타입[갯수];
		int [] nums = new int [2];
		double []avgs = new double[3];
		char []chs = new char[3];
		boolean [] checks = new boolean[3];
		
		// 실제 값이 들어간 primitive 타입
		// num을 출력하면 실제로 대입되어있는 1이 출력된다.
		System.out.println(num);
		
		// 하지만 nums를 출력하면 [I@7d6f77cc 이 나온다 (컴퓨터마다 다를 수 있음)
		// I@ => int값을 모은 변수다
		System.out.println(nums);

		// 배열 사용 : 배열의변수명[인덱스번호], index번호 정수타입(int)
//		nums[0]=2;
		
		// int타입이라 초기값인 0이 출력된다.
		System.out.println(nums[0]);
		
		// double타입이라 0.0이 출력된다. 
		System.out.println(avgs[0]);
		// char타입 출력되긴 하는데 깨진것같은 글자가 출력
		System.out.println(chs[0]);
		// boolean타입 false 출력
		System.out.println(checks[0]);
		
		
		
		//문자열 3개를 모을 배열 선언
		String [] names = new String [3];
		
		// [Ljava.lang.String;@5aaa6d82
		// 어쩌구 String;@ => String값을 모은 변수
		System.out.println("names 출력 : " + names);
		System.out.println("names[0] 출력 : " + names[0]);
		
		
		// 배열에 값을 미리 넣어놓을 수도 있다.
		// 1,2,3의 값이 들어있는 배열을 만들겠다!
		int [] nums2 = {1,2,3};
		
		
		// 이렇게도 작성할 수 있지만 대괄호가 변수명 앞에 오는 것이
		// 배열이라는 것을 더 잘 보여주기 때문에 선호된다. 아래는 비추!
		int nums3 [] = new int [3];
		
		// 배열에 주소를 대입 => 이해안됨
		nums = nums2;
	}

}
