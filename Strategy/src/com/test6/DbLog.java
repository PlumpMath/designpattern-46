package com.test6;
/**
 * ��־��¼�����ݿ�
 * @author zhang
 *
 */
public class DbLog extends LogStrategyTemplate {
	protected void doLog(String msg) {
		//�������
		if(msg != null && msg.trim().length() > 5){
			int a = 5/0;
		}
		
		System.out.println("���ڰ�+'"+msg+"'��¼�����ݿ���");
	}

}
