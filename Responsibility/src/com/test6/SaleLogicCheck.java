package com.test6;
/**
 * ���������߼�����ְ�����
 * @author zhang
 *
 */
public class SaleLogicCheck extends SaleHandler {
	public boolean sale(String user, String customer, SaleModel saleModel) {
		//�������ݵ��߼���飬������ID��Ψһ�ԣ�������Ķ�Ӧ��ϵ��
		//����Ӧ�ü������������Ķ�Ӧ��ϵ������������Ʒ�Ƿ����
		//Ϊ����ʾ�򵥣�ֱ��ͨ��
		
		//���ͨ��������ļ�⣬�Ǿ����¼���ִ��
		return this.successor.sale(user, customer, saleModel);
	}
}
