package com.liufuyi.design.builder;

import com.liufuyi.design.factory.simple.Car;

public interface Builder {
	
	public void buildEngine();
	public void buildSeat();
	public void buildTyre();
	
	public Car build();
}
