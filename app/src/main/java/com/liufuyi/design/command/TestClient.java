package com.liufuyi.design.command;

public class TestClient {

	public static void main(String[] args) {

		//一个命定必须要有命定的内容和命定的执行者
		TurnOnCommand turnOnCommand = new TurnOnCommand("c:/my/music/test.mp3", 60);
		NextCommand nextCommand = new NextCommand("d:/xiao/经典/小苹果.mp3");
		TurnOffCommand turnOffCommand = new TurnOffCommand("我的播放记录.log", 160);

		
		
		//客户端收到command执行
		PlayerInvoker invoker = new PlayerInvoker();
		invoker.turn(turnOnCommand);
		invoker.turn(nextCommand);
		invoker.turn(turnOffCommand);

	}
}
