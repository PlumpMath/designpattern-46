package com.test4;
/**
 * ��չ��֧�������Ķ���
 * @author zhang
 *
 */
public class PaymentContext2 extends PaymentContext {
	/**
	 * �����˺�
	 */
	private String account = null;
	
	/**
	 * ���췽��������Ӧ��֧�����ʵ���Ա��Ӧ֧���Ľ��;����֧������
	 * @param userName	��֧�����ʵ���Ա
	 * @param money	Ӧ֧���Ľ��
	 * @param account	֧�����������˺�
	 * @param strategy	�����֧������
	 */
	public PaymentContext2(String userName, double money,String account,
			PaymentStrategy strategy) {
		super(userName, money, strategy);
		this.account = account;
	}
	
	public String getAccount(){
		return this.account;
	}

}
