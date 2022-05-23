package com.akshay.design.patterns.behavioral.observer;

public class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
	}

}
