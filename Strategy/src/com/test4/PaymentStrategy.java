package com.test4;
/**
 * ֧�����ʵĲ��Խӿڣ���˾�ж���֧�����ʵ��㷨
 * �����ֽ����п����ֽ�ӹ�Ʊ���ֽ����Ȩ����Ԫ֧����
 * @author zhang
 *
 */
public interface PaymentStrategy {
	/**
	 * ��˾��ĳ������֧���Ĺ���
	 * @param ctx	֧�����ʵ������ģ���������㷨��Ҫ������
	 */
	public void pay(PaymentContext ctx);
}
