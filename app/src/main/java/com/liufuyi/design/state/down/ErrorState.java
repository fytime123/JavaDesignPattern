package com.liufuyi.design.state.down;

public class ErrorState extends DownloadState{

	public ErrorState(){
		state = "下载异常";
	}
	
	@Override
	public void next(DownloadContext ctx) {
		ctx.setState(ctx.getPauseState());
	}

	@Override
	public void pause(DownloadContext ctx) {
		ctx.setState(ctx.getPauseState());
	}

	
	@Override
	public void interrupt(DownloadContext ctx) {
		ctx.setState(this);
	}
	
	public void retry(DownloadContext ctx){
		ctx.setState(ctx.getLoadingState());
	}

}
