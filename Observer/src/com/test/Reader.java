package com.test;
import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author zhang
 *�����Ķ���
 */
public class Reader implements Observer{
	
	/**
	 * ���ߵ�����
	 */
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
		//������ģ��
		System.out.println(name+"�յ���ֽ�ˣ��Ķ��ȡ�Ŀ�����͹�����������===="+arg);
	}

}
