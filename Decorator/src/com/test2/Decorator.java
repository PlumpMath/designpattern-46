package com.test2;
/**
 * װ�����ӿڣ�ά��һ��ָ���������Ľӿڶ��󣬲�����һ��������ӿ�һ�µĽӿ�
 * @author zhang
 *
 */
public abstract class Decorator extends Component {
	/**
	 * �����������
	 */
	protected Component component;
	
	/**
	 * ���췽���������������
	 * @param component	�������
	 */
	public Decorator(Component component){
		this.component = component;
	}
	
	public void operation() {
		//ת�������������󣬿�����ת��ǰ��ִ��һЩ���Ӷ���
		component.operation();
	}

}
