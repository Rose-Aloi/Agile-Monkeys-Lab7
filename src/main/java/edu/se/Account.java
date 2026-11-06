package edu.se;

public class Account {

  public enum AccountType {
    CHECKING, SAVINGS
  }

  public AccountType type;

  public AccountType getType() {
    return type;
  }

  public void setType(AccountType type) {
    this.type = type;
  }
}
