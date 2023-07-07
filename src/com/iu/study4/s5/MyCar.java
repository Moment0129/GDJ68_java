package com.iu.study4.s5;

public class MyCar {
	// static 클래스변수를 초기화하는 두가지 방법(①,②) 
	//                               ① 직접 초기화하기
	public static String company = "Kia";
	public String brand;
	
	static{
		// ② static 초기화 블럭으로 초기화
		MyCar.company = "AUDI";
	}
	
	// static 클래스 변수는 아래의 문법은 사용이 불가하다.
	// (객체생성을 따로 해주지 않으니까!!)
	{}// 객체 생성시
	public MyCar() {} // 객체 생성시
	// setter : 객체 생성 후
	

}
