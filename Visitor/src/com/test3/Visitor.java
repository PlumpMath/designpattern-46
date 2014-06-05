package com.test3;
/**
 * 访问者接口
 * @author zhang
 *
 */
public interface Visitor {
	/**
	 * 访问企业客户，相当于给企业客户添加访问者的功能
	 * @param ec
	 */
	public void visitEnterpriseCustomer(EnterpriseCustomer ec);
	
	/**
	 * 访问个人客户，相当于给个人客户添加访问者的功能
	 * @param pc
	 */
	public void visitPersonalCustomer(PersonalCustomer pc);
}
