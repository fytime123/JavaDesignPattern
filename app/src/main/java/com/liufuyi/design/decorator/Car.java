package com.liufuyi.design.decorator;

public class Car implements ICar{

	@Override
	public void move() {
		System.out.println("地上行驶");
	}

}
