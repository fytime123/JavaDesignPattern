package com.liufuyi.design.factory.abstractfactory;

public interface Tyre {

	public void skill();
}

class LuxuryTyre implements Tyre{
	@Override
	public void skill() {
		System.out.println("轮胎：雨雪天不打滑，抓地性能好，耐磨");
	}
}
class LowerTyre implements Tyre{
	@Override
	public void skill() {
		System.out.println("轮胎：雨雪天有些飘，抓地性能普通，易磨损");
	}
}