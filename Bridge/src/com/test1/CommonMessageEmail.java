package com.test1;
/**
 * 以E-mail的方式发送普通消息
 * @author zhang
 *
 */
public class CommonMessageEmail implements Message {
	public void send(String message, String toUser) {
		System.out.println("使用E-mail的方式，发送消息'"+message+"'给"+toUser);
	}

}
