package com.test4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.w3c.dom.Element;

/**
 * ���Ԫ����Ϊ���ս���Ľ��ʹ�������
 * @author zhang
 *
 */
public class ElementsExpression extends ReadXmlExpression {
	/**
	 * ������¼��ϵ�ReadXmlExpressionԪ��
	 */
	private Collection<ReadXmlExpression> eles =
						new ArrayList<ReadXmlExpression>();
	
	/**
	 * Ԫ������
	 */
	private String eleName = "";
	
	public ElementsExpression(String eleName){
		this.eleName = eleName;
	}
	
	public String[] interpret(Context c) {
		//��ȡ���������еĸ���Ԫ��
		List<Element> pEles = c.getPreEles();
		//�ѵ�ǰ��ȡ��Ԫ�طŵ��������У�����ǻ�ȡ���Ԫ��
		List<Element> nowEles = new ArrayList<Element>();
		
		
		for(Element ele : pEles){
			nowEles.addAll(c.getNowEles(ele, eleName));
		}
		c.setPreEles(nowEles);
		
		//ѭ��������Ԫ�ص�interpret����
		String[] ss = null;
		for(ReadXmlExpression ele : eles){
			ss = ele.interpret(c);
		}
		return ss;
	}
	
	public boolean addEle(ReadXmlExpression ele){
		this.eles.add(ele);
		return true;
	}
	
	public boolean removeEle(ReadXmlExpression ele){
		this.eles.remove(ele);
		return true;
	}

}