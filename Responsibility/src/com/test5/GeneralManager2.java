package com.test5;
/**
 * 实现为总经理增加预支差旅费用申请处理功能的子对象
 * 现在的总经理既可以处理聚餐费用申请，又可以处理预支差旅费用申请
 * @author zhang
 *
 */
public class GeneralManager2 extends GeneralManager {
	public Object handleRequest(RequestModel rm) {
		if(PreFeeRequestModel.FEE_TYPE.equals(rm.getType())){
			//表示预支差旅费用申请
			return myHandler(rm);
		}else{
			//其他的让父类去处理
			return super.handleRequest(rm);
		}
	}
	
	private Object myHandler(RequestModel rm){
		//先把通用的对象造型回来
		PreFeeRequestModel pfrm = (PreFeeRequestModel)rm;
		//总经理的权限很大，只要请求到了这里，他都可以处理
		if(pfrm.getFee() >= 10000){
			//工作需要，统统同意
			System.out.println("总经理同意"+pfrm.getUser()+"预支差旅费用"
					+pfrm.getFee()+"元的请求");
			return true;
		}else{
			if(this.successor != null){
				return this.successor.handleRequest(rm);
			}
		}
		return false;
	}
}
