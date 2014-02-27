package com.test1;
/**
 * 普通用户登录控制的逻辑处理
 * @author zhang
 *
 */
public class NormalLogin {
	/**
	 * 判断登录数据是否正确，也就是是否能登录成功
	 * @param lm	封装登录数据的model
	 * @return true表示登录成功，flase表示登录失败
	 */
	public boolean login(LoginModel lm){
		//1.从数据库获取登录人员的信息，就是根据用户编号去获取人员的数据
		UserModel um = this.findUserById(lm.getUserId());
		//2.判断从前台传过来的登录数据和数据库中已有的信息是否匹配
		//先判断用户是否存在，如果um为null，说明用户肯定不存在
		if(um != null){
			//如果用户存在，检查用户编号和密码是否匹配
			if(um.getUserId().equals(lm.getUserId()) && 
						um.getPwd().equals(lm.getPwd())){
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 根据用户编号获取用户的详细信息
	 * @param userId 用户编号
	 * @return 对应的用户的详细信息
	 */
	private UserModel findUserById(String userId){
		//这里省略具体的处理，仅做示意，返回有一个有默认数据的对象
		UserModel um = new UserModel();
		um.setUserId(userId);
		um.setName("test");
		um.setPwd("test");
		um.setUuid("User001");
		
		return um;
	}
}
