package com.test2;
/**
 * 具体元素的实现对象
 * @author zhang
 *
 */
public class ConcreteElementA extends Element {
	public void accept(Visitor vistor) {
		//回调访问者对象的相应方法
		vistor.visitConcreteElementA(this);
	}
	
	/**
	 * 示例方法，表示元素已有的功能实现
	 */
	public void operationA(){
		//已有的功能实现
	}
}
