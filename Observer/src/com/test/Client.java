package com.test;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//����һ����ֽ����Ϊ���۲���
		Newspaper subject = new Newspaper();
		
		//�����Ķ��ߣ�Ҳ���ǹ۲���
		Reader reader1 = new Reader();
		reader1.setName("����");
		Reader reader2 = new Reader();
		reader2.setName("����");
		Reader reader3 = new Reader();
		reader3.setName("����");
		
		//ע���Ķ���
		subject.addObserver(reader1);
		subject.addObserver(reader2);
		subject.addObserver(reader3);
		
		//���汨ֽ
		subject.setContent("���ڵ�������: hello world");
	}

}
