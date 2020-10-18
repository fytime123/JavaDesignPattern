package com.liufuyi.design.command;

public class NextCommand implements Command {

	private String name;
	
	public NextCommand(String name){
		this.name = name;
	}

	public void execute(Player player) {
		
		System.out.println("查找到打开路径"+ name + ",开始下一首");
		player.next();
	}

}
