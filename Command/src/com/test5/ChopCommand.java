package com.test5;

import java.io.*;
/**
 * ��������̶��Ź���
 * @author zhang
 *
 */
public class ChopCommand implements Command,Serializable {
	
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
		return tableNum;
	}

}
