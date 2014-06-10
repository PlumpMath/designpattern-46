package com.test4;
/**
 * ������϶���ṹ�ķ����߽ӿ�
 * @author zhang
 *
 */
public interface Visitor {
	/**
	 * ������϶����൱�ڸ���϶�����ӷ����ߵĹ���
	 * @param composite	��϶���
	 */
	public void visitComposite(Composite composite);
	
	/**
	 * ����Ҷ�Ӷ����൱�ڸ�Ҷ�Ӷ�����ӷ����ߵĹ���
	 * @param leaf	Ҷ�Ӷ���
	 */
	public void visitLeaf(Leaf leaf);
}
