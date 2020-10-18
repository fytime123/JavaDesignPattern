package com.liufuyi.design.composite;

public class Disk extends Equipment { 
	public Disk(String name) { super(name); } 
	//定义Disk实价为1 
	public double netPrice() { return 1.0; } 
	//定义了disk折扣价格是0.5 对折。 
	public double discountPrice() { return 0.5; } 
}
