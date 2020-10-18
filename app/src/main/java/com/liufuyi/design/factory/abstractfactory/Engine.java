package com.liufuyi.design.factory.abstractfactory;

public interface Engine {

	public void run();
	
}

class LuxuryEngine implements Engine{
	@Override
	public void run() {
		System.out.println("发动机：10秒加速到120km/s,稳定性高");
	}
}
class LowerEngine implements Engine{
	@Override
	public void run() {
		System.out.println("发动机：2分钟加速到100km/s,不是很稳定");
	}
}
