package com.test5;
/**
 * 公共状态接口
 * @author zhang
 *
 */
public interface State {
	/**
	 * 执行状态对应的功能处理
	 * @param ctx	上下文的实例对象
	 */
	public void doWork(StateMachine ctx);
}
