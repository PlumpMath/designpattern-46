package com.test3;

public class Client {

	public static void main(String[] args) {
		
		//客户只是负责向服务员点菜就好了
		//创建服务员
		Waiter waiter = new Waiter();
		
		//创建命令对象，就是要点的菜
		Command chop = new ChopCommand();
		Command meat = new MeatCommand();
		Command duck = new DuckCommand();
		
		//点菜，就是让服务员把这些菜记下了
		waiter.orderDish(chop);
		waiter.orderDish(meat);
		waiter.orderDish(duck);
		
		//点菜完毕
		waiter.orderOver();
	}

}
