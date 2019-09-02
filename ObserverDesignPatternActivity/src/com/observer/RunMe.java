package com.observer;

public class RunMe {
	public static void main(String[] args) {
		PostOffice po = new PostOffice();
		Person p1 = new Person("Saad");
		Person p2 = new Person("Mark");
		Mail mail = new Mail("Saad", "SomeAddress", "Hi there");

		po.attach(p1);
		po.attach(p2);
		po.addMail(mail);
	}
}
