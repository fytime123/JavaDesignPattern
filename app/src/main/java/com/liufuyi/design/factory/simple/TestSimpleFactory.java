package com.liufuyi.design.factory.simple;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		Car car = SimpleFactory.createCar("audi");
		car.run();
		
		car = SimpleFactory.createCar("byd");
		car.run();
	}


}
