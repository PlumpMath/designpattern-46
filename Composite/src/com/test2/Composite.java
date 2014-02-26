package com.test2;
import java.util.*;
/**
 * 组合对象，通常需要存储子对象，定义有子部件的部件行为
 * 并实现在Component里面定义的子部件有关的操作
 * @author zhang
 *
 */
public class Composite extends Component {
	/**
	 * 用来存储组合对象中包含的子组件对象
	 */
	private List<Component> childComponents = null;
	
	/**
	 * 示意方法，通常在里面需要实现递归的调用
	 */
	public void someOperation() {
		if(childComponents != null){
			for(Component c: childComponents){
				//递归地进行子组件相应方法的调用
				c.someOperation();
			}
		}
	}
	
	public void addChild(Component c){
		//延迟初始化
		if(childComponents == null){
			childComponents = new ArrayList<Component>();
		}
		childComponents.add(c);
	}
	
	public void removeChild(Component c){
		if(childComponents != null){
			childComponents.remove(c);
		}
	}
	
	public Component getChildren(int index){
		if(childComponents != null){
			if(index>=0 && index<childComponents.size()){
				return childComponents.get(index);
			}
		}
		return null;
	}
}
