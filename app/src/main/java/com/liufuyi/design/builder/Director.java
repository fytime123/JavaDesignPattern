package com.liufuyi.design.builder;

public class Director {

	private Builder builder;

	public Director(Builder b) {
		builder = b;
	}

	public void construct() {
		builder.buildEngine();
		builder.buildSeat();
		builder.buildTyre();
	}

}
