package com.test2;

/**
 * �����࣬����ʵ�ּӼ�������
 * @author zhang
 *
 */
public class Operation implements OperationApi {

	/**
	 * ��¼����Ľ��
	 */
	private int result;
	
	public int getResult() {	
		return result;
	}

	
	public void setResult(int result) {
		this.result = result;
	}


	public void add(int num) {
		//ʵ�ּӷ�����
		this.result += num;
	}

	
	public void substract(int num) {
		//ʵ�ּ�������
		this.result -= num;
	}

}
