package com.observer;

public class Person implements Observer {
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public void update(Object o) {
		// TODO Auto-generated method stub
		
	}
	
}
