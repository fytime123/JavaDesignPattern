package com.liufuyi.customer;


public class Comsumer implements Consume {

	@Override
	public void customer(int cCount, int index, Goods goods) {
		if(cCount>100 && cCount<200){
			System.out.println("消费"+goods.id+"="+goods.work +"  "+goods.name);
		}else{
			System.out.println("消费"+goods.id+"="+goods.work );
		}
	}

}
