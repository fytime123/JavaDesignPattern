package com.liufuyi.design.factory.simple;

public class SimpleFactory {

	// 缺点：增加新的产品的话，需要修改工厂方法

	public static Car createCar(String name) {
		if ("audi".equals(name)) {
			return new Audi();
		} else if ("byd".equals(name)) {
			return new Byd();
		} else {
			return null;
		}
	}

	public static Car createAudi() {
		return new Audi();
	}

	public static Car createByd() {
		return new Byd();
	}
}
