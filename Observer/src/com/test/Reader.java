package com.test;
import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author zhang
 *真正的读者
 */
public class Reader implements Observer{
	
	/**
	 * 读者的姓名
	 */
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
		//采用推模型
		System.out.println(name+"收到报纸了，阅读先。目标推送过来的内容是===="+arg);
	}

}
