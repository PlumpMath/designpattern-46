package com.test5;

import java.util.*;
import java.io.*;
/**
 * ��д�ļ��ĸ���������
 * @author zhang
 *
 */
public class FileOpeUtil {
	/**
	 * ˽�л����췽���������ⲿ����ν�Ĵ�����ʵ��
	 * ��������಻��Ҫ������ʵ��
	 */
	private FileOpeUtil(){
		
	}
	
	/**
	 * ���ļ������ļ��л�ȡ�洢��List����
	 * @param pathName �ļ�·�����ļ���
	 */
	public static List readFile(String pathName){
		List list = new ArrayList();
		ObjectInputStream ois = null;
		
		try {
			File f = new File(pathName);
			if(f.exists()){
				ois = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(f)));
				list = (List)ois.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(ois != null){
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	/**
	 * д�ļ�����List����д���ļ���
	 * 
	 */
	public static void writeFile(String pathName,List list){
		File f = new File(pathName);
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream(f)));
			oos.writeObject(list);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(oos != null){
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
