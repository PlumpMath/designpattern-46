package com.test3;
/**
 * �����㷨ʵ�֣�Ϊ�Ͽͻ�����Ӧ���۸�
 * @author zhang
 *
 */
public class OldCustomerStrategy implements Strategy {
	public double calcPrice(double goodsPrice) {
		System.out.println("�����Ͽͻ���ͳһ�ۿ�5%");
		return goodsPrice*(1-0.05);
	}

}
