package com.test5;

public class Client {

	public static void main(String[] args) {
		//׼����¼�˵���Ϣ
		NormalLoginModel nlm = new NormalLoginModel();
		nlm.setLoginId("testUser");
		nlm.setPwd("testpwd");
		nlm.setQuestion("testQuestion");
		nlm.setAnswer("testAnswer");
		
		//׼�����������жϵĶ���
		LoginTemplate lt3 = new NormalLogin2();
		
		//���е�¼����
		boolean flag3 = lt3.login(nlm);
		System.out.println("���Խ�����ͨ��Ա��ǿ���¼="+flag3);
	}

}
