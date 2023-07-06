package com.iu.study4.s3;

public class Phone {
	
	String company = "APPLE";
	String brand = "IPHONE15";
	
	{
		// Instance 초기화 블럭
		// 보통 여기서 멤버변수 초기화를 한다.
		this.company = "LG";
		this.brand = "가로본능";
	}
	
	public Phone() {
		// 원래 선언되어있던 것을 덮어씌운다.
		this.company = "SAMSUNG";
		this.brand = "S20";
	}
	
	public void info() {
		System.out.println("Company : " + this.company);
		System.out.println("Brand : " + this.brand);
	}
	
}
