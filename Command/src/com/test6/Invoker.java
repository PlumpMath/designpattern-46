package com.test6;

public class Invoker {
	/**
	 * �����������
	 */
	private Command cmd = null;
	
	/**
	 * �����������
	 * @param cmd �������
	 */
	public void setCommand(Command cmd){
		this.cmd = cmd;
	}
	
	/**
	 * ��ʼ��ӡ
	 */
	public void startPrint(){
		//ִ������Ĺ���
		this.cmd.execute();
	}
}
