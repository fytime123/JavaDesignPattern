package com.liufuyi.customer;

import java.util.Random;

public class Producer implements Produce {

	@Override
	public Goods product(int pCount, int index) {
		Goods goods = null;
		if(pCount>100 && pCount<200){
			goods = new Goods();
			Random random = new Random();
			goods.work = random.nextInt();
			goods.name = "指数级别";
		}else{
			goods = new Goods();
			Random random = new Random();
			goods.work = random.nextInt();
		}
		return goods;
	}

}
