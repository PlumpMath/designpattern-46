package com.test1;

public class Client {
	public static void main(String[] args) {
		FeeRequest request = new FeeRequest();
		
		//��ʼ����
		String ret1 = request.requestToProjectManager("С��", 300);
		System.out.println("the ret="+ret1);
		String ret2 = request.requestToProjectManager("С��", 300);
		System.out.println("the ret="+ret2);
		
		String ret3 = request.requestToProjectManager("С��", 600);
		System.out.println("the ret="+ret3);
		String ret4 = request.requestToProjectManager("С��", 600);
		System.out.println("the ret="+ret4);
		
		String ret5 = request.requestToProjectManager("С��", 1200);
		System.out.println("the ret="+ret5);
		String ret6 = request.requestToProjectManager("С��", 1200);
		System.out.println("the ret="+ret6);
	}

}
