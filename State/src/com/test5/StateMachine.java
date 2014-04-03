package com.test5;
/**
 * ����״̬���������൱��״̬ģʽ��Context
 * ������������ʹ��״̬ģʽʱ�Ĺ�������
 * @author zhang
 *
 */
public class StateMachine {
	/**
	 * ����һ��״̬����
	 */
	private State state = null;

	/**
	 *�������̴�����Ҫ��ҵ�����ݶ��󣬲�֪���������ͣ�Ϊ�˼򵥣���ʹ�÷���
	 *��Object������ֻ�Ǵ��ݵ������״̬������ 
	 */
	private Object businessVO = null;
	
	/**
	 * ִ�й������ͻ��˴������̵Ľӿڷ���
	 * �ڿͻ�����Լ���ҵ���������
	 */
	public void doWork(){
		//ת����Ӧ��״̬����������ɹ��ܴ���
		this.state.doWork(this);
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Object getBusinessVO() {
		return businessVO;
	}

	public void setBusinessVO(Object businessVO) {
		this.businessVO = businessVO;
	}
}