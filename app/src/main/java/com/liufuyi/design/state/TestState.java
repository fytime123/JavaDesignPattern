package com.liufuyi.design.state;

public class TestState {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BlueState blueState = new BlueState();
		Context context = new Context();
		context.setState(blueState);
		
		context.push();
		context.push();
		context.push();
		context.pull();
		context.pull();
		
	}

}
