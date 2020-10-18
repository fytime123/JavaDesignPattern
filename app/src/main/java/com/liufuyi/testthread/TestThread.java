package com.liufuyi.testthread;

public class TestThread {

	
	public static void main(String[] args) {
		Sleeper sleeper = new Sleeper("线程1", 5000);
		Joiner joiner = new Joiner("线程2", sleeper);
		sleeper.start();
		joiner.start();
		
		try {
			Thread.sleep(2000);
			//发起joiner中断
			System.out.println(joiner.getName() + " 发起中断等待 " + sleeper.getName() + "结束！");
			joiner.interrupt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
