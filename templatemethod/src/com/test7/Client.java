package com.test7;

import java.util.concurrent.Callable;

import javax.security.auth.callback.Callback;

public class Client {

	public static void main(String[] args) {
		//׼����¼�˵���Ϣ
		LoginModel lm = new LoginModel();
		lm.setLoginId("admin");
		lm.setPwd("workerpwd");
		
		//׼�����������жϵĶ���
		LoginTemplate lt = new LoginTemplate();
		
		//���е�¼����,�Ȳ�����ͨ��Ա��¼
		boolean flag = lt.login(lm,new LoginCallback() {		
			public boolean match(LoginModel lm, LoginModel dbLm, LoginTemplate template) {
				//�Լ�����Ҫ���ǣ�ֱ��ת��ģ���е�Ĭ��ʵ��
				return template.match(lm, dbLm);
			}
			
			public LoginModel findLoginUser(String loginId) {
				//����ʡ�Ծ��崦������ʾ�⣬����һ����Ĭ�����ݵĶ���
				LoginModel lm = new LoginModel();
				lm.setLoginId(loginId);
				lm.setPwd("testpwd");
				return lm;
			}
			
			public String encryptPwd(String pwd, LoginTemplate template) {
				//�Լ�����Ҫʵ��������ܣ�ֱ��ת��ģ���е�Ĭ��ʵ��
				return template.encryptPwd(pwd);
			}
		});
		
		System.out.println("���Խ�����ͨ��Ա��¼="+flag);
		
		
		//���Թ�����Ա��¼
		boolean flag2 = lt.login(lm, new LoginCallback() {
			
			public boolean match(LoginModel lm, LoginModel dbLm, LoginTemplate template) {
				//�Լ�����Ҫ���ǣ�ֱ��ת��ģ���е�Ĭ��ʵ��
				return template.match(lm, dbLm);
			}
			
			public LoginModel findLoginUser(String loginId) {
				//����ʡ�Ծ��崦������ʾ�⣬����һ����Ĭ�����ݵĶ���
				LoginModel lm = new LoginModel();
				lm.setLoginId(loginId);
				lm.setPwd("workerpwd");
				return lm;
			}
			
			public String encryptPwd(String pwd, LoginTemplate template) {
				//���Ǹ���ķ������ṩ�����ļ���ʵ��
				//�����������м��ܣ�����ʹ��MD5��3DES�ȣ�ʡ����
				System.out.println("ʹ��MD5�����������");
				return pwd;
			}
		});
		
		System.out.println("���Ե�¼����ƽ̨="+flag2);
	}

}
