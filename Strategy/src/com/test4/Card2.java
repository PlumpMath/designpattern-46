package com.test4;
/**
 * ֧��������
 * @author zhang
 *
 */
public class Card2 implements PaymentStrategy {
	/**
	 * �˺���Ϣ
	 */
	private String account = "";
	
	/**
	 * ���췽���������˺���Ϣ
	 * @param account	�˺���Ϣ
	 */
	public Card2(String account){
		this.account = account;
	}
	
	public void pay(PaymentContext ctx) {
		System.out.println("���ڸ�"+ctx.getUserName()+"��"+
				this.account+"�˺�֧����"+ctx.getMoney()+"Ԫ");
	}

}
