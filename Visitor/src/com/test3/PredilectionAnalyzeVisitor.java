package com.test3;
/**
 * ����ķ����ߣ�ʵ�ֶԿͻ���ƫ�÷���
 * @author zhang
 *
 */
public class PredilectionAnalyzeVisitor implements Visitor {
	public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
		//���������������ʷ��Ǳ�ڹ�������
		//�Լ��ͻ�������ҵ�ķ�չ���ơ��ͻ��ķ�չԤ�ڵȵķ���
		System.out.println("���ڶ���ҵ�ͻ�"+ec.getName()+"���в�Ʒƫ�÷���");
	}

	public void visitPersonalCustomer(PersonalCustomer pc) {
		System.out.println("���ڶԸ��˿ͻ�"+pc.getName()+"���в�Ʒƫ�÷���");
	}

}
