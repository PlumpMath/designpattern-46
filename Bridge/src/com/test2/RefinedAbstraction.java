package com.test2;
/**
 * ������Abstraction����Ľӿڹ���
 * @author zhang
 *
 */
public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor impl) {
		super(impl);
	}
	
	/**
	 * ʾ��������ʵ��һ���Ĺ���
	 */
	public void otherOperation(){
		//ʵ��һ���Ĺ��ܣ����ܻ�ʹ�þ���ʵ�ֲ��ֵ�ʵ�ַ���
		//���Ǳ���������Ŀ�����ʹ��Abstraction�ж���ķ���
		//ͨ�����ʹ��Abstractiion�ж���ķ�������ɸ���Ĺ���
	}
}
