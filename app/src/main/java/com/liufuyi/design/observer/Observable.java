package com.liufuyi.design.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable {

	private List<Observer> list = new ArrayList<Observer>();
	
	public void notifyObservers(Object msg){
		
		Iterator<Observer> iterator = list.iterator();
		while(iterator.hasNext()){
			Observer observer = iterator.next();
			observer.update(this, msg);
		}
		
	}
	
	public void addObserver(Observer observer){
		list.add(observer);
	}
}
