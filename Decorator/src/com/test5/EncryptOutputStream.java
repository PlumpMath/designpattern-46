package com.test5;
/**
 * ʵ�ּ򵥵ļ���
 */
import java.io.IOException;
import java.io.OutputStream;

public class EncryptOutputStream extends OutputStream {
	//���б�װ�εĶ���
	private OutputStream os = null;
	public EncryptOutputStream(OutputStream os){
		this.os = os;
	}

	public void write(int a) throws IOException {
		//��ͳһ����ƶ���λ
		a = a+2;
		//97��Сдa����ֵ
		if(a >= (97+26)){
			//������ڣ���ʾ�Ѿ���y����z�ˣ���ȥ26�ͻص�a����b��
			a = a-26;
		}
		this.os.write(a);
	}

}