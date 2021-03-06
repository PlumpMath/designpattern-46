package com.test4;
/**
 * 支付工资的策略接口，公司有多种支付工资的算法
 * 比如现金、银行卡、现金加股票、现金加期权、美元支付等
 * @author zhang
 *
 */
public interface PaymentStrategy {
	/**
	 * 公司给某人真正支付的工资
	 * @param ctx	支付工资的上下文，里面包括算法需要的数据
	 */
	public void pay(PaymentContext ctx);
}
