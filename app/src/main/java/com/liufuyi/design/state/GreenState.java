package com.liufuyi.design.state;

import java.awt.Color;

public class GreenState extends State{

	@Override
	public void handlepush(Context c) {
		c.setState(new RedState());
		
	}

	@Override
	public void handlepull(Context c) {
		c.setState(new BlueState());
	}

	@Override
	public int getcolor() {
		return  Color.GREEN.getRGB();
	}

}
