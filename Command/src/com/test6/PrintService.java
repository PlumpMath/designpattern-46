package com.test6;

public class PrintService implements Command{
	/**
	 * Ҫ���������
	 */
	private String str = "";
	
	/**
	 * ���췽��������Ҫ���������
	 * @param s Ҫ���������
	 */
	public PrintService(String s){
		this.str = s;
	}
	
	public void execute() {
		System.out.println("��ӡ������Ϊ="+str);
	}
	
}
