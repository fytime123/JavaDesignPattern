package com.liufuyi.design.builder;

import com.liufuyi.design.factory.abstractfactory.Engine;
import com.liufuyi.design.factory.abstractfactory.Seat;
import com.liufuyi.design.factory.abstractfactory.Tyre;
import com.liufuyi.design.factory.simple.Car;

public class BrandCar implements Car {

	private Engine engine;
	private Seat seat;
	private Tyre tyre;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public void run() {
		System.out.println("奢侈汽车：");
		if(engine!=null)
			engine.run();
		if(seat!=null)
			seat.comfort();
		if(tyre!=null)
			tyre.skill();
	}

}
