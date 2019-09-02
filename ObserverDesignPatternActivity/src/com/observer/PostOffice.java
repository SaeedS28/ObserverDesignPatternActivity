package com.observer;

import java.util.ArrayList;

public class PostOffice {
	
	private ArrayList<Mail> allMail;
	
	public PostOffice() {
		allMail=new ArrayList<Mail>();
	}
	
	public void addMail(Mail m) {
		allMail.add(m);
	}
	
	public ArrayList<Mail> getState(){
		return allMail;
	}
}
