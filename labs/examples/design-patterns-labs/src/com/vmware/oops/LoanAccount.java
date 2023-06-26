package com.vmware.oops;

public class LoanAccount extends Account {
    private double loanAmount;
    private int tenure;
    private String interestType;

    public LoanAccount() {

    }

    public LoanAccount(int accId, String name, boolean isActive, double loanAmount, int tenure, String interestType) {
        super(accId, name, loanAmount, isActive);
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.interestType = interestType;
    }

    public void payEmi(double amount) {

        this.balance -= amount * 0.5;
    }

    public void partPayment(double amount) {
        this.balance -= amount;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
        this.setBalance(loanAmount);
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public String getInterestType() {
        return interestType;
    }

    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }
}
