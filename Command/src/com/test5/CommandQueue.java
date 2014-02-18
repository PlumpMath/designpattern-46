package com.test5;

import java.util.*;

/**
 * ���������
 * @author zhang
 *
 */
public class CommandQueue {
	
	/**
	 * ����ӵģ��ļ�����
	 */
	private final static String  FILE_NAME = "CmdQueue.txt";
	
	
	
	/**
	 * �����洢�������Ķ���
	 */
	private static List<Command> cmds = new ArrayList<Command>();
	
	static{
		//��ȡ�ϴ�û��������������
		cmds = FileOpeUtil.readFile(FILE_NAME);
		if(cmds == null){
			cmds = new ArrayList<Command>();
		}
	}
	
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
		
		//��¼������־
		FileOpeUtil.writeFile(FILE_NAME, cmds);
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
			
			//��¼������־
			FileOpeUtil.writeFile(FILE_NAME, cmds);
		}
		return cmd;
	}
}
