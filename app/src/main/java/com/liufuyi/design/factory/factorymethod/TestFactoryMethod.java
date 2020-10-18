package com.liufuyi.design.factory.factorymethod;

public class TestFactoryMethod {

	public static void main(String[] args) {
		//符合开闭原则，但是增加了比较多的类
		
		Product cellphone = new CellphoneFactory().create();
		Product computer = new ComputerFactory().create();
		
		cellphone.work();
		computer.work();
	}
}
