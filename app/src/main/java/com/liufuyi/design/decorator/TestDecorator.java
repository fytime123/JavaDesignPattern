package com.liufuyi.design.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		
		Car car = new Car();
		FlyCar flyCar = new FlyCar(car);
		WaterCar waterCar = new WaterCar(flyCar);
		
		flyCar.move();
		
		waterCar.move();
	}
}
