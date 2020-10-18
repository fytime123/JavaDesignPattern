package com.liufuyi.design.chain;

public class HelpARequest extends Request {

	public HelpARequest(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public void execute() {
		// request真正具体行为代码
		System.out.println("显示帮助A提示"+getType());
	}

}
