package com.test4;
/**
 * ��E-mail�ķ�ʽ������Ϣ
 * @author zhang
 *
 */
public class MessageEmail implements MessageImplementor {
	public void send(String message, String toUser) {
		System.out.println("ʹ��E-mail�ķ�ʽ��������Ϣ'"
							+message+"'��"+toUser);
	}

}
