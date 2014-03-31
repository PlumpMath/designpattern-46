package com.test5;
/**
 * 处理部门经理的审核，处理后对应审核结束状态
 * @author zhang
 *
 */
public class DepManagerState implements LeaveRequestState {

	public void doWork(StateMachine request) {
		//先把业务对象造型出来
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();
		//业务处理，把审核结果保存在数据库中
		
		//部门经理审核以后，直接转向审核结束状态
		request.setState(new AuditOverState());
		//给申请人增加一个工作，让他查看审核结果
	}

}
