package edu.se;

public class Account {
  int accountNumber = 0;
  static int accountsCreated = 0;
  private String holderName;
  private double balance;
  public Account(){
    accountsCreated++;
    accountNumber += accountsCreated;
  }

}
