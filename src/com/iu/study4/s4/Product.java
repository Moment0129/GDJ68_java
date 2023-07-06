package com.iu.study4.s4;

public class Product {
	
	private String name;
	private int price;
	
//	public Product(String name, int price) {
//		this.name = name;
//		this.price = price;
//	}
	

	// private 객체를 가지고오고(get) 
	
	public void setPrice(int price) {
		if(price<1) {
			this.price = 1000;
		}
		this.price = price;
	}
	
	public int getPrice() {
		if(price<1) {
			this.price = 1000;
		}
		return this.price;
	}
	
	public void info() {
		System.out.println(this.name);
	}
}
