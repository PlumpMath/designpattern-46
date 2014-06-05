package com.test2;
/**
 * 具体的访问者实现
 * @author zhang
 *
 */
public class ConcreteVisitor1 implements Visitor {
	public void visitConcreteElementA(ConcreteElementA element) {
		//把要访问ConcreteElementA时，需要执行的功能实现在这里
		//可能需要访问元素已有的功能，比如：
		element.operationA();
	}

	public void visitConcreteElementB(ConcreteElementB element) {
		//把要访问ConcreteElementB时，需要执行的功能实现在这里
		//可能需要访问元素已有的功能，比如：
		element.OperationB();
	}

}
