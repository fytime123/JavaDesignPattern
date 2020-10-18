package com.liufuyi.testthread;

public class Joiner extends Thread{

	private Sleeper sleeper; 
	public Joiner(String name, Sleeper sleeper){
		this.sleeper = sleeper;
		setName(name);
	}
	
	@Override
	public void run() {
		System.out.println(getName()+" 开始");
		try {  
            // 如果某个线程在另一个线程t上调用t.join(), 此线程将被挂起,   
            // 直到目标线程t结束才恢复（即t.isAlive() 返回为假）  
			System.out.println("等待"+sleeper.getName()+" 结束！");
            sleeper.join();  
        } catch (InterruptedException e) {  
            System.out.println(getName() + "Interrupted.");  
        }  
		System.out.println(getName()+" 结束");
	}
	
}
