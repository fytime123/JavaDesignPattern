package com.liufuyi.design.iterator;

public class StringCollection implements Collection{

	private String[] strings = {"A","B","C","D","E"}; 
	
	@Override
	public Iterator iterator() {
		return new CursorIterator(this);
	}

	@Override
	public Object get(int i) {
		return strings[i];
	}

	@Override
	public int size() {
		return strings.length;
	}

}
