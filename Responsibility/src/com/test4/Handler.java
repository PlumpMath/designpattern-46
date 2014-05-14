package com.test4;
/**
 * ����ְ�����Ľӿ�
 * @author zhang
 *
 */
public abstract class Handler {
	/**
	 * ������һ����������Ķ���
	 */
	protected Handler successor = null;
	
	/**
	 * ������һ����������Ķ���
	 * @param successor	��һ����������Ķ���
	 */
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	
	/**
	 * ����۲ͷ��õ�����
	 * @param user	������
	 * @param fee	�����Ǯ��
	 * @return	�ɹ���ʧ�ܵľ���֪ͨ
	 */
	public abstract String handleFeeRequest(String user,double fee);
	
	/**
	 * ����Ԥ֧���÷��õ�����
	 * @param user	������
	 * @param fee	�����Ǯ��	
	 * @return	�Ƿ�ͬ��
	 */
	public abstract boolean handlePrePreFeeRequest(String user,double requestNum);
}
