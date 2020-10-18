package com.liufuyi.design.command;

public class PlayerInvoker {

	private Player player;
	
	public PlayerInvoker(){
		player = new Player();
	}
	
	public void turn(Command command){
		command.execute(player);
	}
	
}
