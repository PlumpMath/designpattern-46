package com.test3;

import java.util.Date;

/**
 * װ�������󣬼����ۼƽ���
 * @author zhang
 *
 */
public class SumPrizeDecorator extends Decorator {
	public SumPrizeDecorator(Component c) {
		super(c);
	}

	public double calcPrize(String user, Date begin, Date end) {
		// 1�����Ȼ�ȡǰ����������Ľ���
		double money = super.calcPrize(user, begin, end);
		//2:Ȼ������ۼƽ�����ʵӦ������Աȥ��ȡ�ۼƵ�ҵ��Ȼ���ڳ���0.1%
		//����ʾһ�£��ٶ���ҵ��ۼ�ҵ����1000000Ԫ
		double prize = 1000000 * 0.001;
		System.out.println(user+"�ۼƽ���"+prize);
		return money + prize;
	}
	
	
}
