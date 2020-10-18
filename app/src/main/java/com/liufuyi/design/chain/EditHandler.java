package com.liufuyi.design.chain;

public class EditHandler implements Handler {

	private Handler successor;

	public void setNextHandler(Handler successor){
		this.successor = successor;
	}

	@Override
	public void handleRequest(Request request) {
		
		if(request instanceof EditARequest){
			request.execute();
			System.out.println("success");
		}else if(request instanceof EditBRequest){
			request.execute();
			System.out.println("success");
		}else{
			//传递到下一个
			System.out.println("传递到下一个");
			if(successor!=null)
				successor.handleRequest(request);
		}

	}

}
