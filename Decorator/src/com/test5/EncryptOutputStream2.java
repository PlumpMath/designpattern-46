package com.test5;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EncryptOutputStream2 extends FilterOutputStream {
	public EncryptOutputStream2(OutputStream os) {
		//���ø���Ĺ��췽��
		super(os);
	}

	public void write(int a) throws IOException {
		//��ͳһ����ƶ���λ
		a = a + 2;
		// 97��Сдa����ֵ
		if (a >= (97 + 26)) {
			// ������ڣ���ʾ�Ѿ���y����z�ˣ���ȥ26�ͻص�a����b��
			a = a - 26;
		}
		//���ø���ķ���
		super.write(a);
	}
}
