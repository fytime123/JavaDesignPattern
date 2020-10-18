package com.liufuyi.design.composite;

public class Chassis extends CompositeEquipment {
	public Chassis(String name) {
		super(name);
	}

	public double netPrice() {
		return 1. + super.netPrice();
	}

	public double discountPrice() {
		return 0.5 + super.discountPrice();
	}
}
