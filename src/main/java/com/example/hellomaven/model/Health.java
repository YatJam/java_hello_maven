package com.example.hellomaven.model;

public class Health {

  private String healthMessage = "I am alive";

  public Health(String healthMessage){
    this.healthMessage = healthMessage;
  }

  public String getHealthMessage(){
    return healthMessage;
  }

  public void setHealthMessage(String healthMessage){
    this.healthMessage = healthMessage;
  }

}
