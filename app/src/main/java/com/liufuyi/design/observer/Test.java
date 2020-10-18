package com.liufuyi.design.observer;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.addObserver(new NameObserver());
		product.addObserver(new PriceObserver());
		
		product.setName("123456");
		product.setPrice(20);
		
		
	}

}
