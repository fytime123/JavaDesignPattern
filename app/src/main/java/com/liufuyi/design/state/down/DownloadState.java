package com.liufuyi.design.state.down;

public abstract class DownloadState {
	
	protected String state;
	
	public abstract void next(DownloadContext ctx);
	
	public abstract void pause(DownloadContext ctx);
	
	public abstract void interrupt(DownloadContext ctx);
	
	public abstract void retry(DownloadContext ctx);
	
	public String getState(){
		return state;
	}
	

}
