package com.test4;

public class GeneralManager extends Handler {

	public String handleFeeRequest(String user, double fee) {
		String str = "";
		//总经理的权限很大，只要请求到了这里，他都可以处理
		if(fee >= 1000){
			//为了测试，简单点，只同意小李的
			if("小李".equals(user)){
				str = "总经理同意"+user+"聚餐费用"+fee+"元的请求";
			}else{
				str = "总经理不同意"+user+"聚餐费用"+fee+"元的请求";
			}
			return str;
		}else{
			//如果还有后继的处理对象，继续传递
			if(this.successor != null){
				return successor.handleFeeRequest(user, fee);
			}
		}
		return str;
	}

	public boolean handlePrePreFeeRequest(String user, double requestNum) {
		//总经理的权限很大，只要请求到了这里，他都可以处理
		if (requestNum >= 10000) {
			// 工作需要，统统同意
			System.out
					.println("总经理同意" + user + "预支差旅费用" + requestNum + "元的请求");
			return true;
		} else {
			if (this.successor != null) {
				return this.successor.handlePrePreFeeRequest(user, requestNum);
			}
		}
		return false;
	}
}
