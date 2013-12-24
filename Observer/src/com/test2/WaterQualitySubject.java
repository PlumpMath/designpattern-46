package com.test2;
import java.util.*;

public abstract class WaterQualitySubject {
	/**
	 * ��������ע��Ĺ۲����
	 */
	protected List<WatcherObserver> observers = 
			new ArrayList<WatcherObserver>();
	
	/**
	 *ע��۲����
	 *@param observer �۲��߶��� 
	 */
	public void attach(WatcherObserver observer){
		observers.add(observer);
	}
	
	/**
	 * ɾ���۲��߶���
	 * @param observer �۲��߶���
	 */
	public void detach(WatcherObserver observer){
		observers.remove(observer);
	}
	
	/**
	 * ֪ͨ��Ӧ�Ĺ۲���
	 */
	public abstract void notifyWatchers();
	
	/**
	 * ��ȡˮ����Ⱦ����
	 * @return ˮ����Ⱦ�ļ���
	 */
	public abstract int getPolluteLevel();
}
