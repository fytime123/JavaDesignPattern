package com.liufuyi.design.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 4.单例模式：静态内部式
 *1)线程安全
 *2)懒加载模式
 *3)并发效率高
 */
public class InnerSingleton implements Serializable{
	
	private static final long serialVersionUID = 4L;

	//(实现懒加载)：InnerSingleton类加载的时候，并不会加载该静态内部类，只有调用getInstance()时才会加载静态内部类   
	//而类的加载是线程安全的。
	private static class SingletonInstance{
		//1.
		private final static InnerSingleton instance = new InnerSingleton(); 
	}
	
	//2.
	private InnerSingleton(){
		if(SingletonInstance.instance!=null){
			throw new RuntimeException();
		}
	}

	//3.
	public static InnerSingleton getInstance(){
		return SingletonInstance.instance;
	}
	
	//反序列化时，如果定义了本方法有则直接返回本方法的对象，而不需要把反序列化新对象返回
	private Object readResolve() throws ObjectStreamException{
		return SingletonInstance.instance;
	}
	
}
