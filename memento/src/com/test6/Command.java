package com.test6;
/**
 * ����һ������Ľӿ�
 * @author zhang
 *
 */
public interface Command {
	/**
	 * ִ������
	 */
	public void execute();
	
	/**
	 * ��������ָ�������¼�����¼��״̬
	 * @param m	����¼����
	 */
	public void undo(Memento m);
	
	/**
	 * ��������ָ�������¼�����¼��״̬
	 * @param m	����¼����
	 */
	public void redo(Memento m);
	
	/**
	 * ��������ԭ��������״̬�ı���¼����
	 * @return	�����õı���¼����
	 */
	public Memento createMemento();
}
