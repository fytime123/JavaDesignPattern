package com.liufuyi.design.bridge;

public class TestBridge {

	public static void main(String[] args) {
		
		//准备中杯
		MediumCup medium = new MediumCup();
		//拿出牛奶咖啡
		medium.setCoffee(new MilkCoffee());
		//倒咖啡
		medium.pourCoffee();
		
		//大杯清香
		SuperSizeCup superSize = new SuperSizeCup();
		superSize.setCoffee(new FragrantCoffee());
		superSize.pourCoffee();
		
		
	}

}
