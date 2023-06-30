package com.iu.study4;

public class Rifle {
	
	boolean mod; // true=단발, false=점사
	
	// 주석에 나오는 대괄호[]는 넣어도 되고 안 넣어도 되는 옵션!!!
	// 메서드 선언 공식
	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){실행 코드}
	// public static void main(String [] args)
	
	// int count 또한 메서드 안에 선언된 인스턴스 변수
	public void shoot1(int count) {
		int damage = 20;
		for(int i=0; i<count; i++) {
			System.out.println(i+1 + "번 탕");			
		}
//		count = 10;
		// 여기서 count에 10을 대입해도 shoot 메서드는 실행 후 삭제 되며,
		// 그 이후에 main 메서드가 이어서 실행되기 때문에 count는 RifleMain에서
		// b에 입력한 값이 출력되게 된다.
		// (= 주소를 대입한 것이 아니기 때문에 소용없다)
	}
	
	// shoot2
	public void shoot2(int c, String n, int [] ar) {
		System.out.println("타타탕");
	}
	
}
