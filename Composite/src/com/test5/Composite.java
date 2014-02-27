package com.test5;
import java.util.*;
/**
 * 组合对象，可以包含其他组合对象或者叶子对象
 * @author zhang
 *
 */
public class Composite extends Component {
	/**
	 * 用来存储组合对象中包含的子组件对象
	 */
	private List<Component> childComponents = null;
	
	/**
	 * 组合对象的名字
	 */
	private String name = "";
	
	/**
	 * 构造方法，传入组合对象的名字
	 * @param name 组合对象的名字
	 */
	public Composite(String name){
		this.name = name;
	}
	
	/**
	 * 示意方法，通常在里面需要实现递归的调用
	 */
	public void printStruct(String preStr) {
		//先把自己输出去
		System.out.println(preStr+"+"+this.name);
		
		//如果还包含子组件，那么就输出这些子组件对象
		if(childComponents != null){
			//添加一个空格，表示缩进
			preStr+=" ";
			
			//输出当前对象的子对象
			for(Component c: childComponents){
				//递归地进行子组件相应方法的调用
				c.printStruct(preStr);
			}
		}
	}
	
	public void addChild(Component c){
		//延迟初始化
		if(childComponents == null){
			childComponents = new ArrayList<Component>();
		}
		childComponents.add(c);
		
		//先判断组件路径是否为空，如果为空，说明本组件是根组件
		if(this.getComponentPath() == null || this.getComponentPath().trim().length() == 0){
			//把本组件的name设置到组件路径中
			this.setComponentPath(this.name);
		}
		
		//判断要加入的组件在路径上是否出现过
		//先判断是否是根组件
		if(this.getComponentPath().startsWith(c.getName()+".")){
			//说明是根组件，重复添加了
			throw new java.lang.IllegalArgumentException("在本通路上，组件'"+
					c.getName()+"'已经被添加过了");
		}else{
			if(this.getComponentPath().indexOf("."+c.getName()) < 0){
				//表示没有出现过，那么可以加入
				//计算组件的路径
				String componentPath = this.getComponentPath()+"."+this.getName();
				
				//设置子组件路径
				c.setComponentPath(componentPath);
			}else{
				throw new java.lang.IllegalArgumentException("在本通路上，组件'"+
						c.getName()+"'已经被添加过了");				
			}
		}
	}

	
	public String getName() {
		return this.name;
	}
}
