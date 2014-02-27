package com.test4;
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
		
		//��ӶԸ����������
		c.setParent(this);
	}


	public void removeChild(Component child) {
		if(childComponents != null){
			//����Ҫɾ��������ڼ����е�����λ��
			int idx = childComponents.indexOf(child);
			if(idx != -1){
				//�Ȱѱ�ɾ������Ʒ������ĸ���Ʒ���
				//���ó�Ϊ��ɾ������Ʒ������������ĸ���Ʒ���
				for(Component c : child.getChildren()){
					//ɾ������������Ǳ�ʵ����һ�����������
					c.setParent(this);
					//�ѱ�ɾ������Ʒ������������������ӵ���ǰʵ����
					childComponents.add(c);					
				}
			}
			
			//���ɾ��
			childComponents.remove(idx);
		}
		
	}
	
	public List<Component> getChildren(){
		return childComponents;
	}
	
}
