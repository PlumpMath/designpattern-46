package com.test5;

import java.io.*;
/**
 * ������󣬱�����Ѽ
 * @author zhang
 *
 */
public class DuckCommand implements Command,Serializable {

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
		this.cookApi.cook(tableNum,"������Ѽ");
	}
	
	/**
	 * ��˵�����
	 */
	private int tableNum;
	
	/**
	 * ���캯���������˵�����
	 * @param tableNum ��˵�����
	 */
	public DuckCommand(int tableNum){
		this.tableNum = tableNum;
	}

	public int getTableNum() {
		// TODO Auto-generated method stub
		return tableNum;
	}
}