package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		// TRPG
		// 유저의 HP
		int hp = 40;
		
		// 몬스터의 HP
		int monsterHp = 60;
		
		// 몬스터의 파워
		int monsterPower = 40;
		
		// 유저 정보 : hp, 몬스터 정보 : hp
		// 1.평타 / 2.스킬 / 3.HP회복 / 4.도망
		// 평타 : 0~10 미만의 공격을 몬스터에게 적용.
		// 스킬 : 0~30 미만의 공격을 몬스터에게 적용. (최대 3번)
		// 회복 : 회복량 0~40 까지 회복 (최대 hp보다 높아질 순 없음)
		// 도망 : 50%의 확률로 성공, 실패
		// 턴당 한번의 행동만 가능
		
		
		// monster
		// 1. 유저 공격 0~40이하의 공격을 유저에게
		
		// 행동
		int select = 0;
		

		// 스킬
		int skill = random.nextInt(30);
		// 스킬 횟수
		int skillSum = 3;
		// HP회복
		int heal = random.nextInt(40);
		
		
		// 몬스터 공격
		int monsterAttack = random.nextInt(5);
		
	
		
		
		
		while(true) {
			
			// 평타
			int attack = random.nextInt(10);
			
			// 도망
			boolean run = random.nextBoolean();
			
			
			System.out.println("행동 선택");
			System.out.println("1.평타 / 2.스킬 / 3.HP회복 / 4.도망");
			select = sc.nextInt();
			
			
				
				if(select==1) {
					monsterHp = monsterHp - attack;
					System.out.println("!!!! Damage "+ attack + " !!!!");
					System.out.println("현재 몬스터 HP : " + monsterHp);
					System.out.println();
				} else if(select==2) {
					
						monsterHp = monsterHp - skill;
						skillSum-=1;
						System.out.println("!!!!!!!! Damage "+ skill + " !!!!!!!!");
						System.out.println();
						System.out.println("남은 스킬 횟수 " + skillSum);
						System.out.println("현재 몬스터 HP : " + monsterHp);
						System.out.println();
					 if(skillSum<=0) {
						System.out.println("더 이상 스킬을 쓸 힘이 없다...");
						System.out.println();
	//					System.out.println("현재 HP : " + hp);
	//					System.out.println("현재 몬스터 HP : " + monsterHp);
					}
				} else if(select==3) {
					hp = hp + heal;
					if(0<hp && hp<=40) {
						System.out.println("******* " + heal + "만큼 회복되었습니다. *******");
						System.out.println("현재 HP : " + hp);
					} else {
						System.out.println("이미 HP가 차있는 상태입니다.");
					}
				} else if(select==4) {
					if(run==true) {
						System.out.println("도망치는데 성공했습니다!");
						System.out.println("전투가 종료되었습니다.");
					} else {
						System.out.println("도망치는데 실패했습니다!");
					}
				}
				
				if(monsterHp<=0 || hp<=0 || run==true) {
					break;
				}
				
				
				// 몬스터가 유저 공격
				
				
				System.out.println("몬스터 턴입니다.");
				hp -= monsterAttack;
				System.out.println("몬스터 대미지 : " + monsterAttack);
				System.out.println("현재 HP : " + hp);
			}	
		}
	}

