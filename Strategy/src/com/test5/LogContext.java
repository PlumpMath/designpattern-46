package com.test5;
/**
 * 日志记录的上下文
 * @author zhang
 *
 */
public class LogContext {
	/**
	 * 记录日志的方法，提供给客户端使用
	 * @param msg	需要记录的日志信息
	 */
	public void log(String msg){
		//在上下文中，自行实现对具体策略的选择
		//优先选用策略：记录到数据库中
		LogStrategy strategy = new DbLog();
		try {
			strategy.log(msg);
		} catch (Exception e) {
			//出错了，那就记录到文件中
			strategy = new FileLog();
			strategy.log(msg);
		}
	}
}
