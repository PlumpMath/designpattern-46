package com.test2;

public class Watcher implements WatcherObserver{
	
	/**
	 * �۲���Ա��ְ��
	 */
	private String job;
	
	@Override
	public void update(WaterQualitySubject subject) {
		// TODO Auto-generated method stub
		//������õ�����ģʽ
		System.out.println(job+"��ȡ��֪ͨ����ǰ��Ⱦ����Ϊ:"+subject.getPolluteLevel());
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
