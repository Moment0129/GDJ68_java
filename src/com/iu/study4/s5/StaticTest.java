package com.iu.study4.s5;

public class StaticTest {
	
	public int instanceNum;
	
	public static int staticNum;
	
	public void instanceMethod() {
		StaticTest.staticNum = 50;
		instanceNum = 20;
		StaticTest.staticMethod();
		System.out.println("멤버메서드");
	}
	
	public static void staticMethod() {
//		this.
//		this는 객체를 선언하고 주소를 저장하기 위해 자동적으로 생겨나는데
//		static 메서드는 선언을 하지 않아도 사용 가능하기 때문에
//		this는 사용할 수 없다.
		
		StaticTest.staticNum = 20;
//		instanceMethod();
//		instanceNum = 50;
//		위의 instanceMethod();과 instanceNum를 쓰면
//		오류가 나는데, 그 객체와 메서드들은 객체선언을 따로 해주지 않았기
//		때문에 다른 메서드에서 사용이 불가능한 것 이다.
//		그에반해 static객체와 메서드는 Method영역이 메인클래스를 찾기위해
//		쭉 훑으며 인식하여 자동으로 객체생성이 되었기 때문에
//		별도의 객체생성 없이도 바로 사용가능한 것이다.
		System.out.println("클래스메서드");
	}
	
}
