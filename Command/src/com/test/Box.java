package com.test;

/**
 * �������,�����а�ť�����а�ť��Ӧ���������
 * @author zhang
 *
 */
public class Box {
	/**
	 * �����������
	 */
	private Command openCommand;
	
	/**
	 * ���ÿ����������
	 * @param command �����������
	 */
	public void setCommand(Command command){
		this.openCommand = command;
	}
	
	/**
	 * �ṩ���ͻ�ʹ�ã����ղ���Ӧ�û������൱�ڰ�ť�����´����ķ���
	 */
	public void openButtonPressed(){
		//���°�ť��ִ������
		openCommand.execute();
	}
	
}
