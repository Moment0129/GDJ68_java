package com.iu.study4.s1;

public class Hap {
	//               ▼ 2개의 정수를 받아와서 합하기 위해서 가져오려고함
	public int h1(int num1, int num2) {
		//   ▲ 리턴하고싶어하는 데이터타입을 넣어준다.
		//     이전까지는 없어서 void로 두었었음.
		int sum = num1 + num2;
		System.out.println(sum);
		return sum;
	}
	
	public boolean h2(int num) {
		// 홀수면 true를 리턴
		// 짝수면 false를 리턴
		
		boolean result = false;
		
		if (num%2!=0) {
			// result = true;
			result = !result;
		}
		
		return result;
		
	}
	
	public int [] h3(int count) {
		// count 수만큼 정수를 담을 배열을 만들어서 리턴
		int [] array = new int [count];
		
		// ▲ heap에 있는 데이터까지 받아서 리턴하려면 바로 위의 방법으로 하는게 맞지만
		// ▼ 지금은 배열 형태만 리턴하는거라 아래처럼 해도 상관없다.
		
//		return new int[count];
		
		return array;
	}
}
