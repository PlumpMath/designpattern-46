package com.test3;
/**
 * 具体算法实现，为大客户计算应报价格
 * @author zhang
 *
 */
public class LargeCustomerStrategy implements Strategy {
	public double calcPrice(double goodsPrice) {
		System.out.println("对于大客户，统一折扣10%");
		return goodsPrice*(1-0.1);
	}

}
