package com.test3;
/**
 * �����㷨ʵ�֣�Ϊ��ͻ�����Ӧ���۸�
 * @author zhang
 *
 */
public class LargeCustomerStrategy implements Strategy {
	public double calcPrice(double goodsPrice) {
		System.out.println("���ڴ�ͻ���ͳһ�ۿ�10%");
		return goodsPrice*(1-0.1);
	}

}
