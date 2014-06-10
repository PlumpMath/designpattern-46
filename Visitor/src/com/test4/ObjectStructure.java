package com.test4;
/**
 * ����ṹ��ͨ���������Ԫ�ض�����б������÷������ܷ��ʵ����е�Ԫ��
 * @author zhang
 *
 */
public class ObjectStructure {
	/**
	 * ��ʾ����ṹ��������һ����Ͻṹ
	 */
	private Component root = null;
	
	/**
	 * �ṩ���ͻ��˲����ĸ߲�ӿ�
	 * @param visitor	�ͻ�����Ҫʹ�õķ�����
	 */
	public void handleRequest(Visitor visitor){
		//����϶����еĸ�Ԫ�أ����ܷ���
		//����϶���ṹ���Ѿ�ʵ����Ԫ�صı���
		if(root != null){
			root.accept(visitor);
		}
	}
	
	/**
	 * ������϶���ṹ
	 * @param ele
	 */
	public void setRoot(Component ele){
		this.root = ele;
	}
}
