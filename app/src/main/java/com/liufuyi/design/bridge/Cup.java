package com.liufuyi.design.bridge;

public abstract class Cup {

	Coffee coffee;

	public void setCoffee(Coffee coffeeImp) {
		this.coffee = coffeeImp;
	}

	public Coffee getCoffee() {
		return this.coffee;
	}

	public abstract void pourCoffee();

}
