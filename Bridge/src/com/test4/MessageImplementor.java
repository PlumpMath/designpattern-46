package com.test4;
/**
 * ʵ�ַ�����Ϣ��ͳһ�ӿ�
 * @author zhang
 *
 */
public interface MessageImplementor {
	/**
	 * ������Ϣ
	 * @param message	Ҫ���͵���Ϣ����
	 * @param toUser	��Ϣ���͵�Ŀ����Ա
	 */
	public void send(String message,String toUser);
}
