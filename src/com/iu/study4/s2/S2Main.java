package com.iu.study4.s2;

import java.util.Scanner;

public class S2Main {

	public static void main(String[] args) {
		
		// 메인 메서드가 하는 일
		// 1. 프로그램 실행
		// 2. 테스트 용도
		
		// student 객체
//		StudentService sv = new StudentService();
//		Student student = sv.makeStudentOne();
//		System.out.println(student.avg);
		
		/*---------------------------------------------*/
		
		StudentController studentController = new StudentController();
		studentController.start();
		

		/*---------------------------------------------*/
		
		
		// Chef 객체
//		Chef chef = new Chef();

		
		/*---------------------------------------------*/
		
		
//		Chef chef2 = new Chef();
//		chef객체를 두번 생성하는 것은 효율적이지 않음
//		그래도 가끔 같은 메서드를 객체생성하는 경우가 있긴함.
		
		
		/*---------------------------------------------*/
		
		
//		// 셰프가 끓인 라면 가져오기 
//		Ramyun ramyun = chef.makeRamyun(1);
		
//		// Chef에 선언된 것과는 다른 객체지만
		// 쉽게 말하자면 셰프가 끓은 라면을 가져온 것이 아닌
		// 서빙하는 사람이 끓은 또 다른 라면이라는 뜻이 된다.
//		Ramyun r1 = new Ramyun();
		
//		Ramyun [] ramyuns = chef.makeRamyun(3);
		
		
		/*---------------------------------------------*/
		
		
//		// 종업원이 라면을 올려둘 쟁반
//		// 쟁반을 보고 몇 개의 라면을 만들어야 하는지 셰프에게 알려주기
//		Ramyun [] ramyuns = new Ramyun[2];
//		chef.makeRamyun2(ramyuns);
//		System.out.println(ramyuns[0].title);
//		chef.makeKimbap();
		
		
		/*---------------------------------------------*/
		
//		int count = 2;
//		chef.makeRamyun(count);
//		System.out.println(count);
		
		

	}

}
