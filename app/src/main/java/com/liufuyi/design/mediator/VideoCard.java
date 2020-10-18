package com.liufuyi.design.mediator;

import com.liufuyi.design.mediator.Mediator.ColleagueName;

public class VideoCard extends Colleague {

	public VideoCard(Mediator mediator) {
		super(mediator);
		if(mediator!=null)
			mediator.register(ColleagueName.VIDEO_CARD.name, this);
	}

	// 显示视频数据源
	public void show(String data) {
		System.out.println("您正在看：" + data);
	}

}
