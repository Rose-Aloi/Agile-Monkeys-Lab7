package edu.se;
public class AccountService {
    Account createAccount(accountType type, String holderName, double balance){
        return new Account(type, holderName, balance);
    }
    void updateAccount(Account changingAccount, accountType type, String holderName, double balance){
        changingAccount = new Account(type, holderName, balance);
    }

}
