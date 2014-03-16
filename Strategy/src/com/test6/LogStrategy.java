package com.test6;
/**
 * 日志记录策略的接口
 * @author zhang
 *
 */
public interface LogStrategy {
	/**
	 * 记录日志
	 * @param msg	需要记录的日志信息
	 */
	public void log(String msg);
}
