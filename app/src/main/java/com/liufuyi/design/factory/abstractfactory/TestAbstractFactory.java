package com.liufuyi.design.factory.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		
		CarItemFactory factory = new LuxuryCarFactory();
//		CarItemFactory factory = new LowerCarFactory();
		Engine engine = factory.createEngine();
		Seat seat = factory.createSeat();
		Tyre tyre = factory.createTyre();
		
		engine.run();
		seat.comfort();
		tyre.skill();
		
	}
}
