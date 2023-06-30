package com.iu.study4;

public class StudentView {
	// Student 정보를 출력
	// view
	public void view(Student student) {
		// String 타입의 name과 char타입의 gender를 받아왔었지만
		// 그것보다 student 클래스 자체를 가져오는 것이 더 효율적이라...
		
		System.out.println(student.name);
		System.out.println(student.gender);
	}
	
	// viewAll
	// 모든 student들 정보를 출력
	// 단, viewAll 매개변수는 딱 한개만 선언
	public void viewAll(Student [] students) {
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].gender);
		}
	}
	
	
}
