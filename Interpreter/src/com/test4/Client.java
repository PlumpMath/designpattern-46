package com.test4;

public class Client {

	public static void main(String[] args) throws Exception{
		//׼��������
		Context c = new Context("InterpreterTest.xml");
		//Ҫ���ȡ���dԪ�ص�ֵ��Ҳ�������±��ʽ��ֵ��"root/a/b/d$"
		//����Ҫ�����������ĳ����﷨��
		ElementExpression root = new ElementExpression("root");
		ElementExpression aEle = new ElementExpression("a");
		ElementExpression bEle = new ElementExpression("b");
		ElementsTerminalExpression dEle = new ElementsTerminalExpression("d");
		
		//�������
		root.addEle(aEle);
		aEle.addEle(bEle);
		bEle.addEle(dEle);
		
		//����
		String ss[] = root.interpret(c);
		for(String s: ss){
			System.out.println("d��ֵ��="+s);
		}
		
	}

}
