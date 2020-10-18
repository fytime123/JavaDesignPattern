package com.liufuyi.design.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 1.常用单例模式：饿汉式单例模式
 */
public class HungrySingleton implements Serializable{

	private static final long serialVersionUID = 2L;
	
	//1
	private static HungrySingleton instance = new HungrySingleton();//类初始化时，立即加载
	
	//2
	private HungrySingleton(){
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	
	//3
	public static HungrySingleton getInstance(){
		//由于类加载是线程安全的，本身就是类加载的时候就初始化了，因此是线程安全的
		//问题：如果只是加载本类，而没有调用getInstance,甚至永远没有调用，造成资源浪费
		return instance;
	}
	
	//反序列化时，如果定义了本方法有则直接返回本方法的对象，而不需要把反序列化新对象返回
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
