package com.liufuyi.design.flyweight;

public class TestFlyWeight {

	
	public static void main(String[] args) {
		
		Flyweight flyweight1 = FlyweightFactory.getFlyweight("头像1");
		Flyweight flyweight2 = FlyweightFactory.getFlyweight("头像1");
		Flyweight flyweight3 = FlyweightFactory.getFlyweight("头像2");
		Flyweight flyweight4 = FlyweightFactory.getFlyweight("头像2");
		
		System.out.println(flyweight1);
		System.out.println(flyweight2);
		
		
		System.out.println(flyweight3);
		System.out.println(flyweight4);
		
		flyweight1.operation(new ExtrinsicState(0));
		flyweight1.operation(new ExtrinsicState(1));
		
		flyweight2.operation(new ExtrinsicState(2));
		flyweight2.operation(new ExtrinsicState(3));
		
		flyweight3.operation(new ExtrinsicState(4));
		flyweight4.operation(new ExtrinsicState(5));
		
		flyweight3.operation(new ExtrinsicState(6));
		flyweight4.operation(new ExtrinsicState(7));
	}
}
