package com.test5;
/**
 * ʵ��Ϊ��Ŀ��������Ԥ֧���÷������봦���ܵ��Ӷ���
 * ���ڵ���Ŀ����ȿ��Դ���۲ͷ������룬�ֿ��Դ���Ԥ֧���÷�������
 * @author zhang
 *
 */
public class ProjectManager2 extends ProjectManager {
	public Object handleRequest(RequestModel rm) {
		if(PreFeeRequestModel.FEE_TYPE.equals(rm.getType())){
			//��ʾԤ֧���÷�������
			return myHandler(rm);
		}else{
			//�������ø���ȥ����
			return super.handleRequest(rm);
		}
	}
	
	private Object myHandler(RequestModel rm){
		//�Ȱ�ͨ�õĶ������ͻ���
		PreFeeRequestModel pfrm = (PreFeeRequestModel)rm;
		//��Ŀ�����Ȩ�ޱȽ�С��ֻ����5000����
		if(pfrm.getFee() < 5000){
			//������Ҫ��ͳͳͬ��
			System.out.println("��Ŀ����ͬ��"+pfrm.getUser()+"Ԥ֧���÷���"
					+pfrm.getFee()+"Ԫ������");
			return true;
		}else{
			//����5000���������ݸ�������ߵ��˴���
			if(this.successor != null){
				return this.successor.handleRequest(rm);
			}
		}
		return false;
	}
}
