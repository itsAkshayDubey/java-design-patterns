//Behavioral DP
package com.akshay.design.patterns.behavioral.command;

public class CommandPatternDemo {
	
	public static void main(String[] args) {
		
		Document document = new Document();
		
		ActionListenerCommand clickOpen = new ActionOpen(document);
		ActionListenerCommand clickSave = new ActionSave(document);
		
		MenuOptions menu = new MenuOptions(clickOpen, clickSave);
		
		menu.clickOpen();
		menu.clickSave();
		
	}

}
