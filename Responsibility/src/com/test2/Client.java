package com.test2;
/**
 * ְ�����Ŀͻ��ˣ�����ֻ�Ǹ�ʾ��
 * @author zhang
 *
 */
public class Client {

	public static void main(String[] args) {
		// ��Ҫ��װְ����
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		
		h1.setSuccessor(h2);
		//Ȼ���ύ����
		h1.handleRequest();
	}
}
