package com.test4;
/**
 * ����ķ����ߣ�ʵ�֣������������ƣ�����϶��������ǰ�����"�ڵ�: "
 * ��Ҷ�Ӷ��������ǰ���"Ҷ��: "
 * @author zhang
 *
 */
public class PrintNameVisitor implements Visitor {
	public void visitComposite(Composite composite) {
		//���ʵ���϶��������
		System.out.println("�ڵ�: "+composite.getName());
	}

	public void visitLeaf(Leaf leaf) {
		//���ʵ�Ҷ�Ӷ��������
		System.out.println("Ҷ��: "+leaf.getName());
	}

}
