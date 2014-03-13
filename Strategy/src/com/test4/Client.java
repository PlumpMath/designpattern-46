package com.test4;

public class Client {

	public static void main(String[] args) {
		//������Ӧ��֧������
		PaymentStrategy strategyRMB = new RMBCash();
		PaymentStrategy strategyDollar = new DollarCash();
		
		//׼��С���֧������������
		PaymentContext ctx1 = new PaymentContext("С��",5000,strategyRMB);
		//��С��֧������
		ctx1.payNow();
		
		//�л�һ���ˣ���petter֧������
		PaymentContext ctx2 = new PaymentContext("petter", 8000, strategyDollar);
		ctx2.payNow();
		
	}

}
