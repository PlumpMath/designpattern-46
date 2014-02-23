package com.test3;
import java.util.Iterator;

public abstract class Aggregate {
	/**
	 * 工厂方法，创建相应迭代器对象的接口
	 */
	public abstract Iterator createIterator();
}
