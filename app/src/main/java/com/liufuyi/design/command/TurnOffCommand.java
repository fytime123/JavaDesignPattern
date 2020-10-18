package com.liufuyi.design.command;

public class TurnOffCommand implements Command {

	private String log;
	
	private int something;
	
	public TurnOffCommand(String name, int something){
		this.log = name;
		this.something = something;
	}
	

	public void execute(Player player) {
		player.turnOff();
		System.out.println("播放记录名称"+ log + "时间="+something);
	}

}
