package com.vmware.oops;

public class AccountMain {
    public static void main(String[] args) {
        // Account object
        Account acc1 = new Account();
        System.out.println(acc1);
        double balance = acc1.checkBalance();
        System.out.println("Account #1 Balance is " + acc1.checkBalance());
        acc1.deposit(5000.0);
        System.out.println("Account #1 Balance after deposit " + acc1.checkBalance());
        acc1.withdraw(2000.0);
        System.out.println("Account #1 Balance after withdrawal " + acc1.checkBalance());

        Account acc2 = new Account();
        double balance1 = acc2.checkBalance(); // 0
        System.out.println("Account #2 Balance is " + acc2.checkBalance());
        acc2.deposit(10000.0);
        System.out.println("Account #2 Balance after deposit " + acc2.checkBalance());
        acc2.withdraw(5000.0);
        System.out.println("Account #2 Balance after withdrawal " + acc2.checkBalance());

        Account acc3 = new Account(103, "Anil", 20000.0, "Savings", true);
        System.out.println("Account #3 Balance is " + acc3.checkBalance());
        acc3.deposit(10000.0);
        System.out.println("Account #3 Balance after deposit " + acc3.checkBalance());
        acc3.withdraw(5000.0);
        System.out.println("Account #3 Balance after withdrawal " + acc3.checkBalance());






    }
}
