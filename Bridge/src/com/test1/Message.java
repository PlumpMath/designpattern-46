package com.test1;
/**
 * ��Ϣ��ͳһ�ӿ�
 * @author zhang
 *
 */
public interface Message {
	/**
	 * ������Ϣ
	 * @param message	Ҫ���͵���Ϣ����
	 * @param toUser	��Ϣ���͵�Ŀ����Ա
	 */
	public void send(String message,String toUser);
}
