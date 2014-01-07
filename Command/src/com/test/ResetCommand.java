package com.test;

/**
 * �������������ʵ�֣�ʵ��Command�ӿ�
 * �����������������ʵ�֣�ͨ�����ý����ߵķ�����ʵ������
 * @author zhang
 *
 */
public class ResetCommand implements Command {
	/**
	 * ��������ʵ������Ľ�����---����
	 */
	private MainBoardApi mainBoard;
	
	/**
	 * ���췽���������������
	 */
	public ResetCommand(MainBoardApi mainBoard){
		this.mainBoard = mainBoard;
	}
	
	public void execute() {
		//����������󣬸�����֪�������������ת���������
		//������ȥ�����������
		mainBoard.reset();
	}

}
