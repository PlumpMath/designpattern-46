package com.test3;

/**
 * ��������̶��Ź���
 * @author zhang
 *
 */
public class ChopCommand implements Command {
	
	/**
	 * ���о������˵ĳ�ʦ����
	 */
	private CookApi cookApi = null;
	
	/**
	 * ���þ������˵ĳ�ʦ����
	 */
	public void setCookApi(CookApi cookApi){
		this.cookApi = cookApi;
	}
	
	public void execute() {
		this.cookApi.cook("�̶��Ź���");
	}

}
