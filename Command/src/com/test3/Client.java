package com.test3;

public class Client {

	public static void main(String[] args) {
		
		//�ͻ�ֻ�Ǹ��������Ա��˾ͺ���
		//��������Ա
		Waiter waiter = new Waiter();
		
		//����������󣬾���Ҫ��Ĳ�
		Command chop = new ChopCommand();
		Command meat = new MeatCommand();
		Command duck = new DuckCommand();
		
		//��ˣ������÷���Ա����Щ�˼�����
		waiter.orderDish(chop);
		waiter.orderDish(meat);
		waiter.orderDish(duck);
		
		//������
		waiter.orderOver();
	}

}
