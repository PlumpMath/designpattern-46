package com.test3;

/**
 * ��������������
 * @author zhang
 *
 */
public class MeatCommand implements Command {

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
		this.cookApi.cook("�������");
	}

}
