package com.test4;
/**
 * ��Ԫ�ֽ�֧��
 * @author zhang
 *
 */
public class DollarCash implements PaymentStrategy {
	public void pay(PaymentContext ctx) {
		System.out.println("���ڸ�"+ctx.getUserName()+"��Ԫ�ֽ�֧��"+
				ctx.getMoney()+"Ԫ");
	}

}
