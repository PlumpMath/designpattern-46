package com.test4;
/**
 * ֧�����ʵ������ģ�ÿ���˵Ĺ��ʲ�ͬ��֧����ʽҲ��ͬ
 * @author zhang
 *
 */
public class PaymentContext {
	/**
	 * Ӧ��֧�����ʵ�Ա�����򵥵㣬������������
	 */
	private String userName = null;

	/**
	 * Ӧ��֧���Ĺ��ʽ��
	 */
	private double money = 0.0;
	
	/**
	 * ֧�����ʵķ�ʽ�Ĳ��Խӿ�
	 */
	private PaymentStrategy strategy = null;
	
	/**
	 * ���췽�������뱻֧�����ʵ���Ա��Ӧ֧���Ľ��;����֧������
	 * @param userName	��֧�����ʵ���Ա
	 * @param money	Ӧ֧���Ľ��
	 * @param strategy	�����֧������
	 */
	public PaymentContext(String userName,double money,
			PaymentStrategy strategy){
		this.userName = userName;
		this.money = money;
		this.strategy = strategy;
	}
	
	public String getUserName() {
		return userName;
	}

	public double getMoney() {
		return money;
	}
	
	/**
	 * ����֧������
	 */
	public void payNow(){
		//ʹ�ÿͻ�ϣ����֧��������֧������
		this.strategy.pay(this);
	}
}
