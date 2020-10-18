package com.liufuyi.design.strategy;

public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        
        System.out.println("对于初级会员为95折");
        return booksPrice*0.95;
    }

}