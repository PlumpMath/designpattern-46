package com.test5;
/**
 * ������˽�������
 * @author zhang
 *
 */
public class AuditOverState implements LeaveRequestState {

	public void doWork(StateMachine request) {
		//�Ȱ�ҵ��������ͻ���
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();
		//ҵ�����������м�¼�������̽���
	}

}
