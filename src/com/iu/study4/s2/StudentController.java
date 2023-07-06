package com.iu.study4.s2;

import java.util.Scanner;

public class StudentController {

	public void start() {
		// 각 번호 누르면 작동
		// 1.학생정보 생성 -- makeStudents 호출
		// 2.학생정보 출력 -- 1번에서 만든 학생 정보를 StudentView로 보내서 출력
		// 3.프로그램 종료
		// 1번 안 누르고 2번 누르면 null 어쩌구 뜨니까 그거 잘 생각해서 만들기.
		// main에서 StudentController를 호출
		
		Scanner sc = new Scanner(System.in);
		
		int select = 0;
		StudentService studentService = new StudentService();
		StudentView studentView = new StudentView();
		Student [] students = null;
		
		while(true){
			
			System.out.println("1.학생정보 생성");
			System.out.println("2.학생정보 출력");
			System.out.println("3.학생정보 검색");
			System.out.println("4.프로그램 종료");
			select = sc.nextInt();
			
			if(select==1) {
				// 1.학생정보 생성
//				System.out.println("1번 누름"); // 잘 나오나 확인
				students = studentService.makeStudents();
			} else if(select==2) {
				// 2.학생정보 출력
//				System.out.println("2번 누름");
				studentView.view(students);
			} else if(select==3){
				// 3. 학생정보 검색
				// 모든 학생 정보를 출력하는 것이 아닌 한명만 찾아보고싶을때
				
				// 1 - findByNum
				Student student = studentService.findByNum(students);
				// 2 - viewOne
				studentView.view(student);
				
			} else {
//				System.out.println("없는 번호입니다.");
				// 프로그램 종료
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
	}
}
