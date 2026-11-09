package edu.se;

public class Account {
  int accountNumber = 0;
  static int accountsCreated = 0;
  double balance = 0;
  String holderName;
  accountType type;
  
  public Account(){
    accountsCreated++;
    accountNumber += accountsCreated;
    balance = 0;
    holderName = "";
    type = savings;
  }
  public Account(accountType type, String name, double balance){
      accountsCreated++;
      accountNumber += accountsCreated;
      this.balance = balance;
      this.type = type;
  }

}
