package com.iu.study4.s2;

import java.util.Scanner;

public class StudentService {
	
	public Student makeStudentOne() {
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("학생의 이름을 입력해주세요. >> ");
		student.name = sc.next();
				
		System.out.println("학생의 번호를 입력해주세요. >> ");
		student.num = sc.nextInt();
				
		System.out.println("학생의 국어점수를 입력해주세요. >> ");
		student.kor = sc.nextInt();
				
		System.out.println("학생의 영어점수를 입력해주세요. >> ");
		student.eng = sc.nextInt();
				
		System.out.println("학생의 수학점수를 입력해주세요 >> ");
		student.math = sc.nextInt();
				
		student.total = student.kor + student.eng + student.math;
		student.avg = (student.kor + student.eng + student.math)/3.0;
			
		System.out.println(student.name + "의 총점 : " + student.total + "점");
		System.out.println(student.name + "의 점수 평균 : " + student.avg + "점");

		return student;
	}

	
	
	public Student [] makeStudents() {
		Scanner sc = new Scanner(System.in);
		
		// 학생 수 입력
		// 학생 수 만큼 학생들이 만들어짐
		// 이름, 번호, 국어, 영어, 수학 점수를 입력한다.
		// 총점, 평균 계산
		// 학생들을 리턴 (계산된 것이 리턴되어 출력?)
		// 1. 학생 배열 생성
		// 2. 학생수 만큼 반복문 실행
		// 3. 반복문 내에서 이름, 번호, 국어, 영어, 수학 입력 총점 평균
		// 4. 해당 학생을 배열에 대입
		// 5. 2~4번 순서 반복
		
		

		System.out.print("학생 수를 입력해주세요. >> ");
		int count = sc.nextInt();
		Student [] student = new Student [count];
		
		
		for(int i=0; i<count; i++) {
			
			System.out.println("학생의 이름을 입력해주세요. >> ");
			student [i].name = sc.next();
				
			System.out.println("학생의 번호를 입력해주세요. >> ");
			student [i].num = sc.nextInt();
				
			System.out.println("학생의 국어점수를 입력해주세요. >> ");
			student [i].kor = sc.nextInt();
				
			System.out.println("학생의 영어점수를 입력해주세요. >> ");
			student [i].eng = sc.nextInt();
				
			System.out.println("학생의 수학점수를 입력해주세요 >> ");
			student [i].math = sc.nextInt();
				
			student [i].total = student [i].kor + student [i].eng + student [i].math;
			student [i].avg = (student [i].kor + student [i].eng + student [i].math)/3;
			
			System.out.println(student [i].name + "의 총점 : " + student [i].total + "점");
			System.out.println(student [i].name + "의 점수 평균 : " + student [i].avg + "점");
		}
		
		
		return student;
	}
}
