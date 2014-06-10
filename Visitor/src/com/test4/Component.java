package com.test4;
/**
 * 抽象的组件对象，相当于访问者模式中的元素对象
 * @author zhang
 *
 */
public abstract class Component {
	/**
	 * 接受访问者的访问
	 * @param visitor	访问者对象
	 */
	public abstract void accept(Visitor visitor);
	
	/**
	 * 向组合对象中加入组件对象
	 * @param child	被加入组合对象中的组件对象
	 */
	public void addChild(Component child){
		//默认实现，抛出异常，叶子对象没有这个功能，或子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	/**
	 * 从组合对象中移出某个组件对象
	 * @param child	被移出的组件对象
	 */
	public void removeChild(Component child){
		//默认实现，抛出异常，叶子对象没有这个功能，或子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	/**
	 * 返回某个索引对应的组件对象
	 * @param index	需要获取的组件对象的索引，索引从0开始
	 * @return	索引对应的组件对象
	 */
	public Component getchildren(int index){
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
}
