package com.test4;
/**
 * ������ֽ�֧��
 * @author zhang
 *
 */
public class RMBCash implements PaymentStrategy {
	public void pay(PaymentContext ctx) {
		System.out.println("���ڸ�"+ctx.getUserName()+"������ֽ�֧��"+
				ctx.getMoney()+"Ԫ");
	}

}
