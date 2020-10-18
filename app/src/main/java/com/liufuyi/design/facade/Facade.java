package com.liufuyi.design.facade;

public class Facade {

	ServiceA serviceA;
	ServiceB serviceB;
	ServiceC serviceC;

	public Facade() {
		serviceA = new ServiceAImpl();
		serviceB = new ServiceBImpl();
		serviceC = new ServiceCImpl();
	}

	public void methodA() {
		System.out.println("注册公司");
		serviceA.methodA();
		serviceB.methodB();
	}

	public void methodB() {
		System.out.println("每月税务申报");
		serviceA.methodA();
		serviceC.methodC();
	}

	public void methodC() {
		System.out.println("企业年检");
		serviceB.methodB();
		serviceC.methodC();
	}

}
