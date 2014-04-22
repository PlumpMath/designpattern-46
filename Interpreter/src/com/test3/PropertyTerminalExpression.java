package com.test3;
/**
 * ������Ϊ�ս����Ӧ�Ľ�����
 * @author zhang
 *
 */
public class PropertyTerminalExpression extends ReadXmlExpression {
	/**
	 * ���Ե�����
	 */
	private String propName;
	
	public PropertyTerminalExpression(String propName){
		this.propName = propName;
	}
	
	public String[] interpret(Context c) {
		//ֱ�ӻ�ȡ����Ԫ�����Ե�ֵ
		String[] ss = new String[1];
		ss[0] = c.getPreEle().getAttribute(this.propName);
		return ss;
	}

}
