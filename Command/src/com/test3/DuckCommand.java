package com.test3;

/**
 * 命令对象，北京烤鸭
 * @author zhang
 *
 */
public class DuckCommand implements Command {

	/**
	 * 持有具体做菜的厨师对象
	 */
	private CookApi cookApi = null;
	
	/**
	 * 设置具体做菜的厨师对象
	 */
	public void setCookApi(CookApi cookApi){
		this.cookApi = cookApi;
	}
	
	public void execute() {
		this.cookApi.cook("北京烤鸭");
	}
	
}
