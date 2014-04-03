package com.test6;
/**
 * 操作运算的接口
 * @author zhang
 *
 */
public interface OperationApi {
	/**
	 * 获取计算完成后的结果
	 * @return	计算完成后的结果
	 */
	public int getResult();
	
	/**
	 * 执行加法
	 * @param num	需要加的数
	 */
	public void add(int num);
	
	/**
	 * 执行减法
	 * @param num	需要减的数
	 */
	public void substract(int num);
	
	/**
	 * 需要保存原发器对象状态的备忘录对象
	 * @return	创建好的备忘录对象
	 */
	public Memento createMemento();
	
	/**
	 * 重新设置原发器对象状态，让其回到备忘录对象记录的状态
	 * @param memento
	 */
	public void setMemento(Memento memento);
}
