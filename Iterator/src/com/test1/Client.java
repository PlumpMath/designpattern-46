package com.test1;

public class Client {
	/**
	 * ʾ�ⷽ����ʹ�õ������Ĺ���
	 * ����ʾ��ʹ�õ������������ۺ϶���
	 */
	public void someOperation(){
		String[] name = {"����","����","����"};
		//�����ۺ϶���
		Aggregate aggregate = new ConcreteAggregate(name);
		//ѭ������ۺ϶����е�ֵ
		Iterator it = aggregate.createIterator();
		//�������õ���������һ��Ԫ��
		it.first();
		while(!it.isDone()){
			//ȡ����ǰ��Ԫ��
			Object obj = it.currentItem();
			System.out.println("the obj=="+obj);
			//�����û�е����������ô�����µ���һ��
			it.next();
		}
	}
	
	public static void main(String[] args) {
		//�򵥲���һ��
		Client client = new Client();
		client.someOperation();
	}

}
