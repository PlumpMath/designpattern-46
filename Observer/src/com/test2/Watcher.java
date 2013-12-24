package com.test2;

public class Watcher implements WatcherObserver{
	
	/**
	 * 观察人员的职务
	 */
	private String job;
	
	@Override
	public void update(WaterQualitySubject subject) {
		// TODO Auto-generated method stub
		//这里采用的是拉模式
		System.out.println(job+"获取到通知，当前污染级别为:"+subject.getPolluteLevel());
	}

	@Override
	public void setJob(String job) {
		// TODO Auto-generated method stub
		this.job = job;
	}

	@Override
	public String getJob() {
		// TODO Auto-generated method stub
		return this.job;
	}

}
