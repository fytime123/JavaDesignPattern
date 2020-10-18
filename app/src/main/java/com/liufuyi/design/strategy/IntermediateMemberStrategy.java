package com.liufuyi.design.strategy;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {

		System.out.println("对于中级会员为8折");
		return booksPrice * 0.8;
	}

}
