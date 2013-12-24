/**
 * 功能：演示java中的单例模式
 * 作者:raingxm
 */
package com.test;

/**
 * @author zhang
 *
 */
public class Singleton {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		TestStream t; 
		t=TestStream.getInstance();	
		t.setName("小明");
		t.setName("小红");
		System.out.println("她的名字是:"+t.getName());
		
		TestStream t2=TestStream.getInstance();
		t2.setName("小丽");
		System.out.println("她的名字是:"+t2.getName());
		if(t==t2)
		{
			System.out.println("这是同一个实例");
		}
		else
		{
			System.out.println("这两个不是一个实例");
		}
	}

}

class TestStream
{
	private static TestStream ts=null;
	private String name;
	
	//取得名字
	public String getName()
	{
		return this.name;
	}
	//设置名字
	public void setName(String name)
	{
		this.name=name;
	}
	
	//无参数的构造函数
	private TestStream()
	{
		
	}
	
	//获取实例
	public static TestStream getInstance()
	{
		if(ts==null)
		{
			ts=new TestStream();
		}
		return ts;
	}
	
}
