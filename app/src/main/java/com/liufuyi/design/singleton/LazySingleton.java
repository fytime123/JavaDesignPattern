package com.liufuyi.design.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 2.常用单例模式：懒汉式单例模式 
 */
public class LazySingleton implements Serializable{

	private static final long serialVersionUID = 3L;
	
	//1.
	private static LazySingleton instance;
	
	//2.
	private LazySingleton(){
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	
	//3.
	public static synchronized LazySingleton getInstance(){//为什么要synchronized
		if(instance==null){
			//延迟加载，真正用的时才候初始化
			//资源利用率高，但是每次调用都要程同步，并发效率低
			instance = new LazySingleton();
		}
		return instance;
	}
	
	//反序列化时，如果定义了本方法有则直接返回本方法的对象，而不需要把反序列化新对象返回
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
