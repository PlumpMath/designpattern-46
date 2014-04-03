package com.test6;
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

	public void add(int num) {
		result += num;
	}

	public void substract(int num) {
		result -= num;
	}

	public Memento createMemento() {
		
		return new MementoImpl(result);
	}

	public void setMemento(Memento memento) {
		MementoImpl m = (MementoImpl)memento;
		this.result = m.getResult();
	}
	
	/**
	 * ����¼����
	 */
	private static class MementoImpl implements Memento{
		private int result = 0;
		public MementoImpl(int result){
			this.result = result;
		}
		
		public int getResult(){
			return result;
		}
	}

}
