package com.liufuyi.design.iterator;

public class TestIterator {

	public static void main(String[] args) {
		Collection collection = new StringCollection();

		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
