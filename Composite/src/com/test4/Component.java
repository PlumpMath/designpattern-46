package com.test4;
import java.util.*;
/**
 * 抽象的组件对象
 * @author zhang
 *
 */
public abstract class Component {
	/**
	 * 记录父组件对象
	 */
	private Component parent = null;
	
	public Component getParent() {
		return parent;
	}

	public void setParent(Component parent) {
		this.parent = parent;
	}
	
	/**
	 * 返回某个组件的子组件对象
	 * @return 某个组件的子组件对象
	 */
	public List<Component> getChildren(){
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	/**
	 * 输出组件自身的名称
	 */
	public abstract void printStruct(String preStr);
	
	/**
	 * 向组合对象中加入组件对象
	 * @param child  被加入组合对象中的组件对象
	 */
	public void addChild(Component child){
		//缺省的实现，抛出意外，因为叶子对象没有这个功能
		//或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	/**
	 * 从组合对象中移除某个组件对象
	 * @param child  被移除的组件对象
	 */
	public void removeChild(Component child){
		//缺省的实现，抛出意外，因为叶子对象没有这个功能
		//或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	/**
	 * 返回某个索引对应的组件对象
	 * @param index  需要获取的组件对象的索引，索引从0开始
	 * @return 索引对应的组件对象
	 */
	public Component getChildren(int index){
		//缺省的实现，抛出意外，因为叶子对象没有这个功能
		//或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");		
	}
}
