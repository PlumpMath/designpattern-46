package com.test3;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class XmlUtil {
	public static Document getRoot(String filePathName) throws Exception{
		Document doc = null;
		//����һ������������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//���һ��DocumentBuilder���������������˾����Dom������
		DocumentBuilder builder = factory.newDocumentBuilder();
		//�õ�һ����ʾxml�ĵ���Document����
		doc = builder.parse(filePathName);
		//ȥ��xml�ĵ�����Ϊ��ʽ�����ݵĿհ׶�ӳ����Dom���е�TextNode����
		doc.normalize();
		
		return doc;
	}
}
