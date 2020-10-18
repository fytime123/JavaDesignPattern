package com.liufuyi.design.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {

	private static Hashtable<String,Flyweight> flyweights = new Hashtable<String,Flyweight>();

	public static Flyweight getFlyweight(String key) {
		Flyweight flyweight =  flyweights.get(key);
		if (flyweight == null) {
			// 产生新的
			flyweight = new ConcreteFlyweight(key);
			flyweights.put(key, flyweight);
		}
		return flyweight;
	}
}
