package com.liufuyi.design.chain;

public class SearchBRequest extends Request {

	public SearchBRequest(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	public void execute() {
		// request真正具体行为代码
		System.out.println("搜索图片"+ getType());
	}

}

