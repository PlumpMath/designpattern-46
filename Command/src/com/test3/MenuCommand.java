package com.test3;

import java.util.*;

/**
 * �˵������Ǹ����������
 * @author zhang
 *
 */
public class MenuCommand implements Command {
	
	/**
	 * ������¼��ϱ��˵��Ķ����Ʒ��Ҳ���Ƕ���������
	 */
	private Collection<Command> col = new ArrayList<Command>(); 
	
	/**
	 * ��ˣ��Ѳ�Ʒ����˵���
	 * @param cmd �ͻ���Ĳ�
	 */
	public void addCommand(Command cmd){
		col.add(cmd);
	}
	
	public void execute() {
		//ִ�в˵���ʵ����ѭ��ִ�в˵����ÿһ����
		for(Command cmd : col){
			cmd.execute();
		}
	}

}
