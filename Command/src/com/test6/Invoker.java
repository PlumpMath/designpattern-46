package com.test6;

public class Invoker {
	/**
	 * 开始打印
	 */
	public void startPrint(Command cmd){
		System.out.println("在Invoker中，输出服务前");
		//执行命令的功能
		cmd.execute();
		System.out.println("输出服务结束");
	}
}
