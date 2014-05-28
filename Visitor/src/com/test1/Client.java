package com.test1;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
	public static void main(String[] args) {
		//׼��Щ��������
		Collection<Customer> colCustomer = preparedTestData();
		//ѭ���Կͻ����в���
		for(Customer cm: colCustomer){
			//����ƫ�÷���
			cm.predilectionAnalyze();
			//���м�ֵ����
			cm.worthAnalyze();
		}
	}
	
	private static Collection<Customer> preparedTestData(){
		Collection<Customer> colCustomer = 
									new ArrayList<Customer>();
		
		//Ϊ�˲��Է��㣬׼��Щ����
		Customer cm1 = new EnterpriseCustomer();
		cm1.setName("ABC����");
		colCustomer.add(cm1);
		
		Customer cm2 = new EnterpriseCustomer();
		cm2.setName("CDE��˾");
		colCustomer.add(cm2);
		
		Customer cm3 = new PersonalCustomer();
		cm3.setName("����");
		colCustomer.add(cm3);
		
		return colCustomer;
	}
}
