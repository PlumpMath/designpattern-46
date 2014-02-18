package com.test3;

/**
 * ����Ա��������ϲ˵����������ÿ���˺;����ʵ����
 * ���������ִ�У��൱�ڱ�׼Commandģʽ���Client+Invoker
 * @author zhang
 *
 */
public class Waiter {
	
	/**
	 * ����һ�����������---�˵�
	 */
	private MenuCommand menuCommand = new MenuCommand();
	
	/**
	 * �ͻ����
	 * @param cmd �ͻ���Ĳˣ�ÿ������һ���������
	 */
	public void orderDish(Command cmd){
		//�ͻ������������������û�кͽ�������װ��
		//��������װ
		CookApi hotCook = new HotCook();
		CookApi coolCook = new CoolCook();
		//�жϵ������������ʦ�������Ȳ�ʦ��
		//�򵥵���������ԭʼ������������ж�
		if(cmd instanceof DuckCommand){
			((DuckCommand)cmd).setCookApi(hotCook);
		}else if(cmd instanceof MeatCommand){
			//��������ˣ�����Ҫ�������ʦ��
			((MeatCommand)cmd).setCookApi(coolCook);
		}else if(cmd instanceof ChopCommand){
			((ChopCommand)cmd).setCookApi(hotCook);
		}
		
		//��ӵ��˵���
		menuCommand.addCommand(cmd);
	}
	
	/**
	 * �ͻ������ϣ���ʾҪִ�������ˣ��������ִ�в˵�����������
	 */
	public void orderOver(){
		menuCommand.execute();
	}
}
