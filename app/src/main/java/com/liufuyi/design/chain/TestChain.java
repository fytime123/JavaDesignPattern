package com.liufuyi.design.chain;

public class TestChain {

	public static void main(String[] args) {

		// 创建指责链的所有节点
		HelpHandler helpHandler = new HelpHandler();
		EditHandler editHandler = new EditHandler();
		SearchHandler searchHandler = new SearchHandler();

		// 进行链的组装，即头尾相连，一层套一层
		helpHandler.setNextHandler(editHandler);
		editHandler.setNextHandler(searchHandler);

		// 创建请求并提交到指责链中进行处理
		Request request1 = new HelpARequest("001");
		Request request2 = new EditBRequest("format word");
		Request request3 = new SearchARequest("热门电影");

		// 每次提交都是从链头开始遍历
		helpHandler.handleRequest(request1);
		helpHandler.handleRequest(request2);
		helpHandler.handleRequest(request3);

	}
}
