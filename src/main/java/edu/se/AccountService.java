package edu.se;
public class AccountService {
    Account createAccount(String accountType, String holderName, double balance){
        return new Account(accountType, holderName, balance);
    }

}
