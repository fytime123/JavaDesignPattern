package com.liufuyi.design.proxy.staticproxy;

public class TestStaticProxyClient {

	
	public static void main(String[] args) {
		RealStar star = new RealStar();
		ProxyStar proxyStar = new ProxyStar(star);
		
		proxyStar.confer();
		proxyStar.signContract();
		proxyStar.sellTicket();
		proxyStar.act();
		proxyStar.money();
		
	}
}
