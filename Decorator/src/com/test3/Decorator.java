package com.test3;
/**
 * װ�����Ľӿڣ���Ҫ�ͱ�װ�εĶ���ʵ��ͬ���Ľӿ�
 */
import java.util.Date;

public abstract class Decorator extends Component {
	/**
	 * ���б�װ�ε��������
	 */
	protected Component c;
	
	public Decorator(Component c){
		this.c = c;
	}
	
	public double calcPrize(String user, Date begin, Date end) {
		//ת���������ķ���
		return c.calcPrize(user, begin, end);
	}

}
