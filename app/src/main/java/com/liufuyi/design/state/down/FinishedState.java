package com.liufuyi.design.state.down;

public class FinishedState extends DownloadState{

	public FinishedState(){
		state = "下载完成";
	}
	
	@Override
	public void next(DownloadContext ctx) {
		ctx.setState(this);
	}

	@Override
	public void pause(DownloadContext ctx) {
		ctx.setState(this);
	}

	@Override
	public void interrupt(DownloadContext ctx) {
		ctx.setState(this);
	}
	
	public void retry(DownloadContext ctx){
		ctx.setState(this);
	}

}
