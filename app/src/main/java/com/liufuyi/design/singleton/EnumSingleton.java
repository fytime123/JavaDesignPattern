package com.liufuyi.design.singleton;
/**
 * 5.枚举方式实现单例
 * 
 * 优点：
 * 实现简单
 * 枚举本身就是单例模式。由ＪＶＭ从根本上提供保障，避免了反射和反序列化的漏洞
 * 
 * 缺点：
 * 无延时加载
 * 
 */
public enum EnumSingleton {
	
	INSTANCE;
	
	public void singletonOperation(){
		//功能处理
	}
}
