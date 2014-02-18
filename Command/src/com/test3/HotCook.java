package com.test3;

/**
 * 厨师对象，做热菜
 * @author zhang
 *
 */
public class HotCook implements CookApi {

	public void cook(String name) {
		
		System.out.println("本厨师正在做："+name);
	}

}
