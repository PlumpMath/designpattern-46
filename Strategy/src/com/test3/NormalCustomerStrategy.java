package com.test3;
/**
 * �����㷨ʵ�֣�Ϊ�¿ͻ�������ͨ�ͻ�����Ӧ���۸�
 * @author zhang
 *
 */
public class NormalCustomerStrategy implements Strategy {
	public double calcPrice(double goodsPrice) {
		System.out.println("�����¿ͻ���������ͨ�ͻ���û���ۿ�");
		return goodsPrice;
	}

}
