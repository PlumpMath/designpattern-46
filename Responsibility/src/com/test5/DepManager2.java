package com.test5;
/**
 * ʵ��Ϊ���ž�������Ԥ֧���÷������봦���ܵ��Ӷ���
 * ���ڵĲ��ž���ȿ��Դ���۲ͷ������룬�ֿ��Դ���Ԥ֧���÷�������
 * @author zhang
 *
 */
public class DepManager2 extends DepManager {
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
		//���ž���ֻ����10000����
		if(pfrm.getFee() < 10000){
			//������Ҫ��ͳͳͬ��
			System.out.println("���ž���ͬ��"+pfrm.getUser()+"Ԥ֧���÷���"
					+pfrm.getFee()+"Ԫ������");
			return true;
		}else{
			//����10000���������ݸ�������ߵ��˴���
			if(this.successor != null){
				return this.successor.handleRequest(rm);
			}
		}
		return false;
	}
}
