package com.vmware.oops;

public class AccountMain {
    public static void main(String[] args) {
        // Account object
//        Account acc1 = new Account();
//        System.out.println(acc1);
//        double balance = acc1.checkBalance();
//        System.out.println("Account #1 Balance is " + acc1.checkBalance());
//        acc1.deposit(5000.0);
//        System.out.println("Account #1 Balance after deposit " + acc1.checkBalance());
//        acc1.withdraw(2000.0);
//        System.out.println("Account #1 Balance after withdrawal " + acc1.checkBalance());
//
//        Account acc2 = new Account();
//        double balance1 = acc2.checkBalance(); // 0
//        System.out.println("Account #2 Balance is " + acc2.checkBalance());
//        acc2.deposit(10000.0);
//        System.out.println("Account #2 Balance after deposit " + acc2.checkBalance());
//        acc2.withdraw(5000.0);
//        System.out.println("Account #2 Balance after withdrawal " + acc2.checkBalance());
//
//        Account acc3 = new Account(103, "Anil", 20000.0, "Savings", true);
//        System.out.println("Account #3 Balance is " + acc3.checkBalance());
//        acc3.deposit(10000.0);
//        System.out.println("Account #3 Balance after deposit " + acc3.checkBalance());
//        acc3.withdraw(5000.0);
//        System.out.println("Account #3 Balance after withdrawal " + acc3.checkBalance());

        SavingsAccount acc4 = new SavingsAccount();
        acc4.setAccId(100);
        acc4.setName("Manish");
        acc4.setBalance(25000.0);
        acc4.deposit(4000.0);
        System.out.println("Account #4 Details " + acc4.getAccId() + " " + acc4.getName() + " " + acc4.getBalance() + " " + acc4.isActive());

        LoanAccount acc5 = new LoanAccount(200,"Amit",true, 500000.0,3,"Fixed");
//        acc5.setAccId(200);
//        acc5.setName("Amit");
//        acc5.setLoanAmount(500000.0);
//        acc5.setTenure(3);
//        acc5.setInterestType("Fixed");
        acc5.payEmi(25000.0);
        acc5.preClose(); // pre-closing the account
//        acc5.payEmi(25000.0, false);

        System.out.println("Account #5 Details " + acc5.getAccId() + " " + acc5.getName() + " " + acc5.checkBalance() + " " + acc5.getInterestType() + " " + acc5.isActive());

        Account acc6 = new LoanAccount(201,"Sumit",true, 200000.0,3,"Fixed");
//        Account acc6 = new SavingsAccount(101, "Ajay", 50000.0, true);
        // not accessible
//        acc6.payEmi(25000.0);
//        acc.payEmi(25000.0, false);
//        acc6.preClose(); // Not Allowed

        System.out.println("Account #6 Details " + acc6.getAccId() + " " + acc6.getName() + " " + acc6.checkBalance()  + " " + acc6.isActive());

        PreClossable acc7 = new LoanAccount(201,"Sumit",true, 200000.0,3,"Fixed");
        acc7.preClose();

//        acc7.checkBalance(); // Not Allowed


        DepositAccount acc8 = new DepositAccount();
        acc8.setBalance(50000.0);
        System.out.println("Deposit Account Balance is " + acc8.checkBalance());

//        acc8.checkBalance();
//        acc8.preClose();
//        System.out.println("Deposit Account Balance after pre-close is " + acc8.checkBalance());

        acc8.autoRenew();
        System.out.println("Deposit Account Balance after auto-renew is " + acc8.checkBalance());

    }
}
