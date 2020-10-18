package com.liufuyi.design.state;

import java.awt.Color;


public class BlueState extends State {

	@Override
	public void handlepush(Context c) {
		//根据push方法"如果是blue状态的切换到green" ;
		c.setState(new GreenState());
	}

	@Override
	public void handlepull(Context c) {
		//根据pull方法"如果是blue状态的切换到red" ;
		c.setState(new RedState());
	}

	@Override
	public int getcolor() {
		return Color.BLUE.getRGB();
	}

}
