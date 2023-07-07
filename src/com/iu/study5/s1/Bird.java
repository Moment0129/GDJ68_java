package com.iu.study5.s1;

public abstract class Bird extends Animal implements Flyable {
	
	int wing;
	
	// Flyable Interface를 implements했기 때문에
	// 더이상 이 fly 메서드가 필요치않다.
//	public abstract void fly();

	
	// => Bird는 Bird타입이자, Animal타입이기도 하며, Flyable타입이기도하다.
	//    fly 메서드가 있는 Eagle도 Flyable 타입이 된다.
}
