package edu.se;

public class Account {
  public enum AccountType {
    CHECKING, SAVINGS
  }
  int accountNumber = 0;
  static int accountsCreated = 0;
  double balance = 0;
  String holderName;
  AccountType type;
  
  public Account(){
    accountsCreated++;
    accountNumber += accountsCreated;
    balance = 0;
    holderName = "";
    type = AccountType.CHECKING;
  }
  public Account(AccountType type, String name, double balance){
      accountsCreated++;
      accountNumber += accountsCreated;
      this.balance = balance;
      holderName = name;
      this.type = type;
  }

}
