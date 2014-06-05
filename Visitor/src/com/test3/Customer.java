package com.test3;

public abstract class Customer {
	private String customerId;
	private String name;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ���ܷ����ߵķ���
	 * @param visitor	�����߶���
	 */
	public abstract void accept(Visitor visitor);
}
