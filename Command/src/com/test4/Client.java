package com.test4;

public class Client {

	public static void main(String[] args) {
		//先要启动后台，让整个程序运行起来
		CookManager.runCookManager();
		
		//为了简单，直接用循环模拟多个桌号点菜
		for(int i=0;i<5;i++){
			//创建服务员
			Waiter waiter = new Waiter();
			//创建命令对象，也就是要点的菜
			Command chop = new ChopCommand(i);
			Command duck = new DuckCommand(i);
			
			//点菜
			waiter.orderDish(chop);
			waiter.orderDish(duck);
			//点菜完毕
			waiter.orderOver();
		}
	}

}
