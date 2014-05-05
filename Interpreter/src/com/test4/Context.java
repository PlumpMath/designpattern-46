package com.test4;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * �����ģ�����������������Ҫ��һЩȫ����Ϣ
 * @author zhang
 *
 */
public class Context {
	/**
	 * Dom����xml��Document����
	 */
	private Document document = null;
	
	/**
	 *��һ�α�����Ķ��Ԫ�� 
	 */
	private List<Element> preEles = new ArrayList<Element>();

	public List<Element> getPreEles() {
		return preEles;
	}

	public void setPreEles(List<Element> preEles) {
		this.preEles = preEles;
	}

	public Document getDocument() {
		return document;
	}

	/**
	 * ���췽��
	 * @param filePathName	��Ҫ��ȡ��xml��·��������
	 * @throws Exception
	 */
	public Context(String filePathName) throws Exception{
		//ͨ��������xml����������ȡ��������xml��Ӧ��Document����
		this.document = XmlUtil.getRoot(filePathName);
	}
	
	/**
	 * ���³�ʼ��������
	 */
	public void reInit(){
		preEles = new ArrayList<Element>();
	}
	
	/**
	 * ����Expression����ʹ�õķ���
	 * ���ݸ�Ԫ�غ͵�ǰԪ����������ȡ��ǰ�Ķ��Ԫ�صļ���
	 * @param pEle	��Ԫ��
	 * @param eleName	��ǰԪ�ص�����
	 * @return	��ǰ�Ķ��Ԫ�صļ���
	 */
	public List<Element> getNowEles(Element pEle,String eleName){
		List<Element> elements = new ArrayList<Element>();
		NodeList tempNodeList = pEle.getChildNodes();
		for(int i=0;i<tempNodeList.getLength();i++){
			if(tempNodeList.item(i) instanceof Element){
				Element nowEle =  (Element)tempNodeList.item(i);
				if(nowEle.getTagName().equals(eleName)){
					elements.add(nowEle);
				}
			}
		}
		return elements;
	}
}
