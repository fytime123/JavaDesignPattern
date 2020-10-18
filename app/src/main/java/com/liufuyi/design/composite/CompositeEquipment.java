package com.liufuyi.design.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CompositeEquipment extends Equipment {

	private int i = 0;
	// 定义一个Vector 用来存放'儿子'
	private List<Equipment> equipment = new ArrayList<Equipment>();

	public CompositeEquipment(String name) {
		super(name);
	}

	public boolean add(Equipment equipment) {
		this.equipment.add(equipment);
		return true;
	}

	public double netPrice() {
		double netPrice = 0;
		Iterator<Equipment> iter = equipment.iterator();
		while (iter.hasNext())
			netPrice += ((Equipment) iter.next()).netPrice();
		return netPrice;
	}

	public double discountPrice() {
		double discountPrice = 0;
		Iterator<Equipment> iter = equipment.iterator();
		while (iter.hasNext())
			discountPrice += ((Equipment) iter.next()).discountPrice();
		return discountPrice;
	}

	// 注意这里，这里就提供用于访问自己组合体内的部件方法。
	// 上面dIsk 之所以没有，是因为Disk是个单独(Primitive)的元素.
	public Iterator<Equipment> iter() {
		return equipment.iterator();
	}

	// 重载Iterator方法
	public boolean hasNext() {
		return i < equipment.size();
	}

	// 重载Iterator方法
	public Equipment next() {
		if (hasNext())
			return equipment.get(i++);
		else
			throw new NoSuchElementException();
	}
}
