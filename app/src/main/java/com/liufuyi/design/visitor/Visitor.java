package com.liufuyi.design.visitor;


public interface Visitor {

	public void visitString(StringElement stringE);

	public void visitFloat(FloatElement floatE);

	public void visitCollection(CollectionElement collection);
}
