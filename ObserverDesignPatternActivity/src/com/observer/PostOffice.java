package com.observer;

import java.util.ArrayList;

public class PostOffice implements Subject{
	
	private ArrayList<Mail> allMail;
	private ArrayList<Observer> observer;
	
	public PostOffice() {
		allMail=new ArrayList<Mail>();
		observer=new ArrayList<Observer>();
	}
	
	public void addMail(Mail m) {
		allMail.add(m);
		Notify();
	}
	
	public ArrayList<Mail> getState(){
		return allMail;
	}

	@Override
	public void attach(Observer o) {
		observer.add(o);
	}

	@Override
	public void dettach(Observer o) {
		observer.remove(o);
	}

	@Override
	public void Notify() {
		for(int i=0;i<observer.size();i++) {
			observer.get(i).update(this);
		}
		
	}
}
