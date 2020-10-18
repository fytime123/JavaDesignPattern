package com.liufuyi.design.state.down;

public class ReadyState extends DownloadState{

	public ReadyState(){
		state = "准备就绪";
	}
	
	@Override
	public void next(DownloadContext ctx) {
		ctx.setState(ctx.getLoadingState());
	}

	@Override
	public void pause(DownloadContext ctx) {
		ctx.setState(ctx.getPauseState());
	}

	@Override
	public void interrupt(DownloadContext ctx) {
		ctx.setState(ctx.getPauseState());
	}
	
	public void retry(DownloadContext ctx){
		ctx.setState(this);
	}

}
