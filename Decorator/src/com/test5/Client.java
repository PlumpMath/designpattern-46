package com.test5;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;



public class Client {
	public static void main(String[] args) throws Exception{
		//��ʽ����ļ�
		DataOutputStream dout = new DataOutputStream(
				new BufferedOutputStream(
						new EncryptOutputStream(
								new FileOutputStream("MyEncrypt.txt"))));
		//Ȼ��Ϳ������������
		dout.write("abcdxyz".getBytes());
		dout.close();
	}

}
