package com.test;

/**
 * ���������ʵ�֣�ʵ��Command�ӿ�
 * ���п������������ʵ�֣�ͨ�����ý����ߵķ�����ʵ������
 * @author zhang
 *
 */
public class OpenCommand implements Command {
	
	/**
	 * ��������ʵ������ĵĽ�����----�������
	 */
	private MainBoardApi mainBoard = null;
	
	/**
	 *���췽���������������
	 * @param mainBoard �������
	 */
	public OpenCommand(MainBoardApi mainBoard){
		this.mainBoard = mainBoard;
	}
	
	public void execute() {
		//����������󣬸�����֪����ο�������ת���������
		//������ȥ��ɿ�������
		this.mainBoard.open();
	}

}
