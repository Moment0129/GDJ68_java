package com.iu.study4.s3;

public class Test {
	
	int num1;
	double num2;
	
	
	// 메소드 오버로딩 

	public void hap(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void hap(int n1, float n2) {
		System.out.println(n1+n2);
	}
	
	
	
	
	public void hap(int num1) {
		System.out.println(this.num1+num1);
	}

	
	public boolean same(Test t) {
		// num1과 다른 객체의 num1이 같고
		// num2와 다른 객체의 num2가 같으면 true, 아니면 false 리턴
		boolean result = false;
		if(this.num1==t.num1 && this.num2 == t.num2) {
			result = true;
		}

		return result;
	}
	
	
	public void method1() {
		// ▼ 객체를 찾아가는 기존의 방법
		// 참조변수명.멤버변수명
		
		System.out.println(this.num1+num2);
		//                   ▲
		// 참조변수 this : 만들어진 객체의 주소를 담고 있는 참조변수
		// class 내부의 메서드 내에서만 사용 가능
		// 객체를 만들 때 자동으로 만들어지는 변수 (개발자가 선언하는것 X)
		
		System.out.println(this);
		method2();
		this.method2();
	}
	
	public void method2() {
		System.out.println("method2");
	}
}
