package com.test3;

import java.util.Date;

/**
 * ���㽱�������ӿ�
 * @author zhang
 *
 */
public abstract class Component {
	/**
	 * ����ĳ����ĳ��ʱ���ڵĽ�����Щ��������ʾ�в�����ʹ��
	 * ����ʵ��ҵ��ʵ�����ǻ��õģ�Ϊ�˱�ʾ���Ǹ������ҵ�񷽷���
	 * �����Щ������������
	 * @param user	�����㽱�����Ա	
	 * @param begin	���㽱��Ŀ�ʼʱ��
	 * @param end	���㽱��Ľ���ʱ��
	 * @return	ĳ����ĳ��ʱ���ڵĽ���
	 */
	public abstract double calcPrize(String user,Date begin,Date end);
}
