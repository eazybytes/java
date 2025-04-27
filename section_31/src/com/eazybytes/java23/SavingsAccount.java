package com.eazybytes.java23;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialDeposit) {
        if (initialDeposit <= 0) {
            throw new IllegalArgumentException("Initial deposit must be positive");
        }
        initialDeposit = initialDeposit + 100; // Add 100 to the initial deposit for bank offer
        super(initialDeposit);
    }

}

    /*public SavingsAccount(double initialDeposit) {
        super(initialDeposit); // Potentially unnecessary work
        if (initialDeposit <= 0) {
            throw new IllegalArgumentException("Initial deposit must be positive");
        }
    }*/

/*private static double validateDeposit(double deposit) {
    if (deposit <= 0) {
        throw new IllegalArgumentException("Initial deposit must be positive");
    }
    return deposit;
}

public SavingsAccount(double initialDeposit) {
    super(validateDeposit(initialDeposit)); // Validation happens before superclass is called
}*/

