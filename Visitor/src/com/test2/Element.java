package com.test2;
/**
 * 被访问的元素的接口
 * @author zhang
 *
 */
public abstract class Element {
	/**
	 * 接受访问者的访问
	 * @param vistor	访问者对象
	 */
	public abstract void accept(Visitor vistor);
}
