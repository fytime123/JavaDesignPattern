package com.liufuyi.design.decorator;

public class WaterCar extends CarDecorator {

	public WaterCar(ICar car) {
		super(car);
	}

	@Override
	public void move() {
		super.move();
		System.out.println("水上行驶");
	}
}
