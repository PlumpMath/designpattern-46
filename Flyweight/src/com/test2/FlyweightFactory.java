package com.test2;
import java.util.*;
/**
 * ��Ԫ����
 * @author zhang
 *
 */
public class FlyweightFactory {
	/**
	 * ������Flyweight��������ֻ��ʾ��һ��
	 */
	private Map<String,Flyweight> fsMap = new HashMap<String, Flyweight>();
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public Flyweight getFlyweight(String key){
		//��������л�����ʵ�ֲ������£�
		//1:�ȴӻ����в��ң��Ƿ����key��Ӧ��Flyweight����
		Flyweight f = fsMap.get(key);
		
		//2.������ڣ��ͷ�����Ӧ��Flyweight����
		if(f == null){
			//3:���������
			//3.1:����һ���µ�Flyweight����
			f = new ConcreteFlyweight(key);
			//3.2:������µ�Flyweight������ӵ�������
			fsMap.put(key, f);
			//3.3:Ȼ�󷵻�����µ�Flyweight����
		}
		return f;
	}
}
