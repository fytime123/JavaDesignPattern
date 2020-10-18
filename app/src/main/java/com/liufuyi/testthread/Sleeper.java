package com.liufuyi.testthread;

public class Sleeper extends Thread {

	private long duration;

	public Sleeper(String name, long duration) {
		setName(name);
		this.duration = duration;
		
	}

	@Override
	public void run() {

		if(duration<0)duration = 0;
		System.out.println(getName()+" 开始");
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			System.out.println(String.format("%s was interrupted. isInterrupted(): %b", getName(), isInterrupted()));
		}
		System.out.println(getName()+" 结束");
	}
}
