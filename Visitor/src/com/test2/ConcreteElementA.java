package com.test2;
/**
 * ����Ԫ�ص�ʵ�ֶ���
 * @author zhang
 *
 */
public class ConcreteElementA extends Element {
	public void accept(Visitor vistor) {
		//�ص������߶������Ӧ����
		vistor.visitConcreteElementA(this);
	}
	
	/**
	 * ʾ����������ʾԪ�����еĹ���ʵ��
	 */
	public void operationA(){
		//���еĹ���ʵ��
	}
}
