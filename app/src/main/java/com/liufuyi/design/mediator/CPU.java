package com.liufuyi.design.mediator;

import com.liufuyi.design.mediator.Mediator.ColleagueName;

public class CPU extends Colleague {

	// 分解出来的视频数据
	private String videioData = null;

	// 分解出来的视频数据
	private String soundData = null;

	public CPU(Mediator mediator) {
		super(mediator);
		if(mediator!=null)
			mediator.register(ColleagueName.CPU.name, this);
	}

	// 获取分解出来的视频数据
	public String getVideioData() {
		return this.videioData;
	}

	//获取分解出来的声音数据
	public String getSoundData() {
		return this.soundData;
	}

	//处理数据
	public void executeData(String data) {
		String[] ss = data.split("\\+");
		this.videioData = ss[0];
		this.soundData = ss[1];

		// 通知主板，CPU工作已完成
		this.getMediator().change(ColleagueName.CPU);
	}

}
