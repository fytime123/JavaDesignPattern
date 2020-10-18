package com.liufuyi.design.builder;

import com.liufuyi.design.factory.abstractfactory.CarItemFactory;
import com.liufuyi.design.factory.abstractfactory.Engine;
import com.liufuyi.design.factory.abstractfactory.Seat;
import com.liufuyi.design.factory.abstractfactory.Tyre;
import com.liufuyi.design.factory.simple.Car;

public class CarBuilder implements Builder {

	private CarItemFactory factory;
	private BrandCar car;

	public CarBuilder(CarItemFactory factory) {
		this.factory = factory;
		car = new BrandCar();
	}

	@Override
	public void buildEngine() {
		Engine engine = factory.createEngine();
		car.setEngine(engine);
	}

	@Override
	public void buildSeat() {
		Seat seat = factory.createSeat();
		car.setSeat(seat);
	}

	@Override
	public void buildTyre() {
		Tyre tyre = factory.createTyre();
		car.setTyre(tyre);
	}

	@Override
	public Car build() {
		return car;
	}

}
