package com.test5;
/**
 * ʵ��Ϊ�ܾ�������Ԥ֧���÷������봦���ܵ��Ӷ���
 * ���ڵ��ܾ���ȿ��Դ���۲ͷ������룬�ֿ��Դ���Ԥ֧���÷�������
 * @author zhang
 *
 */
public class GeneralManager2 extends GeneralManager {
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
		//�ܾ����Ȩ�޺ܴ�ֻҪ����������������Դ���
		if(pfrm.getFee() >= 10000){
			//������Ҫ��ͳͳͬ��
			System.out.println("�ܾ���ͬ��"+pfrm.getUser()+"Ԥ֧���÷���"
					+pfrm.getFee()+"Ԫ������");
			return true;
		}else{
			if(this.successor != null){
				return this.successor.handleRequest(rm);
			}
		}
		return false;
	}
}
