package com.liufuyi.customer;

import java.util.Random;

public class Warehouse {

	private Goods[] stackGoods = null;
	
	private int pIndex = -1;//当前生产pIndex货架上的货物
	private int cIndex = -1;//当前消费cIndex货架上的货物
	
	private int maxShelfNumber = 10;//货架个数
	
	private int MaxCount = 1000;//年生产量
	
	private int pCount = 0;//总生产数量
	private int cCount = 0;//总消费数量
	
	//生产策略
	private Produce producer;
	//消费策略
	private Consume customer;
	
	
	public Warehouse(int shelfNumber,int count) {
		if(shelfNumber<=0)shelfNumber = 2;
		maxShelfNumber = shelfNumber;
		MaxCount = count;
		stackGoods = new Goods[shelfNumber];
	}
	
	public boolean getCanP(){
		return pCount<MaxCount;
	}
	
	public boolean getCanC(){
		return cCount<MaxCount;
	}
	public synchronized  void product(){
		
		if(pCount>MaxCount){
			//已经完成生产任务，通知可以消费了
			System.out.println("已经完成所有生产任务");
			this.notify();
			return;
		}
		
		if(pCount>=cCount+maxShelfNumber){
			//库存已经满了
			try {
				System.out.println("库存已经满了");
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		pCount++;
		pIndex++;
		pIndex=pIndex%maxShelfNumber;
		
		Goods goods = null;
		//添加生产策略
		if(producer!=null){
			goods = producer.product(pCount, pIndex);
		}else{
			goods = new Goods();
			Random random = new Random();
			goods.work = random.nextInt();
			goods.name = "指数级别";
		}
		
		stackGoods[pIndex] = goods;
		
		System.out.println("生产第"+pIndex+"货物");
			
		//通知可以消费了
		this.notify();
	}
	
	public synchronized Goods cust(){
		
		if(cCount>=MaxCount){
			//消费了所有生产任务
			System.out.println("消费了所有生产产品");
			return null;
		}
		
		if(pCount-cCount<=0){
			try {
				//没有库存，等等生产
				System.out.println("没有库存，等等生产");
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		cCount ++;
		cIndex ++;
		cIndex = cIndex%maxShelfNumber;
		
		Goods goods = stackGoods[cIndex];
		goods.id = cIndex;
		//清理货架
		//stackGoods[cIndex] = null;
		
		//System.out.println("消费"+cIndex+"="+goods.work);
		//通知生产
		this.notify();
		
		//添加消费策略
		if(customer!=null){
			customer.customer(cCount, cIndex,goods);
		}
		
		return goods;
	}
	
	
	public void setProducer(Produce p) {
		this.producer = p;
	}
	
	public void setCustomer(Consume c){
		this.customer = c;
	}
	
	
	/**
	 * 生产消费者模式
	 * @param count 生产消费总量
	 * @param shelfNumber 仓库总存储量
	 * @param p 生产策略
	 * @param c 消费策略
	 */
	public static void startModel(int count, int shelfNumber,Produce p,Consume c){
		
		final Warehouse house = new Warehouse(shelfNumber, count);
		
		house.setProducer(p);
		house.setCustomer(c);
		
		Thread producter = new Thread(){
			public void run() {
				while(house.getCanP()){
					house.product();
				}
			}
		};
		
		Thread customer = new Thread(){
			public void run() {
				while(house.getCanC()){
					Goods goods = house.cust();
//					if(goods!=null)
//						System.out.println("消费"+goods.id+"="+goods.work);
				}
			}
		};
		
		producter.start();
		customer.start();
		
	}
}
