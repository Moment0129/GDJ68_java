package com.iu.study4.s5;

public final class FinalTest {	// 1.상속불가
	// final (그외 지정자)
	// final 지정자가 들어간 변수명들은 모두 대문자로 작성하는 것이 암묵적인 규칙!!
	// 두 단어로 이루어져있다면 MAX_NUM같이 스네이크(snake)방식을 사용한다.
	public final int NUM;	// 2.상수 - 한 번 입력한 값은 변경불가
	
//	// 멤버변수 초기화 방법 (깨알복습) 
//	// 1.초기화블럭
//	{
//		this.num = 20;
//	}

//	// 2.생성자
	public FinalTest() {
		this.NUM = 20;
	}
	
	public final void finalMethod() {	// 3.오버라이딩 불가
		final int a = 10;	// 얘도 상수
//		a = 20; // 그래서 이렇게 다른 값을 넣으려하면 에러가 뜬다.
	}
	
	// final은 뒤에 나올 abstract와는 정반대의 개념이다.
	// final의 특징은 상수, 상속불가, 오버라이딩 불가.
	// abstract의 특징은 상속해서 사용, 오버라이딩해서 사용.
	
	// 또한 final은 직전에 배운 그외 지정자 static과 함께 사용되곤 한다.
	// 공통적으로 적용되는 사항인데 그 값이 변해서도 안 되는 경우.
	
	// ex) 트럼프 카드 요소 중 카드의 크기
	public static final int SIZE = 50;
}
