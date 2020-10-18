package com.liufuyi.design.state;


public abstract class State {

	public abstract void handlepush(Context c);

	public abstract void handlepull(Context c);

	public abstract int getcolor();
}
