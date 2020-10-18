package com.liufuyi.design.visitor;

import java.util.ArrayList;
import java.util.Collection;

public class TestVistor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		StringElement element = new StringElement("单个元素访问");
		
		Collection<Visitable> collection = new ArrayList<Visitable>();
		StringElement item1 = new StringElement("第1个");
		StringElement item2 = new StringElement("第2个");
		StringElement item3 = new StringElement("第3个");
		FloatElement item4 = new FloatElement(1.0f);
		collection.add(item1);
		collection.add(item2);
		collection.add(item3);
		collection.add(item4);
		
		CollectionElement collectionElement = new CollectionElement(collection);
		
		//访问者
		Visitor visitor = new ConcreteVisitor();
		
		//接受访问
		element.accept(visitor);
		collectionElement.accept(visitor);
	}

}
