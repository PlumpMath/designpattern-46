package com.test;

public class Client {

	public static void main(String[] args) {
		
		//1:�������������ʵ��������������൱������װ����
		//�ѻ����ϰ�ť�������߲�ӵ�������
		MainBoardApi mainBoard = new GigaMainBoard();
		OpenCommand openCommand = new OpenCommand(mainBoard);
		
		//2:Ϊ�����ϵİ�ť���ö�Ӧ������ð�ť֪����ʲô
		Box box = new Box();
		box.setCommand(openCommand);
		
		//3:Ȼ��ģ�ⰴ�»����ϵİ�ť
		box.openButtonPressed();
	}

}
