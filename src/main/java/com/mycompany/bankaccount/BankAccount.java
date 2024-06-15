package com.mycompany.bankaccount; 
public class BankAccount { 
private double balance; 
public BankAccount(String accountNumber, double balance) { 
this.balance = balance; 
} 
public void deposit(double amount) { 
if (amount > 0) { 
balance += amount; 
System.out.println("Deposited $" + amount); 
} else { 
System.out.println("Invalid deposit amount."); 
    } 
  } 
 
  public void withdraw(double amount) { 
    if (amount > 0 && amount <= balance) { 
      balance -= amount; 
      System.out.println("Withdrew $" + amount); 
    } else { 
      System.out.println("Insufficient funds or invalid withdrawal amount."); 
    } 
  } 
 
  public static void main(String[] args) { 
    BankAccount account = new BankAccount("ACC001", 500); 
    account.deposit(200); 
    account.withdraw(100); 
    account.withdraw(800);  
  } 
}