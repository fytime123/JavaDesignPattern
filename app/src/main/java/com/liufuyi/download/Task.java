package com.liufuyi.download;

import com.liufuyi.design.state.down.DownloadContext;
import com.liufuyi.design.state.down.PauseState;

public class Task implements Comparable<Task> {

	private String url;
	private String name;
	private DownloadContext context;
	private int priority;

	public Task() {
		context = new DownloadContext();
		PauseState pauseState = context.getPauseState();
		context.setState(pauseState);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DownloadContext getContext() {
		return context;
	}

	public void setContext(DownloadContext context) {
		this.context = context;
	}

	@Override
	public int compareTo(Task task) {

		return priority - task.priority;
	}

}
