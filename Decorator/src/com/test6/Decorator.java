package com.test6;
/**
 * װ�����Ľӿڣ���Ҫ�ͱ�װ�εĶ���ʵ��ͬ���Ľӿ�
 * @author zhang
 *
 */
public abstract class Decorator implements GoodsSaleEbi {
	/**
	 * ���б�װ�ε��������
	 */
	protected GoodsSaleEbi ebi;
	
	/**
	 * ͨ�����췽�����뱻װ�εĶ���
	 * @param ebi	��װ�εĶ���
	 */
	public Decorator(GoodsSaleEbi ebi){
		this.ebi = ebi;
	}
}
