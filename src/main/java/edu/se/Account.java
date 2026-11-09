package edu.se;

public class Account {

  public enum AccountType {
    CHECKING, SAVINGS
  int accountNumber = 0;
  static int accountsCreated = 0;
  private String holderName;
  private double balance;
  public Account(){
    accountsCreated++;
    accountNumber += accountsCreated;
  }

  public AccountType type;

  public AccountType getType() {
    return type;
  }

  public void setType(AccountType type) {
    this.type = type;
  }
}
