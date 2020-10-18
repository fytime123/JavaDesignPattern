package com.liufuyi.design.decorator;

public class CarDecorator implements ICar{

	protected ICar car;
	
	public CarDecorator(ICar car){
		this.car = car;
	}
	
	@Override
	public void move() {
		car.move();
	}

}
