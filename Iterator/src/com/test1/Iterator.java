package com.test1;
/**
 * �������ӿڣ�������ʺͱ���Ԫ�صĲ���
 * @author zhang
 *
 */
public interface Iterator {
	/**
	 * �ƶ����ۺ϶���ĵ�һ��λ��
	 */
	public void first();
	
	/**
	 * �ƶ����ۺ϶������һ��λ��
	 */
	public void next();
	
	/**
	 * �ж��Ƿ��Ѿ��ƶ����ۺ϶�������һ��λ��
	 * @return true ��ʾ�Ѿ��ƶ����ۺ϶�������һ��λ��
	 * 		   false ��ʾ��û���ƶ����ۺ϶�������һ��λ��
	 */
	public boolean isDone();
		
	/**
	 * ��ȡ�����ĵ�ǰԪ��
	 */
	public Object currentItem();
}
