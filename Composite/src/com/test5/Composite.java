package com.test5;
import java.util.*;
/**
 * ��϶��󣬿��԰���������϶������Ҷ�Ӷ���
 * @author zhang
 *
 */
public class Composite extends Component {
	/**
	 * �����洢��϶����а��������������
	 */
	private List<Component> childComponents = null;
	
	/**
	 * ��϶��������
	 */
	private String name = "";
	
	/**
	 * ���췽����������϶��������
	 * @param name ��϶��������
	 */
	public Composite(String name){
		this.name = name;
	}
	
	/**
	 * ʾ�ⷽ����ͨ����������Ҫʵ�ֵݹ�ĵ���
	 */
	public void printStruct(String preStr) {
		//�Ȱ��Լ����ȥ
		System.out.println(preStr+"+"+this.name);
		
		//������������������ô�������Щ���������
		if(childComponents != null){
			//���һ���ո񣬱�ʾ����
			preStr+=" ";
			
			//�����ǰ������Ӷ���
			for(Component c: childComponents){
				//�ݹ�ؽ����������Ӧ�����ĵ���
				c.printStruct(preStr);
			}
		}
	}
	
	public void addChild(Component c){
		//�ӳٳ�ʼ��
		if(childComponents == null){
			childComponents = new ArrayList<Component>();
		}
		childComponents.add(c);
		
		//���ж����·���Ƿ�Ϊ�գ����Ϊ�գ�˵��������Ǹ����
		if(this.getComponentPath() == null || this.getComponentPath().trim().length() == 0){
			//�ѱ������name���õ����·����
			this.setComponentPath(this.name);
		}
		
		//�ж�Ҫ����������·�����Ƿ���ֹ�
		//���ж��Ƿ��Ǹ����
		if(this.getComponentPath().startsWith(c.getName()+".")){
			//˵���Ǹ�������ظ������
			throw new java.lang.IllegalArgumentException("�ڱ�ͨ·�ϣ����'"+
					c.getName()+"'�Ѿ�����ӹ���");
		}else{
			if(this.getComponentPath().indexOf("."+c.getName()) < 0){
				//��ʾû�г��ֹ�����ô���Լ���
				//���������·��
				String componentPath = this.getComponentPath()+"."+this.getName();
				
				//���������·��
				c.setComponentPath(componentPath);
			}else{
				throw new java.lang.IllegalArgumentException("�ڱ�ͨ·�ϣ����'"+
						c.getName()+"'�Ѿ�����ӹ���");				
			}
		}
	}

	
	public String getName() {
		return this.name;
	}
}
