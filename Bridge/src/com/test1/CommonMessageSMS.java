package com.test1;
/**
 * ��վ�ڶ���Ϣ�ķ�ʽ������ͨ��Ϣ
 * @author zhang
 *
 */
public class CommonMessageSMS implements Message {
	public void send(String message, String toUser) {
		System.out.println("ʹ��վ�ڶ���Ϣ�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}

}
