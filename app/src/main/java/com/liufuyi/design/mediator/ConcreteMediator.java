package com.liufuyi.design.mediator;

import java.util.HashMap;

public class ConcreteMediator implements Mediator {

	
	private HashMap<String, Colleague> hashMap ;
	
	public ConcreteMediator(){
		hashMap = new HashMap<String, Colleague>();
	}
	@Override
	public void register(String key, Colleague colleague) {
		if(!hashMap.containsKey(key))
			hashMap.put(key, colleague);
	}


	public void change(ColleagueName name) {
		if (name == ColleagueName.CD) {
			CDDriver cdDriver = (CDDriver)hashMap.get(ColleagueName.CD.name);
			readAndHandleData(cdDriver);
			
		} else if (name == ColleagueName.CPU) {
			CPU cpu = (CPU)hashMap.get(ColleagueName.CPU.name);
			showAndPlay(cpu);
		}
	}

	// 打开CD，并读取数据
	private void readAndHandleData(CDDriver driver) {
		// 获取光驱读取的数据
		String data = driver.getData();
		// 把这些数据传递给CPU进行处理
		CPU cpu = (CPU)hashMap.get(ColleagueName.CPU.name);
		cpu.executeData(data);
	}

	// CPU处理
	private void showAndPlay(CPU cpu) {
		// 获取数据
		String videoData = cpu.getVideioData();
		String soundData = cpu.getSoundData();

		// 显示数据
		VideoCard video = (VideoCard)hashMap.get(ColleagueName.VIDEO_CARD.name);
		SoundCard sound = (SoundCard)hashMap.get(ColleagueName.SOUND_CARD.name);
		video.show(videoData);
		sound.play(soundData);

	}



}
