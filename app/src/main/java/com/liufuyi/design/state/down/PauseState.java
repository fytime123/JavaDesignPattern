package com.liufuyi.design.state.down;

public class PauseState extends DownloadState{

	public PauseState(){
		state = "暂停";
	}
	
	@Override
	public void next(DownloadContext ctx) {
		ctx.setState(ctx.getReadyState());
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
