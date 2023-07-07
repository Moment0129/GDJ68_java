package com.iu.study5.s1;

public class Magician extends Character {
	
	private int mp;

	
	
	/* getter setter -----------------------*/
	

	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	/* ------------------------------------ */
	
	// 생성자
	// 생성자는 상속이 불가능하기 때문에 super();로 부모 생성자를
	// 직접 호출하는 방법밖에 없다.
	public Magician() {
		super(); // 부모 생성자 호출. (생략 가능)
				 // 항상 첫 줄에 위치해야 하기 때문에 this()와 같이 쓰지 못한다.
	}
	
	
	// overriding : 수정
	// 상속받은 메서드의 내용을 자기에 맞게 재정의
	// 상속받은 메서드의 선언부는 동일.
	@Override
	public void hit() {
		System.out.println("파이어볼");
		super.hit();
	}
	
}
