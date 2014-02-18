package com.test4;

import java.util.*;

/**
 * ���������
 * @author zhang
 *
 */
public class CommandQueue {
	
	/**
	 * �����洢�������Ķ���
	 */
	private static List<Command> cmds = new ArrayList<Command>();
	
	/**
	 * ����Ա������һ���µĲ˵�����Ҫͬ��
	 * ��Ϊͬʱ���кܶ�ķ���Ա����˵�����ͬʱ���кܶ��ʦ�ڴӶ�����ȡֵ
	 * @param menu ����Ĳ˵�
	 */
	public synchronized static void addMenu(MenuCommand menu){
		//һ���˵���������ܶ��������
		for(Command cmd : menu.getCommands()){
			cmds.add(cmd);
		}
	}
	
	/**
	 * ��ʦ��������������ȡ���������д���Ҳ����Ҫͬ����
	 */
	public synchronized static Command getOneCommand(){
		Command cmd = null;
		if(cmds.size() > 0){
			//ȡ�����еĵ�һ������Ϊ��Լ���İ��ռ�����Ⱥ��������
			cmd = cmds.get(0);
			//ͬʱ�Ӷ�������ɾ������������
			cmds.remove(0);
		}
		return cmd;
	}
}
