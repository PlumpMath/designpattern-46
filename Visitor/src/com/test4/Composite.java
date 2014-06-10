package com.test4;
import java.util.ArrayList;
import java.util.List;

/**
 * ��϶��󣬿��԰���������϶������Ҷ�Ӷ���
 * �൱�ڷ�����ģʽ�ľ����Elementʵ�ֶ���
 * @author zhang
 *
 */
public class Composite extends Component {
	/**
	 * �����洢��϶����а��������������
	 */
	private List<Component> childComponents = new ArrayList<Component>();
	
	/**
	 * ��϶��������
	 */
	private String name = "";
	
	/**
	 * ���췽����������϶��������
	 * @param name	��϶��������
	 */
	public Composite(String name){
		this.name = name;
	}
	
	public void addChild(Component child) {
		childComponents.add(child);
	}

	public String getName(){
		return name;
	}

	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitComposite(this);
		//ѭ����Ԫ�أ�����Ԫ��Ҳ���ܷ���
//		for (Component c : childComponents){
//			c.accept(visitor);
//		}
	}
	
	public List<Component> getChildComponents(){
		return childComponents;
	}
}
