package com.test3;

import org.w3c.dom.Element;

/**
 * Ԫ����Ϊ�ս����Ӧ�Ľ�����
 * @author zhang
 *
 */
public class ElementTerminalExpression extends ReadXmlExpression {
	/**
	 * Ԫ�ص�����
	 */
	private String eleName = "";
	
	public ElementTerminalExpression(String eleName){
		this.eleName = eleName;
	}
	
	public String[] interpret(Context c) {
		//��ȡ���������еĵ�ǰԪ����Ϊ����Ԫ��
		Element pEle = c.getPreEle();
		//���ҵ���ǰԪ����������Ӧ��xmlԪ��
		Element ele = null;
		if(pEle == null){
			//˵�����ڻ�ȡ���Ǹ�Ԫ��
			ele = c.getDocument().getDocumentElement();
			c.setPreEle(ele);
		}else{
			//���ݸ���Ԫ�غ�Ҫ���ҵ�Ԫ�ص���������ȡ��ǰ��Ԫ��
			ele = c.getNowEle(pEle, eleName);
			//�ѵ�ǰ��ȡ��Ԫ�طŵ���������
			c.setPreEle(ele);
		}
		
		//Ȼ����Ҫȥ��ȡ���Ԫ�ص�ֵ
		String[] ss = new String[1];
		ss[0] = ele.getFirstChild().getNodeValue();
		return ss;
	}

}
