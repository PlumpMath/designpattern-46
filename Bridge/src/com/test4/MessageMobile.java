package com.test4;
/**
 * 以手机短消息的方式发送信息
 * @author zhang
 *
 */
public class MessageMobile implements MessageImplementor {
	public void send(String message, String toUser) {
		System.out.println("使用手机短消息的方式，发送信息'"+message+"'给"+toUser);
	}

}
