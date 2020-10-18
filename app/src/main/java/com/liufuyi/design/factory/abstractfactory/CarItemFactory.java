package com.liufuyi.design.factory.abstractfactory;

public interface CarItemFactory {

	public Engine createEngine();
	
	public Seat createSeat();
	
	public Tyre createTyre();
}
