package com.test2;
/**
 * �����ʵ�Ԫ�صĽӿ�
 * @author zhang
 *
 */
public abstract class Element {
	/**
	 * ���ܷ����ߵķ���
	 * @param vistor	�����߶���
	 */
	public abstract void accept(Visitor vistor);
}
