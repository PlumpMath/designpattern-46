package com.test6;
/**
 * ������������ҵ���ܵ�ְ�����
 * @author zhang
 *
 */
public class SaleMgr extends SaleHandler {
	public boolean sale(String user, String customer, SaleModel saleModel) {
		//����������ҵ���߼�����
		System.out.println(user+"������"+customer+"����"+saleModel+" ����������");
		return true;
	}

}
