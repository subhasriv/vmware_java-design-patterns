package com.vmware.oops;

import java.io.Serializable;

/**
 * Account Demo class
 */
public abstract class Account { // implements Serializable, Cloneable {
    // byte, short, int, long, float, double, boolean, char
    // String

    // Access Modifiers - default, Private, Public, Protected
    // Properties
    private int accId;
    private String name;
    protected double balance;
    private boolean isActive;

    // Default Constructor
    public Account() {
        System.out.println("Account default constructor called...");
    }

    // Overloaded constructor
    public Account(int accId, String name, double balance, boolean isActive) {
        this.accId = accId;
        this.name = name;
        this.balance = balance;
        this.isActive = isActive;
    }

    // Behaviours / methods
    public void openAccount() {
        System.out.println("Opening an Account...");
        isActive = true;
    }
    public abstract double checkBalance();

    public void closeAccount() {
        System.out.println("Closing an Account...");
        isActive = false;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
