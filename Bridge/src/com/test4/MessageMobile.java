package com.test4;
/**
 * ���ֻ�����Ϣ�ķ�ʽ������Ϣ
 * @author zhang
 *
 */
public class MessageMobile implements MessageImplementor {
	public void send(String message, String toUser) {
		System.out.println("ʹ���ֻ�����Ϣ�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}

}
