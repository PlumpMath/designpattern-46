package com.test2;
/**
 * ����ͻ�����Ȥ�Ľӿڣ�ͨ����ά��һ��State���͵Ķ���ʵ��
 * @author zhang
 *
 */
public class Context {
	/**
	 * ����һ��State���͵Ķ���ʵ��
	 */
	private State state;
	
	/**
	 * ����ʵ��State�Ķ����ʵ��
	 * @param state	ʵ��State�����ʾ��
	 */
	public void setSate(State state){
		this.state = state;
	}
	
	/**
	 * �û�����Ȥ�Ľӿڷ���
	 * @param sampleParameter	ʾ�����
	 */
	public void request(String sampleParameter){
		//�����У���ת��state ������
		state.handle(sampleParameter);
	}
}
