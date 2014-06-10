package com.test4;
/**
 * �������������൱�ڷ�����ģʽ�е�Ԫ�ض���
 * @author zhang
 *
 */
public abstract class Component {
	/**
	 * ���ܷ����ߵķ���
	 * @param visitor	�����߶���
	 */
	public abstract void accept(Visitor visitor);
	
	/**
	 * ����϶����м����������
	 * @param child	��������϶����е��������
	 */
	public void addChild(Component child){
		//Ĭ��ʵ�֣��׳��쳣��Ҷ�Ӷ���û��������ܣ��������û��ʵ���������
		throw new UnsupportedOperationException("����֧���������");
	}
	
	/**
	 * ����϶������Ƴ�ĳ���������
	 * @param child	���Ƴ����������
	 */
	public void removeChild(Component child){
		//Ĭ��ʵ�֣��׳��쳣��Ҷ�Ӷ���û��������ܣ��������û��ʵ���������
		throw new UnsupportedOperationException("����֧���������");
	}
	
	/**
	 * ����ĳ��������Ӧ���������
	 * @param index	��Ҫ��ȡ����������������������0��ʼ
	 * @return	������Ӧ���������
	 */
	public Component getchildren(int index){
		throw new UnsupportedOperationException("����֧���������");
	}
}
