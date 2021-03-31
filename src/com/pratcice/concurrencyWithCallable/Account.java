package com.pratcice.concurrencyWithCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
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
class WithdrawThread implements Callable<Double> {
    Account account;
    double amount;
    WithdrawThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    @Override
    public Double call() throws Exception {
        double transactionCharge = 0.0;
        try {
            if(account.getBalance() >= amount) {
                Thread.sleep(100);
                account.withdraw(this.amount);
                System.out.println("Balance after withdrawal: " + account.getBalance());
                transactionCharge = amount*0.005;
            }
            else throw new Exception("Not enough balance");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return transactionCharge;
    }
}
class DepositThread implements Callable<Double> {
    Account account;
    double amount;
    DepositThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    @Override
    public Double call() throws Exception {
        double transactionCharge = 0.0;
        try {
            Thread.sleep(50);
            account.deposit(this.amount);
            System.out.println("Balance after deposit: " + account.getBalance());
            transactionCharge = amount*0.005;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return transactionCharge;
    }
}
class AccountTransactions {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Account myAccount = new Account(300);
        ExecutorService e1 = Executors.newFixedThreadPool(2);
        Future<Double> charge1 = e1.submit(new DepositThread(myAccount, 200));
        Future<Double> charge2 = e1.submit(new WithdrawThread(myAccount, 300));
        System.out.println("Total transaction charge: " + (charge1.get() + charge2.get()));
        Thread.sleep(1000);
        e1.shutdown();
    }
}
