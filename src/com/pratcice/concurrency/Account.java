package com.pratcice.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Account {
    double balance;
    Account(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public double getBalance() {
        return balance;
    }
}
class WithdrawThread implements Runnable {
    Account account;
    double amount;
    WithdrawThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    @Override
    public void run() {
        try {
            if(account.getBalance() >= amount) {
                Thread.sleep(100);                  // Introducing some delay
                account.withdraw(this.amount);
                System.out.println("Balance after withdrawal: " + account.getBalance());
            }
            else throw new Exception("Not enough balance");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class DepositThread implements Runnable {
    Account account;
    double amount;
    DepositThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(50);                   // Introducing some delay
            account.deposit(this.amount);
            System.out.println("Balance after deposit: " + account.getBalance());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class AccountTransactions {
  public static void main(String[] args) throws InterruptedException {
    Account myAccount = new Account(300);
    ExecutorService e1 = Executors.newFixedThreadPool(2);
    e1.execute(new DepositThread(myAccount, 200));
    e1.execute(new WithdrawThread(myAccount, 300));
    Thread.sleep(1000);                 // Introducing some delay
    e1.shutdown();
    }
}
