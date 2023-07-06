package com.iu.study4.s2;

public class Chef {
	
	String name;
	
	public void makeRamyun2(Ramyun [] ramyuns) {
		for(int i=0; i<ramyuns.length; i++) {
			Ramyun ramyun = new Ramyun();
			ramyun.title = "진라면";
			ramyun.price = 3000;
			ramyuns[i] = ramyun;
		}
	}

	public Ramyun [] makeRamyun(int count) {
		
//		Ramyun ramyun = new Ramyun();
//		Ramyun ramyun2 = new Ramyun();
//		ramyun2 = ramyun; // 이것도 가능
//		ramyun2 = new Ramyun();		
//		int num = 2;
//		num = 3;
		
		// 쟁반에 라면 모아놓은 배열
		Ramyun [] ramyuns = new Ramyun[count]; 
		
		for(int i=0; i<count; i++) {
			// 라면 만들기
			Ramyun ramyun = new Ramyun();

//			// 아래의 경우는 라면을 놓을 공간만 마련한 것이기 때문에
//			// 실제로 라면이 놓인 상태는 아님.
//			ramyuns[i].title = "진라면";
//			ramyuns[i].price = 3000;
			
			ramyun.title = "진라면";
			ramyun.price = 3000;
			
			// 라면 담기
			ramyuns[i] = ramyun;
			
			System.out.println(ramyuns[i]);
			System.out.println(ramyun);
			
		}
		
		
//		Ramyun r1 = new Ramyun();
//		return r1;

//		// ▲ 라면을 한개한개 줄 필요없이
//		// ▼ 라면을 담아놓은 배열을 리턴해주면 된다.
		
		count = 50;
		return ramyuns;
	}
	
	public void makeKimbap() {
		
	}
}
