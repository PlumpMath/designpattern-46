package com.test4;

public class DepManager extends Handler {

	public String handleFeeRequest(String user, double fee) {
		String str = "";
		//部门经理的权限只能在1000以内
		if(fee < 1000){
			//为了测试，简单点，只同意小李的
			if("小李".equals(user)){
				str = "部门经理同意"+user+"聚餐费用"+fee+"元的请求";
			}else{
				str = "部门经理不同意"+user+"聚餐费用"+fee+"元的请求";
			}
			return str;
		}else{
			//超过1000，继续传递给级别更高的人处理
			if(this.successor != null){
				return successor.handleFeeRequest(user, fee);
			}
		}
		return str;
	}

	public boolean handlePrePreFeeRequest(String user, double requestNum) {
		
		//部门经理只能在10000以内
		if(requestNum < 10000){
			//工作需要，统统同意
			System.out.println("部门经理同意"+user+"预支差旅费用"+requestNum+"元的请求");
			return true;
		}else{
			//超过10000，继续传递给级别更高的人处理
			if(this.successor != null){
				return this.successor.handlePrePreFeeRequest(user, requestNum);
			}
		}
		return false;
	}

}
