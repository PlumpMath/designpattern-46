package com.test6;
/**
 * ��װ���۵������ݣ��򵥵�ʾ��һЩ
 * @author zhang
 *
 */
public class SaleModel {
	/**
	 * ���۵���Ʒ
	 */
	private String goods;
	
	/**
	 * ���۵�����
	 */
	private int saleNum;

	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public int getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(int saleNum) {
		this.saleNum = saleNum;
	}

	public String toString() {
		return "��Ʒ����=" + goods + ", ��������=" + saleNum;
	}
}