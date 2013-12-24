package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws Exception{
		
//		Person p = new Person();
//		
//		p.show();
		
		Class clazz = Class.forName("com.test.Person");
		
		/*Method[] methods = clazz.getDeclaredMethods();
		methods = clazz.getMethods();
		for(Method method:methods){
			
			System.out.println(method);
		}*/
		//Person p = (Person)clazz.newInstance();
		Constructor constructor = clazz.getConstructor(String.class);
		Person p = (Person)constructor.newInstance("zhangsan");
		
		Method method = clazz.getMethod("show", String.class,int.class);
		method.invoke(p, "haha",43);
		//p.show();
		
		
	}

}
