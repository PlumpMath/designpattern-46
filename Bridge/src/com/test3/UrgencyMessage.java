package com.test3;

public class UrgencyMessage extends AbstractMessage {

	public UrgencyMessage(MessageImplementor impl) {
		super(impl);
	}

	public void sendMessage(String message, String toUser) {
		message = "�Ӽ�:" + message;
		super.sendMessage(message, toUser);
	}	
	
	/**
	 * ��չ�Լ����¹��ܣ����ĳ��Ϣ�Ĵ������
	 * @param messageId	����ص���Ϣ�ı��
	 * @return	������ص������ݶ�������ʾ��һ�£���������Object
	 */
	public Object watch(String messageId){
		//��ȡ��Ӧ�����ݣ���֯�ɼ�ص����ݶ���Ȼ�󷵻�
		return null;
	}
}
