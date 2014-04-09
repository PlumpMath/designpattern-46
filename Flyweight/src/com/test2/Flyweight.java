package com.test2;
/**
 * 享元接口，通过这个接口享元可以接受并作用于外部状态
 * @author zhang
 *
 */
public interface Flyweight {
	/**
	 * 示例操作，传入外部状态
	 * @param extrinsicState	示例参数，外部状态
	 */
	public void operation(String extrinsicState);
}
