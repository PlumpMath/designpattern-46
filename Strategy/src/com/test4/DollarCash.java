package com.test4;
/**
 * 美元现金支付
 * @author zhang
 *
 */
public class DollarCash implements PaymentStrategy {
	public void pay(PaymentContext ctx) {
		System.out.println("现在给"+ctx.getUserName()+"美元现金支付"+
				ctx.getMoney()+"元");
	}

}
