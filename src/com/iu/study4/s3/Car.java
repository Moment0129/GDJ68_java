package com.iu.study4.s3;

public class Car {
	
	String company;	// 접근지정자에 아무것도 없어서 default
	String brand;
	String color;
	int price;
	
	// 생성자(Constructor)
	// 접근지정자 클래스명과동일한이름([매개변수들 선언]){}
	public Car() {
		// 기본생성자
		
		// this() : 생성자 내에서 또 다른 생성자를 불러낼 때 사용하는 문법
		//			반드시 메서드 내의 맨 윗줄에 위치해야한다!!
		this("A7");
		// ▲ 매개변수 쪽이 비어있을 경우 매개변수가 없는 생성자를 호출한다.
		//   지금은 매개변수가 String 타입으로 한 개인 생성자를 호출한 상태임.
		//   매개변수가 하나인 생성자에서 brand에 "A7"가 들어간 상태로 호출됨!
		// ▼ 따라서 아래의 호출문은 필요가 없어진다.
		this.company = "AUDI";
		this.color = "PINK";
		this.price = 9985;
		System.out.println("===================");
	}
	
	public Car(String brand) {
		this.company = "AUDI";
		this.brand = brand;
		this.color = "PINK";
		this.price = 9985;
	}
	
	public Car(String brand, String color) {
		this.company = "AUDI";
		this.brand = brand;
		this.color = color;
		this.price = 9985;
	}
	
	public Car(String brand, String color, int price) {
		this.company = "AUDI";
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	
	public void info() {

		System.out.println("Company : " + this.company);
		System.out.println("Brand : " + this.brand);
		System.out.println("Color : " + this.color);
		System.out.println("Price : " + this.price + "만원");
	}
}
