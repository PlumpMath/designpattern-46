package com.test4;

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
		//ִ�в˵����ǰѲ˵��������
		CommandQueue.addMenu(this);
	}

	//�Բ˵�������˵�������û������
	public void setCookApi(CookApi cookApi) {
		//ʲôҲ����
	}

	//�Բ˵�������˵�������û������
	public int getTableNum() {
		//ʲôҲ����
		return 0;
	}
	
	/**
	 * ��ȡ�˵��еĶ���������
	 * @return col �˵��еĶ���������
	 */
	public Collection<Command> getCommands(){
		return this.col;
	}
}
