package com.test4;

public class Client {

	public static void main(String[] args) {
		
		//�������չ���˾�Ĺ����б�
		SalaryManager salaryManager = new SalaryManager();
		//�ȼ����ٻ�ȡ
		salaryManager.calcSalary();
		
		//�õ�˫�������
		Iterator it = salaryManager.createIterator();
		//�������õ���������һ��Ԫ��
		it.first();
		
		//��nextһ��
		if(!it.isDone()){
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("next1== "+pm);
			//���µ���һ��
			it.next();
		}
		
		//Ȼ��previousһ��
		if(!it.isFirst()){
			//��ǰ����һ��
			it.previous();
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("previous1== "+pm);
		}
		
		//��nextһ��
		if(!it.isDone()){
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("next2== "+pm);
			//���µ���һ��
			it.next();
		}
		
		//����nextһ��
		if(!it.isDone()){
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("next3== "+pm);
			//���µ���һ��
			it.next();
		}
		
		//Ȼ��previousһ��
		if(!it.isFirst()){
			//��ǰ����һ��
			it.previous();
			PayModel pm = (PayModel)it.currentItem();
			System.out.println("previous2== "+pm);
		}		
	}
	
	private static void test(Iterator it){
		//ѭ������ۺ϶����е�ֵ
		//�������õ���������һ��Ԫ��
		it.first();
		while(!it.isDone()){
			//ȡ����ǰ��Ԫ����
			Object obj = it.currentItem();
			System.out.println("the obj=="+obj);
			//�����û�е����������ô�����µ���һ��
			it.next();
		}
	}
}
