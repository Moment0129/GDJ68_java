package com.iu.study4.s5;

public class S5Main {

	public static void main(String[] args) {
//		// static                ▼ 이제 생성자 호출이라고 부르자
//		StaticTest st = new StaticTest();
//		st.instanceNum = 50;
//		// 클래스명.클래스변수명
//		StaticTest.staticNum = 20;
//		// 클래스명.메서드명();
//		StaticTest.staticMethod();
		
		MyCar.company = "AUDI";
		
		MyCar myCar = new MyCar();
		myCar.brand = "A7";
		
		System.out.println(MyCar.company);
		System.out.println(myCar.brand);
		
		MyCar myCar2 = new MyCar();
		myCar2.brand = "SL8";
		
		System.out.println(MyCar.company);
		System.out.println(myCar2.brand);
		
		// MyCar 클래스에서 많이 쓰이는 객체(company)는 아예
		// static객체로 생성해서 따로 값을 넣어주지 않아도 고정적으로
		// 같은 값을 호출할 수 있도록 할 수 있다. (편리)
	}

}
