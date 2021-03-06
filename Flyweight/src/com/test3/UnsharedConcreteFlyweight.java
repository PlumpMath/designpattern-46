package com.test3;

import java.util.*;

/**
 * 不需要共享的享元对象的实现，也是组合模式中的组合对象
 * @author zhang
 *
 */
public class UnsharedConcreteFlyweight implements Flyweight {
	/**
	 * 记录每个组合对象所包含的子组件
	 */
	private List<Flyweight> list = new ArrayList<Flyweight>();
	
	public boolean match(String securityEntity, String permit) {
		for(Flyweight f: list){
			//递归调用
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
