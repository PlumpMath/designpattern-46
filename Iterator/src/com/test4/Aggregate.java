package com.test4;
/**
 * 聚合对象的接口，定义创建相应迭代器对象的接口
 * @author zhang
 *
 */
public abstract class Aggregate {
	/**
	 * 工厂方法，创建相应迭代器对象的接口
	 */
	public abstract Iterator createIterator();
}
