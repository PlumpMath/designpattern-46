package com.test4;
/**
 * 支付到银行
 * @author zhang
 *
 */
public class Card2 implements PaymentStrategy {
	/**
	 * 账号信息
	 */
	private String account = "";
	
	/**
	 * 构造方法，传入账号信息
	 * @param account	账号信息
	 */
	public Card2(String account){
		this.account = account;
	}
	
	public void pay(PaymentContext ctx) {
		System.out.println("现在给"+ctx.getUserName()+"的"+
				this.account+"账号支付了"+ctx.getMoney()+"元");
	}

}
