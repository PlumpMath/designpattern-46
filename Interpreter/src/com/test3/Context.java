package com.test3;

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
	 * ��һ���������Ԫ��
	 */
	private Element preEle = null;
	
	/**
	 * Dom����xml��Document����
	 */
	private Document document = null;
	
	public Element getPreEle() {
		return preEle;
	}

	public void setPreEle(Element preEle) {
		this.preEle = preEle;
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
		preEle = null;
	}
	
	/**
	 * ����Expression����ʹ�õķ���
	 * ���ݸ�Ԫ�غ͵�ǰԪ����������ȡ��ǰԪ��
	 * @param pEle	��Ԫ��
	 * @param eleName	��ǰԪ�ص�����
	 * @return	�ҵ��ĵ�ǰԪ��
	 */
	public Element getNowEle(Element pEle,String eleName){
		NodeList tempNodeList = pEle.getChildNodes();
		for(int i=0;i<tempNodeList.getLength();i++){
			if(tempNodeList.item(i) instanceof Element){
				Element nowEle =  (Element)tempNodeList.item(i);
				if(nowEle.getTagName() == eleName){
					return nowEle;
				}
			}
		}
		return null;
	}
}
