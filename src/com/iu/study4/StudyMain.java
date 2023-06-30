package com.iu.study4;

public class StudyMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
//		// int에는 int타입을 값을 넣을 수 있듯이
//		// Card에는 Card 타입의 값을 넣을 수 있다.
//		Card card = new Card();
//		
//		
//		// 배열은 index 번호로 Heap에서 찾아 불러왔듯이
//		// 인스턴스 변수는 각각의 변수명으로 불러온다.
//		card.cardNumber=3.1;
//		
//		System.out.println(card.cvc);
//		System.out.println(card.name);
//		
//		
//		/*----------------------------------------*/
//		
//		
//		Student s1 = new Student();
//		
//		s1.name = "winter";
//		s1.gender = 'F';
//		
//		Student s2 = new Student();
//		s2.name = "iu";
//		
//		s2 = s1;
//
//		// s2에 s1의 주소를 넣은 것이 되어
//		// iu가 아닌 winter가 출력된다.
//		System.out.println(s2.name);
//		
//		// 이렇게 쓰면 주소를 비교하게 된다.
//		System.out.println(s1==s2);
		
//		System.out.println("이름 : " + s1.name);
//		System.out.println("성별 : " + s1.gender);
		
		
		/*----------------------------------------*/
		
		
		Student s1 = new Student();
		s1.name = "winter";
		s1.gender = 'F';
		
//		Student s2 = new Student();
//		s2.name = "iu";
//		s2.gender = 'F';
//		
//		Student [] students = new Student[3];
//		students[0] = s1;
//		students[1] = s2;

		
		// 내가 한 코드 
//		for(int i=0; i<=students.length-1; i++) {
//			System.out.println(i+1 + "번 학생의 이름 : " + students[i].name);
//		}
		
		// NullPointerException 오류
		// 만들어지지 않은(선언되지 않은) 객체를 찾아가서 출력하라고 해서 오류뜸
		// 모르는데 어떻게 가요
		// Student s3 = null; 이런 상태
//		System.out.println(students[2].name);
		
		// 선생님 코드
//		for(int i=0; i<students.length; i++) {
//		System.out.println(i+1 + "번 학생의 이름 : " + students[i].name);
//		}
//		
//		Student s3 = new Student();;
//		s3.name = "iu";
		
		/*---------------------------------------------------*/
		
		Student s2 = new Student();
		s2.name="iu";
		s2.gender='F';
		

		Student [] students = new Student [2];
		
		students[0] = s1;
		students[1] = s2;
		
		
		
		StudentView sv = new StudentView();
		sv.view(s1);
		
		
		sv.viewAll(students);
		
		
		System.out.println("프로그램 종료");
		
		
	}

}
