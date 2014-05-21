package com.test5;
/**
 * 实现为部门经理增加预支差旅费用申请处理功能的子对象
 * 现在的部门经理既可以处理聚餐费用申请，又可以处理预支差旅费用申请
 * @author zhang
 *
 */
public class DepManager2 extends DepManager {
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
		//部门经理只能在10000以内
		if(pfrm.getFee() < 10000){
			//工作需要，统统同意
			System.out.println("部门经理同意"+pfrm.getUser()+"预支差旅费用"
					+pfrm.getFee()+"元的请求");
			return true;
		}else{
			//超过10000，继续传递给级别更高的人处理
			if(this.successor != null){
				return this.successor.handleRequest(rm);
			}
		}
		return false;
	}
}
