package com.test;
import java.util.*;

/**
 * 
 *报纸对象的具体实现
 */
public class Newspaper extends java.util.Observable{
	
	/**
	 * 报纸的具体内容
	 */
	private String content;
	
	/**
	 * 获取报纸的具体内容
	 * @return 报纸的具体内容
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * 设置报纸的具体内容，相当于要出版报纸了
	 */
	public void setContent(String content) {
		this.content = content;
		this.setChanged();
		//推模型
		this.notifyObservers(content);
		
	}
	
}
