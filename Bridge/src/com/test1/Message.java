package com.test1;
/**
 * 消息的统一接口
 * @author zhang
 *
 */
public interface Message {
	/**
	 * 发送消息
	 * @param message	要发送的消息内容
	 * @param toUser	消息发送的目的人员
	 */
	public void send(String message,String toUser);
}
