package com.test3;

public class ProjectManager extends Handler {
	public String handlerFeeRequest(String user, double fee) {
		String str = "";
		//��Ŀ�����Ȩ�ޱȽ�С��ֻ����500����
		if(fee < 500){
			//Ϊ�˲��ԣ��򵥵㣬ֻͬ��С���
			if("С��".equals(user)){
				str = "��Ŀ����ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}else{
				str = "��Ŀ����ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}
			return str;
		}else{
			//����500���������ݸ�������ߵ��˴���
			if(this.successor != null){
				return successor.handlerFeeRequest(user, fee);
			}
		}
		return str;
	}

}
