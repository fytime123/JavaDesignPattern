package com.liufuyi.design.mediator;

public interface Mediator {
	

	public void change(ColleagueName name );
	
	public void register(String key,Colleague colleague);
	
	public enum ColleagueName{
		CD("CD",0),CPU("CPU",1),SOUND_CARD("SOUND_CARD",2),VIDEO_CARD("VIDEO_CARD",3);
		
		String name;
		int id;
		ColleagueName(String name,int id){
			this.name = name;
			this.id = id;
		}
	}
}
