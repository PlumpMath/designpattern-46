package com.test3;
/**
 * �����߽ӿ�
 * @author zhang
 *
 */
public interface Visitor {
	/**
	 * ������ҵ�ͻ����൱�ڸ���ҵ�ͻ���ӷ����ߵĹ���
	 * @param ec
	 */
	public void visitEnterpriseCustomer(EnterpriseCustomer ec);
	
	/**
	 * ���ʸ��˿ͻ����൱�ڸ����˿ͻ���ӷ����ߵĹ���
	 * @param pc
	 */
	public void visitPersonalCustomer(PersonalCustomer pc);
}
