package com.liufuyi.design.visitor;

import java.util.Iterator;

public class ConcreteVisitor implements Visitor{

	@Override
	public void visitString(StringElement stringE) {
		
		String string  = stringE.getValue();
		System.out.println(string);
		
	}

	@Override
	public void visitFloat(FloatElement floatE) {
		
		float f = floatE.getValue();
		System.out.println("------->"+f);
	}

	@Override
	public void visitCollection(CollectionElement collection) {
		
		Iterator<Visitable> iterator = collection.getValue().iterator();
		while(iterator.hasNext()){
			Visitable visitable = iterator.next();
			visitable.accept(this);
		}
		
	}

}
