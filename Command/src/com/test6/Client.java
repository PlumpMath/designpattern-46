package com.test6;

public class Client {

	public static void main(String[] args) {
		//׼��Ҫ����������
		Command cmd = new PrintService("�˻�������ģʽʾ��");
		//���������������
		Invoker invoker = new Invoker();
		invoker.setCommand(cmd);
		
		//���°�ť����������ִ������
		invoker.startPrint();
	}

}
