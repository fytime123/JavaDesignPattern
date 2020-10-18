package com.liufuyi.design.mediator;

public abstract class Colleague {

	// 持有中介者对象的引用，因为每个同事类都应该知道中介者对象
	private Mediator mediator;

	// 构造函数，传入中介者对象
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	// 得到当前同事类的中介者对象
	public Mediator getMediator() {
		return this.mediator;
	}

}
