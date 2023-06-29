package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2_answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		
		// TRPG
		// 유저의 HP
		int hp = 40;
		
		// 몬스터의 HP
		int monsterHp = 60;
		
		// 몬스터의 파워
		int monsterPower = 40;
		
		// 유저 정보 : hp, 몬스터 정보 : hp
		// 1.평타 / 2.스킬 / 3.HP회복 / 4.도망
		// 평타 : 0~10 이하의 공격을 몬스터에게 적용.
		// 스킬 : 0~30 이하의 공격을 몬스터에게 적용. (최대 3번)
		// 회복 : 회복량 0~40 까지 회복 (최대 hp보다 높아질 순 없음)
		// 도망 : 50%의 확률로 성공, 실패
		// 턴당 한번의 행동만 가능
		
		
		// monster
		// 1. 유저 공격 0~40이하의 공격을 유저에게
		

		boolean flag = true;
		int skillCount = 3;
		
		
		while(flag) {
			System.out.println("1.평타 / 2.스킬 / 3.회복 / 4.도망");
			int select = sc.nextInt();
			
			if(select==1) {
				// 평타
				// Damage
				select = random.nextInt(11);
				monsterHp = monsterHp - select;
				System.out.println("몬스터에게 " + select + " 피해를 주었습니다!");
				
				// 몹 죽음
				if(monsterHp<1) {
					System.out.println("몹이 죽었어요.");
					break;
				}
				
			} else if(select==2){
				// 스킬
				if(skillCount>0) {
					
					select = random.nextInt(31);
					monsterHp = monsterHp - select;
					System.out.println("몬스터에게 " + select + "피해를 주었습니다!");
					
					// 몹 죽음
					if(monsterHp<1) {
						System.out.println("몹이 죽었어요.");
						break;
					}
					
					skillCount--;
				} else {	// 스킬 3번 다 썼을때
					System.out.println("마나가 부족합니다...");
				}
				
			} else if(select==3) {
				// 회복
				select = random.nextInt(41);
				hp = hp + select;
				
				if(hp>40) {  // 최대 hp가 40 넘지 않도록
					hp = 40;
				}
				
				System.out.println("Hp를 회복했어요.");
				
			} else {
				// 도망
				select = random.nextInt(2);
				
				if(select==0) {  // 도망성공

//				// 도망 확률를 이렇게도 설정할 수 있다.
				// 랜덤 숫자가 짝수가 나오면 도망에 성공!
//				select = random.nextInt(1001);
//				if(select%2 != 0) {  // 도망성공
					
					System.out.println("도망 성공");
					break;
				} else {
					System.out.println("도망 실패");
				}
				break;
			} // 유저의 끝
			
			select = random.nextInt();
			hp = hp - select;
			System.out.println("유저가 " + select + "의 피해를 받았습니다.");
			if(hp<1) {
				System.out.println("You Die");
				break;
			}
			
		}	// while 끝
		
	}

}
