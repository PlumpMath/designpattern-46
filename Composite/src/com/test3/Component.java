package com.test3;
/**
 * ������������
 * @author zhang
 *
 */
public abstract class Component {
	/**
	 * ���������������
	 */
	public abstract void printStruct(String preStr);
	
	/**
	 * ����϶����м����������
	 * @param child  ��������϶����е��������
	 */
	public void addChild(Component child){
		//ȱʡ��ʵ�֣��׳����⣬��ΪҶ�Ӷ���û���������
		//���������û��ʵ���������
		throw new UnsupportedOperationException("����֧���������");
	}
	
	/**
	 * ����϶������Ƴ�ĳ���������
	 * @param child  ���Ƴ����������
	 */
	public void removeChild(Component child){
		//ȱʡ��ʵ�֣��׳����⣬��ΪҶ�Ӷ���û���������
		//���������û��ʵ���������
		throw new UnsupportedOperationException("����֧���������");
	}
	
	/**
	 * ����ĳ��������Ӧ���������
	 * @param index  ��Ҫ��ȡ����������������������0��ʼ
	 * @return ������Ӧ���������
	 */
	public Component getChildren(int index){
		//ȱʡ��ʵ�֣��׳����⣬��ΪҶ�Ӷ���û���������
		//���������û��ʵ���������
		throw new UnsupportedOperationException("����֧���������");		
	}
}
