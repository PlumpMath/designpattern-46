package com.test2;

/**
 * ����ӿڣ�����ִ�еĲ�����֧�ֿɳ�������
 * @author zhang
 *
 */
public interface Command {
	/**
	 * ִ�������Ӧ�Ĳ���
	 */
	public void execute();
	
	/**
	 * ִ�г��������Ӧ�Ĳ���
	 */
	public void undo();
}
