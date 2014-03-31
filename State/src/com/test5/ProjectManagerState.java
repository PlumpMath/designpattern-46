package com.test5;
/**
 * ������Ŀ�������ˣ��������ܶ�Ӧ���ž�����˻���˽���֮�е�һ��
 * @author zhang
 *
 */
public class ProjectManagerState implements LeaveRequestState {

	public void doWork(StateMachine request) {
		//�Ȱ�ҵ��������ͳ���
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();
		//ҵ��������˽�����������ݿ���
		
		//����ѡ��Ľ����������������һ��
		if("ͬ��".equals(lrm.getResult())){
			if(lrm.getLeaveDays() > 3){
				//�����������������죬������Ŀ����ͬ���ˣ����ύ�����ž���
				request.setState(new DepManagerState());
				//Ϊ���ž�������һ������
			}else{
				//�������ڵ���٣�����Ŀ����������
				//�Ͳ����ύ�����ž����ˣ�ת����˽���״̬
				request.setState(new AuditOverState());
				//������������һ�������������鿴��˽��
			}
		}else{
			//��Ŀ����ͬ��Ļ���Ҳ�Ͳ����ύ�����ž����ˣ�ת����˽���״̬
			request.setState(new AuditOverState());
			//������������һ�������������鿴��˽��
		}
	}

}
