package com.test4;
/**
 * ���ڴ����Զ���xmlȡֵ���ʽ�Ľӿ�
 * @author zhang
 *
 */
public abstract class ReadXmlExpression {
	/**
	 * ���ͱ��ʽ
	 * @param c	������
	 * @return	�������ֵ��Ϊ��ͨ�ã������ǵ���ֵ��Ҳ�����Ƕ��ֵ
	 * 			��˾ͷ���һ������
	 */
	public abstract String[] interpret(Context c);
}
