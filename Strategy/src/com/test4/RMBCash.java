package com.test4;
/**
 * 人民币现金支付
 * @author zhang
 *
 */
public class RMBCash implements PaymentStrategy {
	public void pay(PaymentContext ctx) {
		System.out.println("现在给"+ctx.getUserName()+"人民币现金支付"+
				ctx.getMoney()+"元");
	}

}
