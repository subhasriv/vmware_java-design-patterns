package com.examples.java.accmgr3;

public class AccountServiceArrImpl implements AccountService {
    private Account[] accounts = new Account[10];
    int index = 0;

    @Override
    public void createAccount(Account account) {
        accounts[index++] = account;
        System.out.println("Account " + account.getId() + " Created.");
    }

    @Override
    public Account[] getAccounts() {
        return this.accounts;
    }

    @Override
    public Account getAccount(int id) {
        Account acc = null;
        for (Account account: accounts) {
            if(account != null && account.getId() == id) {
                acc = account;
            }
        }
        return acc;
    }

    @Override
    public void updateAccount(int id, Account account) {
        for(int i=0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getId() == id) {
                accounts[i] = account;
                System.out.println("Account " + accounts[i].getId() + " Updated");
            }
        }
    }

    @Override
    public void deleteAccount(int id) {
        for(int i=0; i < accounts.length; i++) {
            if(accounts[i] != null && accounts[i].getId() == id) {
                int accId = accounts[i].getId();
                accounts[i] = null;
                System.out.println("Account " + accId + " Deleted");
            }
        }
    }
}
