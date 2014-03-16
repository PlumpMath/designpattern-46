package com.test2;
/**
 * 定义客户感兴趣的接口，通常会维护一个State类型的对象实例
 * @author zhang
 *
 */
public class Context {
	/**
	 * 持有一个State类型的对象实例
	 */
	private State state;
	
	/**
	 * 设置实现State的对象的实例
	 * @param state	实现State对象的示例
	 */
	public void setSate(State state){
		this.state = state;
	}
	
	/**
	 * 用户感兴趣的接口方法
	 * @param sampleParameter	示意参数
	 */
	public void request(String sampleParameter){
		//处理中，会转调state 来处理
		state.handle(sampleParameter);
	}
}
