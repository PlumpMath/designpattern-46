package com.test2;

public class WaterQuality extends WaterQualitySubject{
	
	private int polluteLevel = 0;
	
	/**
	 * 通知相应的观察者对象
	 */
	public void notifyWatchers() {
		// TODO Auto-generated method stub
		for(WatcherObserver watcher: observers){
			
			//开始根据污染级别判断是否需要通知，由这里总控
			if(polluteLevel >= 0){
				//通知监测员做记录
				if("监测人员".equals(watcher.getJob())){
					watcher.update(this);
				}
			}
			
			if(polluteLevel >= 1){
				//通知预警人员
				if("预警人员".equals(watcher.getJob())){
					watcher.update(this);
				}
			}
			if(polluteLevel >= 2){
				//通知监测部门领导
				if("监测部门领导".equals(watcher.getJob())){
					watcher.update(this);
				}
			}
		}
	}

	/**
	 * 获取水质污染的级别
	 * @return 水质污染的级别
	 */
	public int getPolluteLevel() {
		// TODO Auto-generated method stub
		return this.polluteLevel;
	}
	
	/**
	 * 当监测水质级别后，设置水质污染级别
	 * @param polluteLevel 水质污染的级别
	 */
	public void setPolluteLevel(int polluteLevel){
		
		this.polluteLevel = polluteLevel;
		this.notifyWatchers();
	}
}
