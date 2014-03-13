package com.test4;
/**
 * 支付到银行卡
 * @author zhang
 *
 */
public class Card implements PaymentStrategy {
	public void pay(PaymentContext ctx) {
		//这个新的算法自己知道要使用扩展的支付上下文，所以强制造型一下
		PaymentContext2 ctx2 = (PaymentContext2)ctx;
		System.out.println("现在给"+ctx2.getUserName()+"的"+
				ctx2.getAccount()+"账号支付了"+ctx2.getMoney()+"元");
	}

}
