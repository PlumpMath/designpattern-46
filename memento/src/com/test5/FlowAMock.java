package com.test5;

import java.io.*;

/**
 * ģ����������A��ֻ��һ��ʾ�⣬��ָĳ����������
 * @author zhang
 *
 */
public class FlowAMock implements Serializable{
	/**
	 * �������ƣ�����Ҫ�ⲿ�洢�ĵ�״̬����
	 */
	private String flowName;
	
	/**
	 * ʾ�⣬��ָĳ���м�������Ҫ�ⲿ�洢��״̬����
	 */
	private int tempResult;
	
	/**
	 * ʾ�⣬��ָĳ���м�������Ҫ�ⲿ�洢��״̬����
	 */
	private String tempState;
	
	/**
	 * ���췽����������������
	 * @param flowName	��������
	 */
	public FlowAMock(String flowName){
		this.flowName = flowName;
	}
	
	/**
	 * ʾ�⣬�������̵ĵ�һ���׶�
	 */
	public void runPhaseOne(){
		//������׶Σ����ܲ������м�����ʾ��һ��
		tempResult = 3;
		tempState = "PhaseOne";
	}
	
	/**
	 * ʾ�⣬���շ���һ���������̺�벿��
	 */
	public void schema1(){
		//ʾ�⣬��Ҫʹ�õ�һ���׶β���������
		this.tempState += ",Schema1";
		System.out.println(this.tempState+": now run "+tempResult);
		this.tempResult += 11;
	}
	
	/**
	 * ʾ�⣬���շ��������������̺�벿��
	 */
	public void schema2(){
		//ʾ�⣬��Ҫʹ�õ�һ���׶β���������
		this.tempState += ",Schema2";
		System.out.println(this.tempState+"��now run "+tempResult);
		this.tempResult += 22;
	}
	
	/**
	 * ��������ԭ��������״̬�ı���¼����
	 * @return	�����õı���¼����
	 */
	public FlowAMockMemento createMemento(){
		return new MementoImpl(tempResult, tempState);
	}
	
	/**
	 * ��������ԭ���������״̬������ص�����¼�����¼��״̬
	 * @param memento	��¼��ԭ����״̬�ı���¼����
	 */
	public void setMemento(FlowAMockMemento memento){
		MementoImpl mementoImpl = (MementoImpl)memento;
		this.tempResult = mementoImpl.tempResult;
		this.tempState = mementoImpl.tempState;
	}
	
	/**
	 *�����ı���¼����ʵ�ֱ���¼խ�ӿ�
	 *ʵ�ֳ�˽�е��ڲ��࣬�����ⲿ����
	 */
	private static class MementoImpl implements FlowAMockMemento{
		/**
		 * ʾ�⣬����ĳ���м���
		 */
		private int tempResult;
		/**
		 * ʾ�⣬����ĳ���м���
		 */
		private String tempState;
		
		public MementoImpl(int tempResult,String tempState){
			this.tempResult = tempResult;
			this.tempState = tempState;
		}
		
		public int getTempResult(){
			return tempResult;
		}
		public String getTempState(){
			return tempState;
		}
	}
}
