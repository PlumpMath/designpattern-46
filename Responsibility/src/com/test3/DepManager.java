package com.test3;

public class DepManager extends Handler {
	public String handlerFeeRequest(String user, double fee) {
		String str = "";
		//���ž����Ȩ��ֻ����1000����
		if(fee < 1000){
			//Ϊ�˲��ԣ��򵥵㣬ֻͬ��С���
			if("С��".equals(user)){
				str = "���ž���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}else{
				str = "���ž���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}
			return str;
		}else{
			//����1000���������ݸ�������ߵ��˴���
			if(this.successor != null){
				return successor.handlerFeeRequest(user, fee);
			}
		}
		return str;
	}

}
