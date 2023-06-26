package com.vmware.oops;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        System.out.println("SavingsAccount constructor called...");
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(this.balance < amount) {
            System.out.println("In sufficient Balance");
        } else {
            this.balance -= amount;
        }
    }
}
