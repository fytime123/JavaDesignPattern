package com.liufuyi.design.chain;

public class EditBRequest extends Request {

	public EditBRequest(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	public void execute() {
		// request真正具体行为代码
		System.out.println("编辑B格式"+ getType());
	}

}