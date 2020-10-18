package com.liufuyi.design.state;

import java.awt.Color;

public class RedState extends State{

	@Override
	public void handlepush(Context c) {
		c.setState(new BlueState());
	}

	@Override
	public void handlepull(Context c) {
		c.setState(new GreenState());
	}

	@Override
	public int getcolor() {
		return Color.RED.getRGB();
	}

}
