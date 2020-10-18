package com.liufuyi.design.bridge;

public class MediumCup extends Cup {

	public MediumCup() {
		
	}

	public void pourCoffee() {
		Coffee coffeeImp = this.getCoffee();
		System.out.println("\n开始倒咖啡，中杯:");
		// 我们以重复次数来说明是冲中杯还是大杯 ,重复2次是中杯
		for (int i = 0; i < 2; i++) {
			coffeeImp.pourCoffeeImp();
		}
		System.out.println("倒满");
	}
}
