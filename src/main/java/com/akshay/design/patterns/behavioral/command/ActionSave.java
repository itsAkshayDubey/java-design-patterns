package com.akshay.design.patterns.behavioral.command;

public class ActionSave implements ActionListenerCommand {
	
	private Document document;
	
	public ActionSave(Document document) {
		this.document = document;
	}
	
	public void execute() {
		document.save();
	}
}
