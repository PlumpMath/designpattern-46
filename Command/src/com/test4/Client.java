package com.test4;

public class Client {

	public static void main(String[] args) {
		//��Ҫ������̨��������������������
		CookManager.runCookManager();
		
		//Ϊ�˼򵥣�ֱ����ѭ��ģ�������ŵ��
		for(int i=0;i<5;i++){
			//��������Ա
			Waiter waiter = new Waiter();
			//�����������Ҳ����Ҫ��Ĳ�
			Command chop = new ChopCommand(i);
			Command duck = new DuckCommand(i);
			
			//���
			waiter.orderDish(chop);
			waiter.orderDish(duck);
			//������
			waiter.orderOver();
		}
	}

}
