package com.test4;
/**
 * ��վ�ڶ���Ϣ�ķ�ʽ������Ϣ
 * @author zhang
 *
 */
public class MessageSMS implements MessageImplementor {
	public void send(String message, String toUser) {
		System.out.println("ʹ��վ�ڶ���Ϣ�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}

}
