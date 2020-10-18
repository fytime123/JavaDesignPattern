package com.liufuyi.design.proxy.staticproxy;

public class ProxyStar implements Star{
	
	private Star star;

	public ProxyStar(Star star){
		this.star = star;
	}
	
	
	@Override
	public void confer() {
		System.out.println("经纪人接洽合约");
		star.confer();
	}

	@Override
	public void signContract() {
		System.out.println("经纪人处理签合约");
		star.signContract();
	}

	@Override
	public void sellTicket() {
		System.out.println("经纪人处理发行票务");
		star.sellTicket();
	}

	@Override
	public void act() {
		star.act();
	}

	@Override
	public void money() {
		System.out.println("经纪人打理财务");
		star.money();
	}

}
