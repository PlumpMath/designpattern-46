package com.test5;

/**
 * ��ʦ�������Ȳ˵ĳ�ʦ
 * @author zhang
 *
 */
public class HotCook implements CookApi,Runnable {

	/**
	 * ��ʦ����
	 */
	private String name;
	
	/**
	 * ���췽���������ʦ����
	 * @param name ��ʦ����
	 */
	public HotCook(String name){
		this.name = name;
	}
	
	public void run() {
		
		while(true){
			//��������������ȡ�������
			Command cmd = CommandQueue.getOneCommand();
			if(cmd != null){
				//˵��ȡ����������ˣ�����������û�����ý�����
				//��Ϊǰ�滹��֪��������һ����ʦ������ִ���������
				//����֪���ˣ����ǵ�ǰ��ʦʵ�������õ������������
				cmd.setCookApi(this);
				//Ȼ������ִ���������
				cmd.execute();
			}
			
			//��Ϣ1��
			try{
				Thread.sleep(1000L);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	public void cook(int tableNum, String name) {
		//ÿ�����˵�ʱ���ǲ�һ���ģ����������ģ��һ��
		int cookTime = (int)(20*Math.random());
		System.out.println(this.name+"��ʦ����Ϊ"+tableNum+"��������"+name);
		
		try {
			//���߳���Ϣ��ô��ʱ�䣬��ʾ��������
			Thread.sleep(cookTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(this.name+"��ʦΪ"+tableNum+"����������:"+name+"�����ƺ�ʱ="
				+cookTime+"��");
	}

}
