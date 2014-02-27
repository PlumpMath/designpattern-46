package com.test2;
/**
 * ������Ա��¼���Ƶ��߼�����
 * @author zhang
 *
 */
public class WorkerLogin {
	/**
	 * �жϵ�¼�����Ƿ���ȷ��Ҳ�����Ƿ��ܵ�¼�ɹ�
	 * @param lm	��װ��¼���ݵ�model
	 * @return true��ʾ��¼�ɹ���flase��ʾ��¼ʧ��
	 */
	public boolean login(LoginModel lm){
		//1.���ݹ�����Ա���ȥ��ȡ������Ա������
		WorkerModel wm = this.findWorkerById(lm.getWorkerId());
		//2.�жϴ�ǰ̨���������û����ͼ��ܺ���������ݣ������ݿ������е���Ϣ�Ƿ�ƥ��
		//���жϹ�����Ա�Ƿ���ڣ����wmΪnull��˵��������Ա�϶�������
		//����Ϊnull��������Ա��һ������
		if(wm != null){
			//3.�Ѵ�ǰ̨����������������ʹ����Ӧ�ļ����㷨���м���
			String encryptPwd = this.encryptPwd(lm.getPwd());
			//���������Ա���ڣ���鹤����Ա��ź������Ƿ�ƥ��
			if(wm.getWorkerId().equals(lm.getWorkerId()) && 
						wm.getPwd().equals(encryptPwd)){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * ���ݹ�����Ա��Ż�ȡ������Ա����ϸ��Ϣ
	 * @param workerId �û����
	 * @return ��Ӧ������Ա����ϸ��Ϣ
	 */
	private WorkerModel findWorkerById(String workerId){
		//����ʡ�Ծ���Ĵ�������ʾ�⣬������һ����Ĭ�����ݵĶ���
		WorkerModel wm = new WorkerModel();
		wm.setWorkerId(workerId);
		wm.setName("Worker1");
		wm.setPwd("Worker1");
		wm.setUuid("Worker0001");
		
		return wm;
	}
	
	/**
	 * ���������ݽ��м���
	 * @param pwd ��������
	 * @return	���ܺ����������
	 */
	public String encryptPwd(String pwd){
		//������������ݽ��м��ܣ�ʡ����
		return pwd;
	}
}
