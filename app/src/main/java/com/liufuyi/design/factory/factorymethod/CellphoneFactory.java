package com.liufuyi.design.factory.factorymethod;

public class CellphoneFactory implements ProductFactory{

	@Override
	public Product create() {
		return new Cellphone();
	}

}
