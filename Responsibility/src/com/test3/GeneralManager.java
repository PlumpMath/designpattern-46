package com.test3;

public class GeneralManager extends Handler {
	public String handlerFeeRequest(String user, double fee) {
		String str = "";
		//�ܾ����Ȩ�޺ܴ�ֻҪ����������������Դ���
		if(fee >= 1000){
			//Ϊ�˲��ԣ��򵥵㣬ֻͬ��С���
			if("С��".equals(user)){
				str = "�ܾ���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}else{
				str = "�ܾ���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}
			return str;
		}else{
			//������к�̵Ĵ�����󣬼�������
			if(this.successor != null){
				return successor.handlerFeeRequest(user, fee);
			}
		}
		return str;
	}

}
