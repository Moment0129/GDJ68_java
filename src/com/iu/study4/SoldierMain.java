package com.iu.study4;

public class SoldierMain {

	public static void main(String[] args) {
		// 실제 주소값이 저장된 매개변수(soldier)를 참조변수라고 한다.
		// 참조변수를 참조해서 찾아가라~
		Soldier soldier = new Soldier();
		int b = 10;
		
		soldier.attack(10);	// 인자값 (갯수 무제한, 타입 상관 없음)

	}

}
