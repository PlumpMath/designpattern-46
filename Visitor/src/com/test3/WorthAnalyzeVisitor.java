package com.test3;
/**
 * ����ķ����ߣ�ʵ�ֶԿͻ���ֵ����
 * @author zhang
 *
 */
public class WorthAnalyzeVisitor implements Visitor {
	public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
		//���ݹ�����Ĵ�С������Ĳ�Ʒ�ͷ���Ķ��١������Ƶ�ʵȽ��з���
		//��ҵ�ͻ��ı�׼��ȸ��˿ͻ���
		System.out.println("���ڶ���ҵ�ͻ�"+ec.getName()+"���м�ֵ����");
	}

	public void visitPersonalCustomer(PersonalCustomer pc) {
		System.out.println("���ڶԸ��˿ͻ�"+pc.getName()+"���м�ֵ����");
	}

}
