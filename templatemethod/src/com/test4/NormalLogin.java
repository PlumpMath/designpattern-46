package com.test4;
/**
 * ��ͨ�û���¼���Ƶ��߼�����
 * @author zhang
 *
 */
public class NormalLogin extends LoginTemplate {

	public LoginModel findLoginUser(String loginId) {
		//����ʡ�Ծ��崦������ʾ�⣬����һ����Ĭ�����ݵĶ���
		LoginModel lm = new LoginModel();
		lm.setLoginId(loginId);
		lm.setPwd("testpwd");
		return lm;
	}

}
