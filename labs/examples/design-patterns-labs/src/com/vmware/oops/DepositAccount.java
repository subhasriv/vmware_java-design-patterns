package com.vmware.oops;

public class DepositAccount extends Account implements PreClossable, AutoRenewable{
    @Override
    public double checkBalance() {
        return this.getBalance();
    }

    @Override
    public void autoRenew() {
        System.out.println("Auto Renewing Deposit Account...");

    }

    @Override
    public void preClose() {
        System.out.println("Pre Closing Deposit Account...");
        this.setBalance(0.0);
    }
}
