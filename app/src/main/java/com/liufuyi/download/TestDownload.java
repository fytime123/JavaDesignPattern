package com.liufuyi.download;

public class TestDownload {

	public static void main(String[] args) {
		
		final NetworkDispatcher dispatcher = new NetworkDispatcher();
		dispatcher.start();
		
		Thread thread = new Thread(){
			@Override
			public void run() {
				int i = 0;
				while (i<6){
					i++;
					Task task = new Task();
					task.setName("name"+ i);
					task.setUrl("url"+i);
					
					dispatcher.add(task);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				try {
					Thread.sleep(60*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dispatcher.over();
			}
		};
		thread.start();
		
	}
}
