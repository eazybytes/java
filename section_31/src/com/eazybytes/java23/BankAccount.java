package com.eazybytes.java23;

public class BankAccount {

    protected double balance;

    public BankAccount(double initialDeposit) {
        this.balance = initialDeposit;
        // Other initialization logic
        System.out.println("Bank account created with balance: " + balance);
    }

}
