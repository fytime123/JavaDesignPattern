package com.liufuyi.design.state.down;

public class DownloadContext {

	private final static int MAX_RETRY_COUNT = 3;// 最大重试次数
	private DownloadState state;
	private int retryCount;// 已经重试次数

	private PauseState pauseState;
	private ReadyState readyState;
	private LoadingState loadingState;
	private ErrorState errorState;
	private FinishedState finishedState;

	public void setState(DownloadState state) {
		this.state = state;
	}

	public void next() {
		state.next(this);
		System.out.println("state=" + getState());
	}

	public void pause() {
		state.pause(this);
		System.out.println("state=" + getState());
	}

	public void interrupt() {
		state.interrupt(this);
		System.out.println("state=" + getState());
	}

	public void retry() {
		if (retryCount < MAX_RETRY_COUNT){
			System.out.println("等待" + (retryCount + 1) + "秒重试");
			try {
				Thread.sleep((retryCount+1) * 1000);
				System.out.println("重试第" + (retryCount + 1) + "次");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			state.retry(this);
		}else{
			state.interrupt(this);
		}
		retryCount++;
		System.out.println("state=" + getState());
	}

	
	
	
	public String getState() {
		return state.getState();
	}

	public boolean isPause(){
		return state == pauseState;
	}
	
	public boolean isReady(){
		return state == readyState;
	}
	
	public boolean isLoading(){
		return state == loadingState;
	}
	
	public boolean isError(){
		return state == errorState;
	}
	
	public boolean isFinished(){
		return state == finishedState;
	}
	
	
	public PauseState getPauseState() {
		if (pauseState == null)
			pauseState = new PauseState();
		return pauseState;
	}

	public ReadyState getReadyState() {
		if (readyState == null)
			readyState = new ReadyState();
		return readyState;
	}

	public LoadingState getLoadingState() {
		if (loadingState == null)
			loadingState = new LoadingState();
		return loadingState;
	}

	public ErrorState getErrorState() {
		if (errorState == null)
			errorState = new ErrorState();
		return errorState;
	}

	public FinishedState getFinishedState() {
		if (finishedState == null)
			finishedState = new FinishedState();
		return finishedState;
	}

}
