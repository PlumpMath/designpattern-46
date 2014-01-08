package com.test2;

import java.util.*;

/**
 * �������࣬���������мӷ���ť��������ť
 * @author zhang
 *
 */
public class Calculator {
	/**
	 * �����������ʷ��¼���ڳ�����ʱ����
	 */
	private List<Command> undoCmds = new ArrayList<Command>();
	
	/**
	 * �����������ʷ��¼���ڻָ�ʱʹ��
	 */
	private List<Command> redoCmds = new ArrayList<Command>();
	
	/**
	 * ����ִ�мӷ����������
	 */
	private Command addCmd = null;
	
	/**
	 * ����ִ�м������������
	 */
	private Command substractCmd = null;
	
	/**
	 * ����ִ�мӷ����������
	 * @param addCmd ִ�мӷ����������
	 */
	public void setAddCmd(Command addCmd){
		this.addCmd = addCmd;
	}
	
	/**
	 * ����ִ�м������������
	 * @param substractCmd ִ�м������������
	 */
	public void setSubstractCmd(Command substractCmd){
		this.substractCmd = substractCmd;
	}
	
	/**
	 * �ṩ���ͻ�ʹ�ã�ִ�мӷ�����
	 */
	public void addPressed(){
		this.addCmd.execute();
		//�Ѳ�����¼����ʷ��¼����
		undoCmds.add(this.addCmd);
	}
	
	/**
	 * �ṩ���ͻ�ʹ�ã�ִ�м�������
	 */
	public void substractPressed(){
		this.substractCmd.execute();
		//�Ѳ�����¼����ʷ��¼����
		undoCmds.add(this.substractCmd);
	}
		
	public void undoPressed(){
		if(undoCmds.size() > 0){
			//ȡ�����һ������������
			Command cmd = this.undoCmds.get(this.undoCmds.size()-1);
			cmd.undo();
			//������лָ����ܣ��ǾͰ���������¼���ָ�����ʷ��¼����
			this.redoCmds.add(cmd);
			
			//Ȼ������һ������ɾ��
			this.undoCmds.remove(cmd);
		}else{
			System.out.println("�ܱ�Ǹ��û�пɳ�����������");
		}
	}
	
	public void redoPressed(){
		if(redoCmds.size() > 0){
			//ȡ�����һ������������
			Command cmd = this.redoCmds.get(this.redoCmds.size()-1);
			cmd.execute();
			//������лָ����ܣ��ǾͰ���������¼���ָ�����ʷ��¼����
			this.undoCmds.add(cmd);
			
			//Ȼ������һ������ɾ��
			this.redoCmds.remove(cmd);
		}else{
			System.out.println("�ܱ�Ǹ��û�пɻָ���������");
		}
	}
	
}
