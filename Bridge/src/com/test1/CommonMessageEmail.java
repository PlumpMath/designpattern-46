package com.test1;
/**
 * ��E-mail�ķ�ʽ������ͨ��Ϣ
 * @author zhang
 *
 */
public class CommonMessageEmail implements Message {
	public void send(String message, String toUser) {
		System.out.println("ʹ��E-mail�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}

}
