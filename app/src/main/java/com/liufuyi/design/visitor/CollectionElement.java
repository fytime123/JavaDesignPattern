package com.liufuyi.design.visitor;

import java.util.Collection;

public class CollectionElement implements Visitable{

	private Collection<Visitable> collection;
	
	public CollectionElement(Collection<Visitable> c){
		collection = c;
	}
	
	public Collection<Visitable> getValue(){
		return collection;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitCollection(this);
	}

}
