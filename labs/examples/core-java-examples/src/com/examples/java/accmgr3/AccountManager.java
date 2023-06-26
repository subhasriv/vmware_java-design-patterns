package com.examples.java.accmgr3;

public class AccountManager {

    public static void main(String[] args) {
//        AccountServiceOld accService = new AccountServiceOld();

        AccountService accService = new AccountServiceArrImpl();

        // 1. Create set of Accounts (5)
        Account acc1 = new Account(100, "Anu", "Savings", 25000.0, true);
        Account acc2 = new Account(101, "John", "Loan", 250000.0, true);
        Account acc3 = new Account(102, "Neha", "Deposit", 50000.0, true);

        accService.createAccount(acc1);
        accService.createAccount(acc2);
        accService.createAccount(acc3);

        // 2. View all Accounts
        Account[] accounts = accService.getAccounts();
        for(Account account: accounts) {
            if(account != null) {
                System.out.println(account);
            }
        }

        // 3. View an Account for given Account ID
        System.out.println("Fetching Account " + 102);
        Account account = accService.getAccount(102);
        System.out.println(account);

        // 4. Update an Account for given Account ID
        Account accountForUpdate = new Account(102, "Neha", "Deposit", 75000.0, true);
        accService.updateAccount(102, accountForUpdate);
        System.out.println(accService.getAccount(102));

        // 5. Delete an Account for given Account ID
        accService.deleteAccount(102);
        System.out.println(accService.getAccount(102));

    }

}
