package com.test5;
/**
 * ��־��¼��������
 * @author zhang
 *
 */
public class LogContext {
	/**
	 * ��¼��־�ķ������ṩ���ͻ���ʹ��
	 * @param msg	��Ҫ��¼����־��Ϣ
	 */
	public void log(String msg){
		//���������У�����ʵ�ֶԾ�����Ե�ѡ��
		//����ѡ�ò��ԣ���¼�����ݿ���
		LogStrategy strategy = new DbLog();
		try {
			strategy.log(msg);
		} catch (Exception e) {
			//�����ˣ��Ǿͼ�¼���ļ���
			strategy = new FileLog();
			strategy.log(msg);
		}
	}
}
