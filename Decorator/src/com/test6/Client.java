package com.test6;

public class Client {
	public static void main(String[] args) {
		//�õ�ҵ��ӿڣ����װ����
		GoodsSaleEbi ebi = new CheckDecorator(new LogDecorator(
				new GoodsSaleEbo()));
		//׼����������
		SaleModel saleModel = new SaleModel();
		saleModel.setGoods("Moto �ֻ�");
		saleModel.setSaleNum(2);
		//����ҵ����
		ebi.sale("����", "������", saleModel);
		ebi.sale("����", "������", saleModel);
	}

}
