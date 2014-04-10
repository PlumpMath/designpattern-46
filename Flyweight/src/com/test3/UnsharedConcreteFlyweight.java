package com.test3;

import java.util.*;

/**
 * ����Ҫ�������Ԫ�����ʵ�֣�Ҳ�����ģʽ�е���϶���
 * @author zhang
 *
 */
public class UnsharedConcreteFlyweight implements Flyweight {
	/**
	 * ��¼ÿ����϶����������������
	 */
	private List<Flyweight> list = new ArrayList<Flyweight>();
	
	public boolean match(String securityEntity, String permit) {
		for(Flyweight f: list){
			//�ݹ����
			if(f.match(securityEntity, permit)){
				return true;
			}
		}
		return false;
	}

	public void add(Flyweight f) {
		list.add(f);
	}

}
