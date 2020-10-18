package com.liufuyi.design.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 3.双重检测锁
 */
public class DCLSingleton implements Serializable{

	
	private static final long serialVersionUID = 1L;
	//1.
	private static DCLSingleton instance; 
	
	//2.
	private DCLSingleton(){
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	
	//3.
	public static DCLSingleton getInstance(){
		//由于编译器优化原因和JVM底层内部模型原因，偶尔出问题，不建议使用
		if(instance==null){
			synchronized (DCLSingleton.class) {
				if(instance==null)
					instance = new DCLSingleton();
			}
		}
		
		return instance;
	}
	
	//反序列化时，如果定义了本方法有则直接返回本方法的对象，而不需要把反序列化新对象返回
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
