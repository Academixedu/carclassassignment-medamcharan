package com.example;

// Starter code for Bank class
public class Bank {
    // Attributes
    private String bankName;
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Add a constructor here
     public Bank(String bankName, String accountHolderName, String accountNumber, double balance) { 
        this.bankName=bankName;
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
      }

    // Add getter and setter methods here
    public String getBankName() {
        return bankName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // public String getBankName() { ... }
    // public void setBankName(String bankName) { ... }
    // public String getAccountHolderName() { ... }
    // public void setAccountHolderName(String accountHolderName) { ... }
    // public String getAccountNumber() { ... }
    // public void setAccountNumber(String accountNumber) { ... }
    // public double getBalance() { ... }
    // public void setBalance(double balance) { ... }

    
    // Method to display account details
    public void displayAccountDetails() {
        System.out.println(accountHolderName);  
        System.out.println(accountNumber);
        System.out.println(bankName);    
        System.out.println(balance);    
              
    }
 // Method to deposit money
 public void deposit(double amount) {
     System.out.println("deposit amount " +amount);
}

// Method to withdraw money
public void withdraw(double amount) {
   System.out.println("withdraw money"+ amount);
}
   

   
}
