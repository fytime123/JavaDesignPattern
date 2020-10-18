package com.liufuyi.design.command;

public class TurnOnCommand implements Command {  
  
	private String fileName;
	
	private int volume ;
	
	public TurnOnCommand(String fileName, int volume){
		this.fileName = fileName;
		this.volume = volume;
		
	}
      
    public void execute(Player player) {
    	System.out.println("查找打开路径"+ fileName);
    	System.out.println("初始化音量"+ volume);
        player.turnOn();  
    }  
  
}  