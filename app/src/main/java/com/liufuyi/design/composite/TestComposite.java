package com.liufuyi.design.composite;

public class TestComposite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Chassis chassis=new Chassis("PC Chassis");
		//将一个10GB的硬盘装到 PC Chassis (将硬盘装到盘盒里)
		chassis.add(new Disk("10 GB"));
		
		Cabinet cabinet=new Cabinet("Tower");
		//将PC Chassis装到Tower中 (将盘盒装到箱子里)
		cabinet.add(chassis);
		
		
		//调用 netPrice()方法; 
		System.out.println("netPrice="+cabinet.netPrice()); 
		System.out.println("discountPrice="+cabinet.discountPrice());
	}

}
