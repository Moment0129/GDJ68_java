package com.iu.study4.s4;

import com.iu.study4.s2.Student;
import com.iu.study4.s3.Car;

public class S4Main {

	public static void main(String[] args) {
		Car car = new Car();
//		car.brand();
		// ▲ 접근지정자가 public으로 되어있지 않아서 현재 패키지에서는 호출불가
		// ▼ 여기엔 접근지정자가 public으로 되어있어서 호출가능
		car.info();
		
		Product product = new Product();
//		//▼ name 변수가 public이 아니기 때문에 S4Main클래스에서 호출불가
//		product.name="";
		
//		product.price=10000000;
//		product.info();
		
		String name = "";
		

	}

}
