package com.test3;

import java.util.*;

/**
 * ��Ԫ������ͨ��ʵ�ֳ�Ϊ����
 * @author zhang
 *
 */
public class FlyweightFactory {
	private static FlyweightFactory factory = 
			new FlyweightFactory();
	private FlyweightFactory(){
		
	}
	
	public static FlyweightFactory getInstance(){
		return factory;
	}
	
	/**
	 * ������Flyweight����
	 */
	private Map<String,Flyweight> fsMap = 
			new HashMap<String,Flyweight >();
	
	/**
	 * ��ȡkey��Ӧ����Ԫ����
	 * @param key	��ȡ��Ԫ�����key
	 * @return	��Ӧ����Ԫ����
	 */
	public Flyweight getFlyweight(String key){
		Flyweight f = fsMap.get(key);
		if(f == null){
			f = new AuthorizationFlyweight(key);
			fsMap.put(key, f);
		}
		return f;
	}
}
