package com.liufuyi.design.strategy;

public class AdvancedMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {

		System.out.println("对于高级会员为6折");
		return booksPrice * 0.6;
	}
}