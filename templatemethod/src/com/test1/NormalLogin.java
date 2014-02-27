package com.test1;
/**
 * ��ͨ�û���¼���Ƶ��߼�����
 * @author zhang
 *
 */
public class NormalLogin {
	/**
	 * �жϵ�¼�����Ƿ���ȷ��Ҳ�����Ƿ��ܵ�¼�ɹ�
	 * @param lm	��װ��¼���ݵ�model
	 * @return true��ʾ��¼�ɹ���flase��ʾ��¼ʧ��
	 */
	public boolean login(LoginModel lm){
		//1.�����ݿ��ȡ��¼��Ա����Ϣ�����Ǹ����û����ȥ��ȡ��Ա������
		UserModel um = this.findUserById(lm.getUserId());
		//2.�жϴ�ǰ̨�������ĵ�¼���ݺ����ݿ������е���Ϣ�Ƿ�ƥ��
		//���ж��û��Ƿ���ڣ����umΪnull��˵���û��϶�������
		if(um != null){
			//����û����ڣ�����û���ź������Ƿ�ƥ��
			if(um.getUserId().equals(lm.getUserId()) && 
						um.getPwd().equals(lm.getPwd())){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * �����û���Ż�ȡ�û�����ϸ��Ϣ
	 * @param userId �û����
	 * @return ��Ӧ���û�����ϸ��Ϣ
	 */
	private UserModel findUserById(String userId){
		//����ʡ�Ծ���Ĵ�������ʾ�⣬������һ����Ĭ�����ݵĶ���
		UserModel um = new UserModel();
		um.setUserId(userId);
		um.setName("test");
		um.setPwd("test");
		um.setUuid("User001");
		
		return um;
	}
}
