package com.test5;
/**
 * �����ž������ˣ�������Ӧ��˽���״̬
 * @author zhang
 *
 */
public class DepManagerState implements LeaveRequestState {

	public void doWork(StateMachine request) {
		//�Ȱ�ҵ��������ͳ���
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();
		//ҵ��������˽�����������ݿ���
		
		//���ž�������Ժ�ֱ��ת����˽���״̬
		request.setState(new AuditOverState());
		//������������һ�������������鿴��˽��
	}

}
