package com.test2;

public class ConcreteVisitor2 implements Visitor {

	public void visitConcreteElementA(ConcreteElementA element) {
		//��Ҫ����ConcreteElementAʱ����Ҫִ�еĹ���ʵ��������
		//������Ҫ����Ԫ�����еĹ��ܣ����磺
		element.operationA();
	}

	public void visitConcreteElementB(ConcreteElementB element) {
		//��Ҫ����ConcreteElementBʱ����Ҫִ�еĹ���ʵ��������
		//������Ҫ����Ԫ�����еĹ��ܣ����磺
		element.OperationB();
	}

}
