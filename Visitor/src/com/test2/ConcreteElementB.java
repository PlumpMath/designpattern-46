package com.test2;
/**
 * ����Ԫ�ص�ʵ�ֶ���
 * @author zhang
 *
 */
public class ConcreteElementB extends Element {
	public void accept(Visitor vistor) {
		//�ص������߶������Ӧ����
		vistor.visitConcreteElementB(this);
	}
	
	/**
	 * ʾ����������ʾԪ�����еĹ���ʵ��
	 */
	public void OperationB(){
		//���еĹ���ʵ��
	}
}
