package com.liufuyi.design.observer;

public class NameObserver implements Observer {

	public void update(Observable obj, Object msg) {
		if (msg instanceof String) {
			String name = (String) msg;
			// 产品名称改变值在name中
			System.out.println("NameObserver :name changet to " + name);
		}
	}

}
