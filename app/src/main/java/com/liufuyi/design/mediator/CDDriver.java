package com.liufuyi.design.mediator;

import com.liufuyi.design.mediator.Mediator.ColleagueName;

public class CDDriver extends Colleague {

	// 光驱读取出来的数据

	private String data = null;

	public CDDriver(Mediator mediator) {
		super(mediator);
		if(mediator!=null)
			mediator.register(ColleagueName.CD.name, this);
	}

	// 获取光驱读取出来的数据
	public String getData() {
		return this.data;
	}

	public void readCD() {
		// 逗号前是视频数据，逗号后是声音数据
		this.data = "<<视频数据>>+<<声音数据>>";

		// 通知主板，自己的状态反生了改变
		this.getMediator().change(ColleagueName.CD);
	}

}
