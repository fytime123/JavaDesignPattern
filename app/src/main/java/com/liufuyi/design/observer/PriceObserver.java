package com.liufuyi.design.observer;

public class PriceObserver implements Observer {

	@Override
	public void update(Observable obj, Object msg) {

		if (msg instanceof Float) {
			float price = ((Float) msg).floatValue();
			System.out.println("PriceObserver :price changet to " + price);
		}
	}

}
