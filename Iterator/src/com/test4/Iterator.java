package com.test4;
/**
 * �������ӿڣ�������ʺͱ���Ԫ�صĲ�����ʵ��˫�����
 * @author zhang
 *
 */
public interface Iterator {
	public void first();
	public void next();
	public boolean isDone();
	public Object currentItem();
	
	/**
	 * �ж��Ƿ�Ϊ��һ��Ԫ��
	 * @return  ���Ϊ��һ��Ԫ�أ�����true�����򷵻�false
	 */
	public boolean isFirst();
	
	/**
	 * �ƶ����ۺ϶������һ��λ��
	 */
	public void previous();
}
