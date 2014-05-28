package com.test4;
/**
 * �������Ϣ����
 * @author zhang
 *
 */
public abstract class AbstractMessage {
	/**
	 * ���췽��
	 */
	public AbstractMessage(){
		//����ʲô��������
	}
	
	/**
	 * ������Ϣ��ת��ʵ�ֲ��ֵķ���
	 * @param message	Ҫ���͵���Ϣ����
	 * @param toUser	��Ϣ���͵�Ŀ����Ա
	 */
	public void sendMessage(String message,String toUser){
		this.getImpl(message).send(message, toUser);
	}
	
	/**
	 * ������Ϣ�ĳ���ѡ����ʵ�ʵ��
	 * @param message	Ҫ���͵���Ϣ
	 * @return	���ʵ�ʵ�ֶ���
	 */
	protected MessageImplementor getImpl(String message){
		MessageImplementor impl = null;
		if(message == null){
			//���û����Ϣ��Ĭ��ʹ��վ�ڶ���Ϣ
			impl = new MessageSMS();
		}else if(message.length() < 100){
			//�����Ϣ������100���ڣ�ʹ���ֻ�����Ϣ
			impl = new MessageMobile();
		}else if(message.length() < 1000){
			//�����Ϣ������100~1000���ڣ�ʹ��վ����Ϣ
			impl = new MessageSMS();
		}else{
			//�����Ϣ������1000����
			impl = new MessageEmail();
		}
		return impl;
	}
}
