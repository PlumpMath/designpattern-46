package com.test2;
/**
 * 工作人员登录控制的逻辑处理
 * @author zhang
 *
 */
public class WorkerLogin {
	/**
	 * 判断登录数据是否正确，也就是是否能登录成功
	 * @param lm	封装登录数据的model
	 * @return true表示登录成功，flase表示登录失败
	 */
	public boolean login(LoginModel lm){
		//1.根据工作人员编号去获取工作人员的数据
		WorkerModel wm = this.findWorkerById(lm.getWorkerId());
		//2.判断从前台传过来的用户名和加密后的密码数据，和数据库中已有的信息是否匹配
		//先判断工作人员是否存在，如果wm为null，说明工作人员肯定不存在
		//但不为null，工作人员不一定存在
		if(wm != null){
			//3.把从前台传过来的密码数据使用相应的加密算法进行加密
			String encryptPwd = this.encryptPwd(lm.getPwd());
			//如果工作人员存在，检查工作人员编号和密码是否匹配
			if(wm.getWorkerId().equals(lm.getWorkerId()) && 
						wm.getPwd().equals(encryptPwd)){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 根据工作人员编号获取工作人员的详细信息
	 * @param workerId 用户编号
	 * @return 对应工作人员的详细信息
	 */
	private WorkerModel findWorkerById(String workerId){
		//这里省略具体的处理，仅做示意，返回有一个有默认数据的对象
		WorkerModel wm = new WorkerModel();
		wm.setWorkerId(workerId);
		wm.setName("Worker1");
		wm.setPwd("Worker1");
		wm.setUuid("Worker0001");
		
		return wm;
	}
	
	/**
	 * 对密码数据进行加密
	 * @param pwd 密码数据
	 * @return	加密后的密码数据
	 */
	public String encryptPwd(String pwd){
		//这里对密码数据进行加密，省略了
		return pwd;
	}
}
