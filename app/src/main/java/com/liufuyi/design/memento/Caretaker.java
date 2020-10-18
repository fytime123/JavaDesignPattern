package com.liufuyi.design.memento;

public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(final Memento memento) {
		this.memento = memento;
	}
}
