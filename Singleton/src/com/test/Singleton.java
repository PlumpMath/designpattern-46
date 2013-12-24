/**
 * ���ܣ���ʾjava�еĵ���ģʽ
 * ����:raingxm
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
		t.setName("С��");
		t.setName("С��");
		System.out.println("����������:"+t.getName());
		
		TestStream t2=TestStream.getInstance();
		t2.setName("С��");
		System.out.println("����������:"+t2.getName());
		if(t==t2)
		{
			System.out.println("����ͬһ��ʵ��");
		}
		else
		{
			System.out.println("����������һ��ʵ��");
		}
	}

}

class TestStream
{
	private static TestStream ts=null;
	private String name;
	
	//ȡ������
	public String getName()
	{
		return this.name;
	}
	//��������
	public void setName(String name)
	{
		this.name=name;
	}
	
	//�޲����Ĺ��캯��
	private TestStream()
	{
		
	}
	
	//��ȡʵ��
	public static TestStream getInstance()
	{
		if(ts==null)
		{
			ts=new TestStream();
		}
		return ts;
	}
	
}
