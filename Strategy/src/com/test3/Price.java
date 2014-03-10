package com.test3;
/**
 * �۸������Ҫ��ɼ�����ͻ������۸�Ĺ���
 * @author zhang
 *
 */
public class Price {
	/**
	 * ����һ������Ĳ��Զ���
	 */
	private Strategy strategy;
	
	/**
	 * ���췽��������һ������Ĳ��Զ���
	 * @param strategy	����Ĳ��Զ���
	 */
	public Price(Strategy strategy){
		this.strategy = strategy;
	}
	
	/**
	 * ���ۣ�����Կͻ��ı���
	 * @param goodsPrice	��Ʒ���۵�ԭ��
	 * @return	��������ģ�Ӧ�ø��ͻ����ļ�
	 */
	public double quote(double goodsPrice){
		return this.strategy.calcPrice(goodsPrice);
	}
}
