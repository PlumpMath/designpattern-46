package com.test;

/**
 * 主板的接口
 * @author zhang
 *
 */
public interface MainBoardApi {
	/**
	 * 主板具有开机功能
	 */
	public void open();
	
	/**
	 * 主板具有实现重启的功能
	 */
	public void reset();
}
