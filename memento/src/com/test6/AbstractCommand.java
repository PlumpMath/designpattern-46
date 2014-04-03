package com.test6;
/**
 * �������Ĺ�������ʵ�ָ����������Ĺ�������
 * @author zhang
 *
 */
public abstract class AbstractCommand implements Command {
	/**
	 * ����Ĺ���ʵ�֣����ﲻ��
	 */
	public abstract void execute();

	/**
	 * ��������������ʵ���߶���
	 */
	protected OperationApi operation = null;
	
	public void setOperation(OperationApi operation){
		this.operation = operation;
	}
	
	public void undo(Memento m) {
		this.operation.setMemento(m);
	}

	public void redo(Memento m) {
		this.operation.setMemento(m);
	}

	public Memento createMemento() {
		return this.operation.createMemento();
	}

}
