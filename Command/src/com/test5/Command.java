package com.test5;

/**
 * ����ӿڣ�����ִ�еĲ���
 * @author zhang
 *
 */
public interface Command {
	
	/**
	 * ִ�������Ӧ�Ĳ���
	 */
	public void execute();
	
	/**
	 * ��������Ľ�����
	 * @param cookApi ����Ľ�����
	 */
	public void setCookApi(CookApi cookApi);
	
	/**
	 * ���ط�����������ţ����ǵ�˵�����
	 * @return �������������
	 */
	public int getTableNum();
}
