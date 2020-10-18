package com.liufuyi.design.state.down;

import java.util.Random;

public class TestDownload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PauseState pauseState = new PauseState();
		
		//初始状态为暂停
		DownloadContext context = new DownloadContext();
		context.setState(pauseState);
		
		try {
			//进入准备
			context.next();
			System.out.println("队列等待下载");
			Thread.sleep(2000);
			//进入下载中
			context.next();
			Random random = new Random();
			
			while(context.isLoading()){
				System.out.println("正在下载");
				try{
					Thread.sleep(2000);
					//下面是1/3成功的概率
					
					System.out.println("下载连接中");
					int i = random.nextInt();
					if(i%3==0){
						System.out.println("连接异常\n");
						throw new Exception();
					}
					if(i%2==0){
						System.out.println("数据流异常\n");
						throw new Exception();
					}
					
					context.next();
				}catch (Exception e) {
					e.printStackTrace();
					//下载异常
					context.interrupt();
					context.retry();
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
