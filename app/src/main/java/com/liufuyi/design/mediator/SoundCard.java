package com.liufuyi.design.mediator;

import com.liufuyi.design.mediator.Mediator.ColleagueName;

public class SoundCard extends Colleague {

	public SoundCard(Mediator mediator) {
		super(mediator);
		if(mediator!=null)
			mediator.register(ColleagueName.SOUND_CARD.name, this);
	}

	// 播放声音数据源
	public void play(String data) {
		System.out.println("您正在听：" + data);
	}

}
