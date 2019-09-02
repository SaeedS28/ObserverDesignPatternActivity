package com.observer;

import java.util.ArrayList;

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
		if(o instanceof PostOffice) {
			 PostOffice po = (PostOffice) o;
			 checkMail(po.getState());
		}
	}

	public void checkMail(ArrayList<Mail> state) {
		for(int i =0; i<state.size(); i++) {
			if(this.name.equals(state.get(i).getReceiverName())){
				System.out.println(name+" has received mail. \n\nContent:\n"+state.get(i).getContent());
			}
		}
	}
	
}
