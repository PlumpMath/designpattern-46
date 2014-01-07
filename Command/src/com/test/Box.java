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
	public void setOpenCommand(Command command){
		this.openCommand = command;
	}
	
	/**
	 * �ṩ���ͻ�ʹ�ã����ղ���Ӧ�û������൱�ڰ�ť�����´����ķ���
	 */
	public void openButtonPressed(){
		//���°�ť��ִ������
		openCommand.execute();
	}
	
	/**
	 * ���������������
	 */
	private Command resetCommand;
	
	/**
	 * �������������������
	 */
	public void setResetCommand(Command command){
		this.resetCommand = command;
	}
	
	/**
	 * �ṩ���ͻ�ʹ�ã����ղ���Ӧ�û������൱��������ť�����´����ķ���
	 */
	public void resetButtonPressed(){
		//���°�ť��ִ������
		resetCommand.execute();
	}
}
