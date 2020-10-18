package com.liufuyi.design.adapter;

public class Computer {

	public void connect(UsbPort port) {
		port.connect();
		System.out.println("连接成功");
	}

}
