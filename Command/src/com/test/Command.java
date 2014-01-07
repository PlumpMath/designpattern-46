package com.test;

/**
 * 命令的接口，声明要执行的操作
 * @author zhang
 *
 */
public interface Command {
	/**
	 * 执行命令对应的操作
	 */
	public void execute();
}
