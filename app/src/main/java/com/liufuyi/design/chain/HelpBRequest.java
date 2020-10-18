package com.liufuyi.design.chain;

public class HelpBRequest extends Request {

	public HelpBRequest(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public void execute() {
		// request真正具体行为代码
		System.out.println("显示帮助B提示"+getType());
	}

}
