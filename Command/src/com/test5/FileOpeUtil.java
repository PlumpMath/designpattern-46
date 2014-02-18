package com.test5;

import java.util.*;
import java.io.*;
/**
 * 读写文件的辅助工具类
 * @author zhang
 *
 */
public class FileOpeUtil {
	/**
	 * 私有化构造方法，避免外部无所谓的创建类实例
	 * 这个工具类不需要创建类实例
	 */
	private FileOpeUtil(){
		
	}
	
	/**
	 * 读文件，从文件中获取存储的List对象
	 * @param pathName 文件路径和文件名
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
	 * 写文件，把List对象写到文件中
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
