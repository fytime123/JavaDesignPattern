package com.liufuyi.design.state.down;

public class LoadingState extends DownloadState{

	public LoadingState(){
		state = "下载中";
	}
	
	@Override
	public void next(DownloadContext ctx) {
		ctx.setState(ctx.getFinishedState());
	}

	@Override
	public void pause(DownloadContext ctx) {
		ctx.setState(ctx.getPauseState());
	}

	@Override
	public void interrupt(DownloadContext ctx) {
		ctx.setState(ctx.getErrorState());
	}
	
	public void retry(DownloadContext ctx){
		ctx.setState(this);
	}

}
