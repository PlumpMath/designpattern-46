package com.test2;
/**
 * ְ��Ľӿڣ�Ҳ���Ǵ�������Ľӿ�
 * @author zhang
 *
 */
public abstract class Handler {
	/**
	 * ���к�̵�ְ�����
	 */
	protected Handler successor;
	
	/**
	 * ���ú�̵�ְ�����
	 * @param successor	��̵�ְ�����
	 */
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	
	/**
	 * ʾ�⴦������ķ�������Ȼ���ʾ�ⷽ����û�д��������
	 * ��ʵ���ǿ��Դ�������ģ����ݾ�����Ҫ��ѡ���Ƿ񴫵ݲ���
	 */
	public abstract void handleRequest();
}
