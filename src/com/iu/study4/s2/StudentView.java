package com.iu.study4.s2;

public class StudentView {
	
	public void view(Student [] students) {
		// 학생들 정보만 출력하면 되기 때문에 리턴할 필요X
		
		for(int i=0; i<students.length; i++) {
			Student student = students[i];
//			System.out.println("학생이름 : " + student.name);
//			System.out.println("학생번호 : " + student.num);
			// ▲ 위처럼 student에서 받아와도 되고
			// ▼ 아래처럼 students배열에서 받아와도 된다.
//			System.out.println("평균점수 : " + students[i].avg);
			// Student student = students[i]이기 때문에 가능한 것.
			
			// 메소드 오버로딩을 사용해서 ▲ 위의 출력문 3줄을
			// ▼ 아래의 한 줄로 바꿀 수도 있다.
			this.view(student);
			System.out.println("=======================");
		}
	}
	
	public void view(Student student) {
		System.out.println("========================");
		System.out.println("학생이름 : " + student.getName());
		System.out.println("학생번호 : " + student.getNum());
		System.out.println("평균점수 : " + student.getAvg());
		System.out.println("========================");
	}	
	
}
