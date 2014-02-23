package com.test3;
import java.util.Iterator;

public class Client {

	public static void main(String[] args) {
		//访问集团的工资列表
		PayManager payManager = new PayManager();
		//先计算再获取
		payManager.calcPay();
		System.out.println("集团工资列表：");
		test(payManager.createIterator());
		
		//访问新收购公司的工资列表
		SalaryManager salaryManager = new SalaryManager();
		//先计算再获取
		salaryManager.calcSalary();
		System.out.println("新收购的公司工资列表：");
		test(salaryManager.createIterator());
	}
	
	private static void test(Iterator it){
		while(it.hasNext()){
			PayModel pm =(PayModel)it.next();
			System.out.println(pm);
		}
	}
}
