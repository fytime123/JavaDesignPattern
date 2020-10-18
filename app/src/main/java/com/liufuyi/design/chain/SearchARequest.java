package com.liufuyi.design.chain;

public class SearchARequest extends Request {

	public SearchARequest(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	public void execute() {
		// request真正具体行为代码
		System.out.println("搜索视频"+ getType());
	}

}
