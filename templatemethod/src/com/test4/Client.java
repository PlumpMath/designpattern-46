package com.test4;

public class Client {

	public static void main(String[] args) {
		//׼����¼�˵���Ϣ
		LoginModel lm = new LoginModel();
		lm.setLoginId("admin");
		lm.setPwd("workerpwd");
		
		//׼�����������жϵĶ���
		LoginTemplate lt = new WorkerLogin();
		LoginTemplate lt2 = new NormalLogin();
		
		//���е�¼����
		boolean flag = lt.login(lm);
		System.out.println("���Ե�¼����ƽ̨="+flag);
		
		boolean flag2 = lt2.login(lm);
		System.out.println("���Խ�����ͨ��Ա��¼="+flag2);
	}

}
