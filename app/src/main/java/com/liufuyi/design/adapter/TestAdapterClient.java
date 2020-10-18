package com.liufuyi.design.adapter;

public class TestAdapterClient {

	public static void main(String[] args) {

		Keyboard keyboard = new Keyboard();
		
		Adapter adapter = new Adapter(keyboard);
		Computer computer = new Computer();
		
		computer.connect(adapter);
		
	}

}
