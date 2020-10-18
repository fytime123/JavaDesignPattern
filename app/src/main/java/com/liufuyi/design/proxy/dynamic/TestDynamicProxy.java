package com.liufuyi.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.liufuyi.design.proxy.staticproxy.RealStar;
import com.liufuyi.design.proxy.staticproxy.Star;

public class TestDynamicProxy {

	public static void main(String[] args) {
		Star star = new RealStar();
		InvocationHandler handler = new StarHandler(star);

		// 创建动态代理对象
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
		
		proxy.confer();
		proxy.signContract();
		proxy.sellTicket();
		proxy.act();
		proxy.money();
	}

}
