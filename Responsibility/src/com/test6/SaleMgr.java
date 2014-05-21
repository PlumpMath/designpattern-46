package com.test6;
/**
 * 真正处理销售业务功能的职责对象
 * @author zhang
 *
 */
public class SaleMgr extends SaleHandler {
	public boolean sale(String user, String customer, SaleModel saleModel) {
		//进行真正的业务逻辑处理
		System.out.println(user+"保存了"+customer+"购买"+saleModel+" 的销售数据");
		return true;
	}

}
