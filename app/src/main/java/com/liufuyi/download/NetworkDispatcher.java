package com.liufuyi.download;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class NetworkDispatcher extends Thread {

	public static final int MAX_THREAD_COUNT = 5;

	private BlockingQueue<Task> queue;
	private ThreadGroup threadGroup;
	private boolean working = true;
	

	public NetworkDispatcher() {
		queue = new PriorityBlockingQueue<Task>();
		threadGroup = new ThreadGroup("DocumentDownloads");
		working = true;
	}

	private boolean isFull() {

		return threadGroup.activeCount() >= MAX_THREAD_COUNT;
	}
	

	public void run() {
		while (working) {
			launch();
		}
	}

	public synchronized boolean launch() {

		Task task = null;
		try {

			if (queue.isEmpty()){
				this.wait();
			}
			
			if(isFull()){
				return false;
			}

			if (!working)
				return false;

			task = queue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (task == null)
			return false;
		
		if (task.getContext().isReady()) {
			// 启动一个子线程下载
			task.getContext().next();
			System.out.println(task.getName());

			DownloadThread thread = new DownloadThread(threadGroup, task);
			thread.start();
			return true;
		}

		return false;
	}

	public synchronized void add(Task task) {
		if (task == null)
			return;
		task.getContext().next();
		queue.add(task);
		System.out.println("进入队列，等待下载");
		this.notify();
	}

	public synchronized void over() {
		working = false;
		this.notify();
	}
	
	public synchronized void notifyFree(){
		this.notify();
	}


}
