package com.test4;
/**
 * ֧�������п�
 * @author zhang
 *
 */
public class Card implements PaymentStrategy {
	public void pay(PaymentContext ctx) {
		//����µ��㷨�Լ�֪��Ҫʹ����չ��֧�������ģ�����ǿ������һ��
		PaymentContext2 ctx2 = (PaymentContext2)ctx;
		System.out.println("���ڸ�"+ctx2.getUserName()+"��"+
				ctx2.getAccount()+"�˺�֧����"+ctx2.getMoney()+"Ԫ");
	}

}
