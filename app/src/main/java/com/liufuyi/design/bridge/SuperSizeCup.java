package com.liufuyi.design.bridge;

public class SuperSizeCup extends Cup {

	public SuperSizeCup() {
	}

	public void pourCoffee() {
		Coffee coffeeImp = this.getCoffee();
		System.out.println("\n开始倒咖啡，超大杯:");
		// 我们以重复次数来说明是冲中杯还是大杯 ,重复5次是大杯
		for (int i = 0; i < 5; i++) {
			coffeeImp.pourCoffeeImp();
		}
		System.out.println("倒满");
	}
}
