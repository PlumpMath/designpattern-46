package com.test4;

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
		this.cookApi.cook(tableNum,"�̶��Ź���");
	}

	/**
	 * ��˵�����
	 */
	private int tableNum;
	
	/**
	 * ���캯���������˵�����
	 * @param tableNum ��˵�����
	 */
	public ChopCommand(int tableNum){
		this.tableNum = tableNum;
	}

	public int getTableNum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
