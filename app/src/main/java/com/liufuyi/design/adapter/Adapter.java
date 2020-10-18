package com.liufuyi.design.adapter;

public class Adapter implements UsbPort{

	private Keyboard keyboard;
	
	public Adapter(Keyboard keyboard){
		this.keyboard = keyboard;
	}
	
	@Override
	public void connect() {
		keyboard.connect();
		System.out.println("连接适配器");
		System.out.println("UsbPort接口连接");
	}

	
}
