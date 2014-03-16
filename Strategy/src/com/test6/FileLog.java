package com.test6;
/**
 * 把日志记录到文件
 * @author zhang
 *
 */
public class FileLog extends LogStrategyTemplate {
	public void doLog(String msg) {
		System.out.println("现在把'"+msg+"'记录到文件中");
	}

}
