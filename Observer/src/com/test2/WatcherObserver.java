package com.test2;

/**
 * 
 * @author zhang
 *ˮ�ʹ۲��߶���
 */
public interface WatcherObserver {
	
	/**
	 * ��֪ͨ�ķ���
	 */
	public void update(WaterQualitySubject subject);
	
	/**
	 * ���ù۲���Աְ��
	 */
	public void setJob(String job);
	
	/**
	 * ��ȡ�۲���Ա��ְ��
	 * @return  �۲���Ա��ְ��
	 */
	public String getJob();
}
