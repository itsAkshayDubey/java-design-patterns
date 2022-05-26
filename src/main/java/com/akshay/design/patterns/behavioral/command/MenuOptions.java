package com.akshay.design.patterns.behavioral.command;

public class MenuOptions {

	private ActionOpen actionOpen;
	private ActionSave actionSave;
	
	public MenuOptions(ActionListenerCommand clickOpen, ActionListenerCommand clickSave) {
		this.actionOpen = (ActionOpen) clickOpen;
		this.actionSave = (ActionSave) clickSave;
		
	}
	
	public void clickOpen() {
		actionOpen.execute();
	}
	
	public void clickSave() {
		actionSave.execute();
	}
}
