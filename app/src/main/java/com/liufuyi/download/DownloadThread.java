package com.liufuyi.download;

import java.util.Random;

public class DownloadThread extends Thread{

	private Task task ;
	public DownloadThread(ThreadGroup threadGroup,Task task){
		super(threadGroup, task.getName());
		this.task = task;
	}
	
	@Override
	public void run() {
		
		Random random = new Random();
		
		while(task.getContext().isLoading()){
			try{
				//下面是1/3成功的概率
				System.out.println("下载连接中");
				Thread.sleep(2000);
				
				int i = random.nextInt();
				if(i%3==0){
					System.out.println("连接异常\n");
					throw new Exception();
				}
				if(i%2==0){
					System.out.println("数据流异常\n");
					throw new Exception();
				}
				
				System.out.println("正在下载");
				Thread.sleep(2000);
				
				task.getContext().next();
			}catch (Exception e) {
				e.printStackTrace();
				//下载异常
				task.getContext().interrupt();
				task.getContext().retry();
			}
		}
		System.out.println("------->");
	}
}
