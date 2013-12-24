package com.test2;

public class WaterQuality extends WaterQualitySubject{
	
	private int polluteLevel = 0;
	
	/**
	 * ֪ͨ��Ӧ�Ĺ۲��߶���
	 */
	public void notifyWatchers() {
		// TODO Auto-generated method stub
		for(WatcherObserver watcher: observers){
			
			//��ʼ������Ⱦ�����ж��Ƿ���Ҫ֪ͨ���������ܿ�
			if(polluteLevel >= 0){
				//֪ͨ���Ա����¼
				if("�����Ա".equals(watcher.getJob())){
					watcher.update(this);
				}
			}
			
			if(polluteLevel >= 1){
				//֪ͨԤ����Ա
				if("Ԥ����Ա".equals(watcher.getJob())){
					watcher.update(this);
				}
			}
			if(polluteLevel >= 2){
				//֪ͨ��ⲿ���쵼
				if("��ⲿ���쵼".equals(watcher.getJob())){
					watcher.update(this);
				}
			}
		}
	}

	/**
	 * ��ȡˮ����Ⱦ�ļ���
	 * @return ˮ����Ⱦ�ļ���
	 */
	public int getPolluteLevel() {
		// TODO Auto-generated method stub
		return this.polluteLevel;
	}
	
	/**
	 * �����ˮ�ʼ��������ˮ����Ⱦ����
	 * @param polluteLevel ˮ����Ⱦ�ļ���
	 */
	public void setPolluteLevel(int polluteLevel){
		
		this.polluteLevel = polluteLevel;
		this.notifyWatchers();
	}
}
