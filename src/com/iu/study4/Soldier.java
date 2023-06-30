package com.iu.study4;

public class Soldier {
	
	String grade;
	int num;
//	Rifle rifle; // 클래스 안에 또 다른 클래스를 변수로 가질 수도 있다.
	int [] ar;
	
	public void attack(int count) {
		Rifle rifle = new Rifle();
		rifle.shoot1(count);
	} 
}
