package edu.se;

public class Account {
  int accountNumber = 0;
  static int accountsCreated = 0;
  
  public Account(){
    accountsCreated++;
    accountNumber += accountsCreated;
  }

}
