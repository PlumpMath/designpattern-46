package com.test2;
import java.util.*;
/**
 * 享元工厂
 * @author zhang
 *
 */
public class FlyweightFactory {
	/**
	 * 缓存多个Flyweight对象，这里只是示意一下
	 */
	private Map<String,Flyweight> fsMap = new HashMap<String, Flyweight>();
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public Flyweight getFlyweight(String key){
		//这个方法中基本的实现步骤如下：
		//1:先从缓存中查找，是否存在key对应的Flyweight对象
		Flyweight f = fsMap.get(key);
		
		//2.如果存在，就返回相应的Flyweight对象
		if(f == null){
			//3:如果不存在
			//3.1:创建一个新的Flyweight对象
			f = new ConcreteFlyweight(key);
			//3.2:把这个新的Flyweight对象添加到缓存中
			fsMap.put(key, f);
			//3.3:然后返回这个新的Flyweight对象
		}
		return f;
	}
}
