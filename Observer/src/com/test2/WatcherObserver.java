package com.test2;

/**
 * 
 * @author zhang
 *水质观察者定义
 */
public interface WatcherObserver {
	
	/**
	 * 被通知的方法
	 */
	public void update(WaterQualitySubject subject);
	
	/**
	 * 设置观察人员职务
	 */
	public void setJob(String job);
	
	/**
	 * 获取观察人员的职务
	 * @return  观察人员的职务
	 */
	public String getJob();
}
