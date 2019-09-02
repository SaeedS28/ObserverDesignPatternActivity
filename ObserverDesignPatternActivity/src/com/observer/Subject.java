package com.observer;

public interface Subject {
	public void attach(Observer o);
	public void dettach(Observer o);
	public void Notify();
}
