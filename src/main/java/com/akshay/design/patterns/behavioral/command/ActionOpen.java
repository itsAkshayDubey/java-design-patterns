package com.akshay.design.patterns.behavioral.command;

public class ActionOpen implements ActionListenerCommand {

	private Document document;
	
	public ActionOpen(Document document) {
		this.document = document;
	}
	
	public void execute() {
		document.open();
	}
}
