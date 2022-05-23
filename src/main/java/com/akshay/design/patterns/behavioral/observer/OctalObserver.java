package com.akshay.design.patterns.behavioral.observer;

public class OctalObserver extends Observer{

	public OctalObserver(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Octal String: "+Integer.toOctalString(subject.getState()));
	}

}
