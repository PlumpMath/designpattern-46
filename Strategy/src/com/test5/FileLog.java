package com.test5;
/**
 * ����־��¼���ļ�
 * @author zhang
 *
 */
public class FileLog implements LogStrategy {
	public void log(String msg) {
		System.out.println("���ڰ�'"+msg+"'��¼���ļ���");
	}

}
