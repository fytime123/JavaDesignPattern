package com.liufuyi.design.proxy.staticproxy;

public class RealStar implements Star{

	@Override
	public void confer() {
		System.out.println("真实明星：表示愿意接");
	}

	@Override
	public void signContract() {
		System.out.println("真实明星：签字");
	}

	@Override
	public void sellTicket() {
		System.out.println("真实明星：不管");
	}

	@Override
	public void act() {
		System.out.println("真实明星：拍戏，表演");
	}

	@Override
	public void money() {
		System.out.println("真实明星：变有钱了");
	}

}
