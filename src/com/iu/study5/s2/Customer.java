package com.iu.study5.s2;

public class Customer {

	private int money;
	private int point;
	
	public Customer() {
		this.money = 10000000;
		this.point = 50;
	}
	
	// 상품 1개 샀을 경우
	public void buy(Product product) {
		this.money = this.money - product.getPrice();
		this.point = this.point + product.getPoint();
		System.out.println("남은 돈 : " + this.money);
		System.out.println("잔여 포인트 : " + this.point);
	}
	
//	public void buy(Tv computer) {
//		this.money = this.money - computer.getPrice();
//		this.point = this.point + computer.getPoint();
//		
//	}
	
	// 상품 2개 샀을 경우 (위의 buy 메서드와 오버로딩)
	public void buy(Product [] products) {
		for(int i=0; i<products.length; i++) {
			this.buy(s);
		}
		this.money = this.money - products[0].getPrice() + products[1].getPrice();
		this.point = this.point + products[0].getPoint() + products[1].getPoint();
		System.out.println("남은 돈 : " + this.money);
		System.out.println("잔여 포인트 : " + this.point);
	}



		
}