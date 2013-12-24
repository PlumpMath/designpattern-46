package com.test;

public class Person {

	private String name;
	
	/*public Person(){
		System.out.println("Person run");
	}*/

	public Person(String name) {
		super();
		this.name = name;
	}

	private void func() {
	}

	public void show(String str, int x) {

		System.out.println("name="+name+",str=" + str + ",,x=" + x);
	}
}
