package com.test1;
/**
 * 个人客户
 * @author zhang
 *
 */
public class PersonalCustomer extends Customer {
	/**
	 * 联系电话
	 */
	private String telephone;
	
	/**
	 * 年龄
	 */
	private int age;
	
	/**
	 * 企业注册地址
	 */
	private String registerAddress;

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRegisterAddress() {
		return registerAddress;
	}

	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}
	
	/**
	 * 个人客户提出服务请求的方法，示意一下
	 */
	public void serviceRequest() {
		//个人客户提出的具体服务请求
		System.out.println("客户"+this.getName()+"提出服务请求");
	}

	/**
	 * 个人客户对公司产品的偏好分析，示意一下
	 */
	public void predilectionAnalyze() {
		System.out.println("现在对个人客户"+this.getName()+"进行产品偏好分析");
	}

	
	/**
	 * 个人客户价值分析，示意一下
	 */
	public void worthAnalyze() {
		System.out.println("现在对个人客户"+this.getName()+"进行价值分析");
	}

}
