package org.steinko.testtutorial.business;

public class Message {
	private String message;
	private String level;
	
	
	
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getLevel() {
		return level;
	}



	public void setLevel(String level) {
		this.level = level;
	}



	Message(String message, String level){
		this.message = message;
		this.level = level;
	}
	
	@Override
	public String toString() { 
		return getMessage() + getLevel(); 
		}

}
