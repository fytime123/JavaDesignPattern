package com.liufuyi.design.flyweight;


public class ConcreteFlyweight implements Flyweight{

	private String imageName;

	private String imageData;
	
	public ConcreteFlyweight(String name) {
		imageName = name;
	}
	
	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public String getImageData() {
		return imageData;
	}


	public void setImageData(String imageData) {
		this.imageData = imageData;
	}


	@Override
	public void operation(ExtrinsicState state) {
		//具体操作
		
		System.out.println("显示图片 "+imageName+" 在ListView的第"+ state.getItem() + "个位置");
		
	}

}
