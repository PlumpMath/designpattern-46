package com.test2;
/**
 * �����Ķ���ͨ�������һ������Ĳ��Զ���
 * @author zhang
 *
 */
public class Context {
	/**
	 * ����һ������Ĳ��Զ���
	 */
	private Strategy strategy;
	
	/**
	 * ���췽��������һ������Ĳ��Զ���
	 * @param strategy	����Ĳ��Զ���
	 */
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	/**
	 * �����ĶԿͻ����ṩ�Ĳ����ӿڣ������в����ͷ���ֵ
	 */
	public void contextInterface(){
		//ͨ����ת������Ĳ��Զ�������㷨����
		strategy.algorithmIterface();
	}
}
