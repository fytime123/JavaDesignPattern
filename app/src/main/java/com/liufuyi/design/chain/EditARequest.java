package com.liufuyi.design.chain;

public class EditARequest extends Request {

	public EditARequest(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	public void execute() {
		// request真正具体行为代码
		System.out.println("编辑A格式"+ getType());
	}

}
