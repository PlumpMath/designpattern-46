package com.test4;

import java.util.*;

/**
 * 菜单对象，是个宏命令对象
 * @author zhang
 *
 */
public class MenuCommand implements Command {
	
	/**
	 * 用来记录组合本菜单的多道菜品，也就是多个命令对象
	 */
	private Collection<Command> col = new ArrayList<Command>(); 
	
	/**
	 * 点菜，把菜品加入菜单中
	 * @param cmd 客户点的菜
	 */
	public void addCommand(Command cmd){
		col.add(cmd);
	}
	
	public void execute() {
		//执行菜单就是把菜单传给后厨
		CommandQueue.addMenu(this);
	}

	//对菜单命令来说这个方法没有意义
	public void setCookApi(CookApi cookApi) {
		//什么也不做
	}

	//对菜单命令来说这个方法没有意义
	public int getTableNum() {
		//什么也不做
		return 0;
	}
	
	/**
	 * 获取菜单中的多个命令对象
	 * @return col 菜单中的多个命令对象
	 */
	public Collection<Command> getCommands(){
		return this.col;
	}
}
