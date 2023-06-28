package com.iu.study2;

import java.util.Scanner;

public class Study4_for2_ex1 {

	public static void main(String[] args) {

		// FPS
		// 30발, 3탄창
		// M16, 2가지 : 단발, 3점사
		
		// 1.단발, 2.점사
		//    탕,   타타탕
		
		Scanner sc = new Scanner(System.in);
		
		// M16 2가지
//		int m16 = 0;
		
		// 탄창 갯수
//		int tanchang = 0;
		
		// 쏘는 횟수
//		int tang = 0;
//		
//		
//		for(int tanchang=0; tanchang<=3; tanchang++) {
//			
//			System.out.print("단발은 1번, 점사는 2번을 선택해주세요. >> ");
//			int m16 = sc.nextInt();
//			
//			switch(m16) {
//			case 1:
//				for(tang=1; tang<=30; tang++) {
//					System.out.println(tang + "번 탕");
//					
//				}
//			case 2:
//				for(tang=0; tang<=30; tang=tang+3) {
//					System.out.println(tang + "번 타타탕");
//					
//				}
//				tanchang++;
//				break;
//			}
//			continue;
//		}
		
		for(int tan=0; tan<3; tan++) {
			System.out.println("1.단발 2.점사");
			int select=sc.nextInt();
			int count = 0;
			String sound = "";
			
			if(select==1) {
				count = 30;
				sound = "탕";
				
			} else {
				count = 10;
				sound = "타타탕";
				}
				
				for(int b=0; b<count; b++) {
					System.out.println(sound);
				}
			}
		}

		
		
		System.out.println("남은 탄창이 없습니다.");

		
		}
	}

}
