package com.test4;
/**
 * ������Ա��¼���Ƶ��߼�����
 * @author zhang
 *
 */
public class WorkerLogin extends LoginTemplate {

	public LoginModel findLoginUser(String loginId) {
		//����ʡ�Ծ��崦������ʾ�⣬����һ����Ĭ�����ݵĶ���
		LoginModel lm = new LoginModel();
		lm.setLoginId(loginId);
		lm.setPwd("workerpwd");
		return lm;
	}
	
	public String encryptPwd(String pwd){
		//���Ǹ���ķ������ṩ�����ļ���ʵ��
		//�����������м��ܣ�����ʹ��MD5��3DES�ȣ�ʡ����
		System.out.println("ʹ��MD5�����������");
		return pwd;
	}
}
