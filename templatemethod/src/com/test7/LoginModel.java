package com.test7;
/**
 * ��װ���е�¼��������Ҫ������
 * @author zhang
 *
 */
public class LoginModel {
	/**
	 * ��¼��Ա�ı�ţ�ͨ�õģ��������û���ţ�Ҳ�����ǹ�����Ա���
	 */
	private String loginId;
	
	/**
	 * ��¼����
	 */
	private String pwd;
	
	public String geLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
