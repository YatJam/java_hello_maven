package com.example.hellomaven.model;

public class Health {

  private String message = "I am alive";

  public Health(){
    
  }

  /**
	 * a string statement.
	 * 
	 * @return statement
	 */
  public String getMessage(){
    return message;
  }


/**
	 * setter for message.
	 * 
	 * @param message
	 */
  public void setHealthMessage(String message){
    this.message = message;
  }

}
