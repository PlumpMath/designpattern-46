package com.test;
import java.util.*;

/**
 * 
 *��ֽ����ľ���ʵ��
 */
public class Newspaper extends java.util.Observable{
	
	/**
	 * ��ֽ�ľ�������
	 */
	private String content;
	
	/**
	 * ��ȡ��ֽ�ľ�������
	 * @return ��ֽ�ľ�������
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * ���ñ�ֽ�ľ������ݣ��൱��Ҫ���汨ֽ��
	 */
	public void setContent(String content) {
		this.content = content;
		this.setChanged();
		//��ģ��
		this.notifyObservers(content);
		
	}
	
}
