package com.test3;
/**
 * 具体算法实现，为新客户或者普通客户计算应报价格
 * @author zhang
 *
 */
public class NormalCustomerStrategy implements Strategy {
	public double calcPrice(double goodsPrice) {
		System.out.println("对于新客户或者是普通客户，没有折扣");
		return goodsPrice;
	}

}
