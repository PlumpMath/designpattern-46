package com.test1;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

/**
 * ��ȡ�����ļ�
 * @author zhang
 *
 */
public class ReadAppXml {
	/**
	 * ��ȡ�����ļ�����
	 * @param filePathName	�����ļ���·�����ļ���
	 * @throws Exception
	 */
	public void read(String filePathName)throws Exception{
		Document doc = null;
		//����һ������������
		DocumentBuilderFactory factory = DocumentBuilderFactory.
				newInstance();
		//���һ��DocumentBuilder���������������˾����Dom������
		DocumentBuilder builder = factory.newDocumentBuilder();
		//�õ�һ����ʾxml�ĵ���Document����
		doc = builder.parse(filePathName);
		//ȥ��xml����Ϊ��ʽ�����ݵĿհ׶�ӳ����Dom���е�Text Node����
		doc.normalize();
		
		//��ȡjdbc������ֵ
		NodeList jdbc = doc.getElementsByTagName("jdbc");
		//ֻ��һ��jdbc����ȡjdbc�е������������
		NodeList driverClassNode = ((Element)jdbc.item(0)).
				getElementsByTagName("driver-class");
		String driverClass = driverClassNode.item(0).getFirstChild().getNodeValue();
		System.out.println("driverClass=="+driverClass);
		
		//ͬ���ȡurl��user��password�ȵ�ֵ
		NodeList urlNode = ((Element)jdbc.item(0)).getElementsByTagName("url");
		String url = urlNode.item(0).getFirstChild().getNodeValue();
		System.out.println("url=="+url);
		
		NodeList userNode = ((Element)jdbc.item(0)).getElementsByTagName("user");
		String user = userNode.item(0).getFirstChild().getNodeValue();
		System.out.println("user=="+user);
		
		NodeList passwordNode = ((Element)jdbc.item(0)).
				getElementsByTagName("password");
		String password = passwordNode.item(0).getFirstChild().getNodeValue();
		System.out.println("password=="+password);
		
		//��ȡapplication-xml
		NodeList applicationXmlNode = doc.getElementsByTagName("application-xml");
		String applicationXml = applicationXmlNode.item(0).getFirstChild()
				.getNodeValue();
		System.out.println("applicationXml=="+applicationXml);
	}
}
