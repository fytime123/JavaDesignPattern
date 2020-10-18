package com.liufuyi.design.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 测试反射或者反序列化破解单例模式
 * @author liufuyi
 *
 */
public class TestClient2 {

	public static void main(String[] args) throws Exception {
		
		//4.静态内部式
		InnerSingleton in1 = InnerSingleton.getInstance();
		InnerSingleton in2 = InnerSingleton.getInstance();
		System.out.println("4.静态内部式");
		System.out.println("InnerSingleton:"+ in1);
		System.out.println("InnerSingleton:"+ in2);
		
		//反射破解
		Class<InnerSingleton> clazz = (Class<InnerSingleton>)Class.forName("com.liufuyi.design.singleton.InnerSingleton");
		Constructor<InnerSingleton> constructor = clazz.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		InnerSingleton in3 = (InnerSingleton)constructor.newInstance();
		InnerSingleton in4 = (InnerSingleton)constructor.newInstance();
		System.out.println("反射破解单例：");
		System.out.println("InnerSingleton:"+ in3);
		System.out.println("InnerSingleton:"+ in4);
		
		//反序列化破解
		FileOutputStream outputStream = new FileOutputStream("E:/singleton.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(in1);
		objectOutputStream.close();
		outputStream.close();
		objectOutputStream = null;
		outputStream = null;
		
		FileInputStream inputStream = new FileInputStream("E:/singleton.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		InnerSingleton in5 = (InnerSingleton)objectInputStream.readObject();
		System.out.println("反序列化破解:");
		System.out.println("InnerSingleton:"+ in5);
		
		objectInputStream.close();
		inputStream.close();
		objectInputStream = null;
		inputStream = null;
		
	}
}
