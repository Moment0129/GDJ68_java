package com.iu.study5.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Worrier worrier = new Worrier();
		worrier.getItem();
		Magician magician = new Magician();
		magician.getItem();
		
		worrier.hit();
		magician.hit();
		
//		Animal animal = new Animal();
		// Animal 클래스의 선언부에 abstract를 쓰게되면
		// 위의 객체 선언에 오류가 뜨게된다.
		// abstract가 붙게되면 상속해주는 역할만 하게된다.
		
		
		// 다형성 ★★★★★
		// 상속관계에서만 가능
		// worrier.axe.name;
		Character character = magician;
		character = worrier;
		
		
		// 마차(=배열)에 워리어도 매지션도 태우고싶은데
		// ▼ 아래처럼 선언하게 되면 워리어와 매지션 따로 선언해서
		// ▼ 따로 태우는 방법밖에 없음.
//		Worrier [] w = new Worrier[2];
		
		// 하지만 부모클래스를 가져와서 배열선언한다면
		// 한 마차에 워리어도, 매지션도 태울 수 있다!!
		// Character
		Character [] w = new Character[2];
		w[0] = worrier;
		w[1] = magician;
		
		// 모든 캐릭터가 워리어가 아니듯,
		// 모든 캐릭터가 매지션이 아니라서
		// 무엇이 들어있는지 모를 w[0] 배열을 다른 값에 넣을 때
		// 형변환 해주는거라 생각하면 된다.
		worrier = (Worrier)w[0];
		magician = (Magician)w[1];
		
		// worrier과 magician을 둘 다 사용하고 싶어서 Character 타입으로 선언을 했는데
		// 그렇게 되면 
		magician = (Magician)w[1];
		magician.setMp(20);
		
	}
}
