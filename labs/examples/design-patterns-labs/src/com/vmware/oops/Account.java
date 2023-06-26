package com.vmware.oops;

/**
 * Account Demo class
 */
public class Account {
    // byte, short, int, long, float, double, boolean, char
    // String

    // Access Modifiers - default, Private, Public, Protected
    // Properties
    private int accId;
    private String name;
    private double balance;
    private String type;

    private boolean isActive;

    // Default Constructor
    public Account() {
        System.out.println("Account default constructor called...");
    }

    // Overloaded constructor
    public Account(int accId, String name, double balance, String type, boolean isActive) {
        this.accId = accId;
        this.name = name;
        this.balance = balance;
        this.type = type;
        this.isActive = isActive;
    }

    // Behaviours / methods
    public void openAccount() {
        System.out.println("Opening an Account...");
        isActive = true;
    }
    public double checkBalance() {
        return this.balance;
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
    public void closeAccount() {
        System.out.println("Closing an Account...");
        isActive = false;
    }
}
