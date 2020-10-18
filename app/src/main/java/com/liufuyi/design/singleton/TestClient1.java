package com.liufuyi.design.singleton;

public class TestClient1 {

	public static void main(String[] args) {

		//1.饿汉式
		HungrySingleton h1 = HungrySingleton.getInstance();
		HungrySingleton h2 = HungrySingleton.getInstance();
		System.out.println("1.饿汉式");
		System.out.println("HungrySingleton:"+ h1);
		System.out.println("HungrySingleton:"+ h2);
		
		//2.懒汉式
		LazySingleton lazy1 = LazySingleton.getInstance();
		LazySingleton lazy2 = LazySingleton.getInstance();
		System.out.println("2.懒汉式");
		System.out.println("LazySingleton:"+ lazy1);
		System.out.println("LazySingleton:"+ lazy2);
		
		//3.DCL
		DCLSingleton d1 = DCLSingleton.getInstance();
		DCLSingleton d2 = DCLSingleton.getInstance();
		System.out.println("3.DCL");
		System.out.println("DCLSingleton:"+ d1);
		System.out.println("DCLSingleton:"+ d2);
		
		//4.静态内部式
		InnerSingleton in1 = InnerSingleton.getInstance();
		InnerSingleton in2 = InnerSingleton.getInstance();
		System.out.println("4.静态内部式");
		System.out.println("InnerSingleton:"+ in1);
		System.out.println("InnerSingleton:"+ in2);
		
		//5.枚举方式
		EnumSingleton e1 = EnumSingleton.INSTANCE;
		EnumSingleton e2 = EnumSingleton.INSTANCE;
		System.out.println("5.枚举方式");
		System.out.println("EnumSingleton:"+ e1);
		System.out.println("EnumSingleton:"+ e2);
		
	}

}
