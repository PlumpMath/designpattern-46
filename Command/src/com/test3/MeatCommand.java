package com.test3;

/**
 * 命令对象，蒜泥白肉
 * @author zhang
 *
 */
public class MeatCommand implements Command {

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
		this.cookApi.cook("蒜泥白肉");
	}

}
