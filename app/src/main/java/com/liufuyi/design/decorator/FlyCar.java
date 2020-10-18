package com.liufuyi.design.decorator;

public class FlyCar extends CarDecorator{

	public FlyCar(ICar car) {
		super(car);
	}

	@Override
	public void move() {
		super.move();
		System.out.println("空中飞行");
	}
	
}
