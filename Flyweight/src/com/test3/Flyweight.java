package com.test3;
/**
 * ������Ȩ���ݵ���Ԫ�ӿ�
 * @author zhang
 *
 */
public interface Flyweight {
	/**
	 * �жϴ���İ�ȫʵ���Ȩ�ޣ��Ƿ����Ԫ�����ڲ�״̬ƥ��
	 * @param securityEntity	��ȫʵ��
	 * @param permit	Ȩ��
	 * @return	true��ʾƥ�䣬false��ʾ��ƥ��
	 */
	public boolean match(String securityEntity,String permit);
	
	/**
	 * ΪFlyweight�����Flyweight����
	 * @param f ����ӵ���Flyweight����
	 */
	public void add(Flyweight f);
}
