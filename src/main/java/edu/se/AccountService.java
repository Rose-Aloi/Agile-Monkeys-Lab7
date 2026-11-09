package edu.se;
public class AccountService {
    Account createAccount(Account.AccountType type, String holderName, double balance){
        return new Account(type, holderName, balance);
    }
    void updateAccount(Account changingAccount, Account.AccountType type, String holderName, double balance){
        changingAccount = new Account(type, holderName, balance);
    }
public boolean deleteAccount(String accountName) {
        return accounts.remove(accountName); 

}
