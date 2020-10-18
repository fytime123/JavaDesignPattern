package com.liufuyi.design.builder;

import com.liufuyi.design.factory.abstractfactory.LuxuryCarFactory;
import com.liufuyi.design.factory.simple.Car;

public class Test {


	
	public static void main(String[] args) {
		
		Builder builder = new CarBuilder(new LuxuryCarFactory());
		
		Director director = new Director(builder);
		director.construct();
		
		Car car  = builder.build();
		car.run();
		
	}

}
