package com.liufuyi.design.factory.factorymethod;

public class ComputerFactory implements ProductFactory{

	@Override
	public Product create() {
		return new Computer();
	}

}
