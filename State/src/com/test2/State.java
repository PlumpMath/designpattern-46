package com.test2;
/**
 * ��װ��Context��һ���ض�״̬��ص���Ϊ
 * @author zhang
 *
 */
public interface State {
	/**
	 * ״̬��Ӧ�Ĵ���
	 * @param sampleParameter	ʾ��������˵�����Դ�����������崫��ʲô���Ĳ���
	 * 							���뼸���������ɾ���Ӧ�����������
	 */
	public void handle(String sampleParameter);
}