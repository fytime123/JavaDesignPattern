package com.liufuyi.design.factory.abstractfactory;

public interface Seat {

	public void comfort();
}

class LuxurySeat implements Seat{
	@Override
	public void comfort() {
		System.out.println("座椅：可以按摩，可以智能适合您的坐姿");
	}
}

class LowerSeat implements Seat{
	@Override
	public void comfort() {
		System.out.println("座椅：皮座椅");
	}
}