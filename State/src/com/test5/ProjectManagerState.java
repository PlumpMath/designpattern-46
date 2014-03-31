package com.test5;

import java.util.Scanner;
/**
 * ������Ŀ�������ˣ��������ܶ�Ӧ���ž�����˻���˽���֮�е�һ��
 * @author zhang
 *
 */
public class ProjectManagerState implements LeaveRequestState {

	public void doWork(StateMachine request) {
		//�Ȱ�ҵ��������ͻ���
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();
		System.out.println("��Ŀ��������У����Ժ�......");
		//ģ���û�������棬ͨ������̨����ȡ����
		System.out.println(lrm.getUser()+"�����"+lrm.getBeginDate()+
				"��ʼ���"+lrm.getLeaveDays()+"�죬����Ŀ������ˣ�1Ϊͬ�⣬2Ϊ��ͬ�⣩��");
		//��ȡ�ӿ���̨���������
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext()){
			int a = scanner.nextInt();
			//���ûص�������
			String result = "��ͬ��";
			if(a == 1){
				result = "ͬ��";
			}
			lrm.setResult("��Ŀ������˽����"+result);
			//����ѡ��Ľ����������������һ��
			if(a == 1){
				if(lrm.getLeaveDays() > 3){
					//�����������������죬������Ŀ����ͬ���ˣ����ύ�����ž���
					request.setState(new DepManagerState());
					//����ִ����һ������
					request.doWork();
				}else{
					//�������ڵ���٣�����Ŀ����������
					//�Ͳ����ύ�����ž����ˣ�ת����˽���״̬
					request.setState(new AuditOverState());
					//����ִ����һ������
					request.doWork();
				}
			}else{
			//��Ŀ����ͬ��Ļ���Ҳ�Ͳ����ύ�����ž����ˣ�ת����˽���״̬
			request.setState(new AuditOverState());
			///����ִ����һ������
			request.doWork();
			}
		}
	}

}
