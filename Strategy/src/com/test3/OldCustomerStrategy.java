package com.test3;
/**
 * 具体算法实现，为老客户计算应报价格
 * @author zhang
 *
 */
public class OldCustomerStrategy implements Strategy {
	public double calcPrice(double goodsPrice) {
		System.out.println("对于老客户，统一折扣5%");
		return goodsPrice*(1-0.05);
	}

}
