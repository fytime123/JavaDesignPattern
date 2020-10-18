package com.liufuyi.design.mediator;

public class TestMediator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 //1.创建中介者——主板对象
		ConcreteMediator mediator = new ConcreteMediator();
		
		 //2.创建同事类
		CDDriver cdDriver = new CDDriver(mediator);
		CPU cpu = new CPU(mediator);
		SoundCard soundCard = new SoundCard(mediator); 
		VideoCard videoCard = new VideoCard(mediator);
		
		//3.让中介知道所有的同事
//		mediator.setCPU(cpu);
//		mediator.setCDDriver(cdDriver);
//		mediator.setSoundCard(soundCard);
//		mediator.setVideoCard(videoCard);
		
		//4.开始看电影
		cdDriver.readCD();
		
	}

}
