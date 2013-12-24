package com.test2;

import java.io.*;

public class ReflectTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws Exception 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
//		
//		MyInter m = new MyInterImpl();
//		
		BufferedReader reader = 
				new BufferedReader(new FileReader("config.txt"));
		
		String line = reader.readLine();
		Class clazz = Class.forName(line);
		
		MyInter inter =(MyInter) clazz.newInstance();
		inter.function();
	}

}
