package com.test6;

public class Invoker {
	/**
	 * ��ʼ��ӡ
	 */
	public void startPrint(Command cmd){
		System.out.println("��Invoker�У��������ǰ");
		//ִ������Ĺ���
		cmd.execute();
		System.out.println("����������");
	}
}
