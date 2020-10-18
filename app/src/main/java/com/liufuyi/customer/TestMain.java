package com.liufuyi.customer;



public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Producer p = new Producer();
		
		Comsumer c = new Comsumer();
		
		Warehouse.startModel(211, 5, p, c);

	}

}
