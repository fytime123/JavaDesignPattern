package com.liufuyi.design.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试5种单例模式效率
 * 
 */
public class TestClient3 {

	public static void main(String[] args) throws Exception {

		int max = 10;
		final CountDownLatch downLatch = new CountDownLatch(max);
		
		long startTime = System.currentTimeMillis();
		
		for (int n = 0; n < max; n++) {
			new Thread() {
				public void run() {
					for (int i = 0; i < 200000; i++) {
						HungrySingleton singleton = HungrySingleton.getInstance();
//						LazySingleton lazySingleton = LazySingleton.getInstance();
//						DCLSingleton dclSingleton = DCLSingleton.getInstance();
//						InnerSingleton innerSingleton = InnerSingleton.getInstance();
//						EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
					}
					downLatch.countDown();
				};
			}.start();
		}
		
		downLatch.await();
		
		long time = System.currentTimeMillis() - startTime;
		System.out.println("耗时:" + time);
	}
}
