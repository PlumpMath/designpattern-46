package com.test5;
/**
 * Ҷ�Ӷ���
 * @author zhang
 *
 */
public class Leaf extends Component {
	/**
	 * Ҷ�Ӷ��������
	 */
	private String name = "";
	
	/**
	 * ���췽��������Ҷ�Ӷ��������
	 * @param name  Ҷ�Ӷ��������
	 */
	public Leaf(String name){
		this.name = name;
	}
	
	/**
	 * ���Ҷ�Ӷ���Ľṹ��Ҷ�Ӷ���û���Ӷ���Ҳ�������Ҷ�Ӷ��������
	 * @param preStr ǰ׺����Ҫ�ǰ��ղ㼶ƴ�ӵĿո�ʵ������
	 */
	public void printStruct(String preStr) {
		System.out.println(preStr+"-"+name);
	}

	public String getName() {
		return this.name;
	}

}
