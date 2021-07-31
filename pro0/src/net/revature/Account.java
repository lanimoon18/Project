package net.revature;

import java.util.Scanner;

public class Account {

    private String accountType;
    private long accountId;
    private double accountBalance;

    public Account(long accountId, String accountType, double accountBalance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }


    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void checkBalance() {
        System.out.println("Balance Information");
        System.out.println("Account Number:" + accountId + "    " + "Account Balance:" + accountBalance);

    }

    public void deposit(double money){
        System.out.println("Deposit Money");
        Scanner scanmoney = new Scanner(System.in);
        double depositmoney = scanmoney.nextDouble();
        scanmoney.close();
        System.out.println("Deposit Information");
        System.out.println("Original Account Balance:" + accountBalance);
        accountBalance += money;
        System.out.print("Updated Account Balance:" + accountBalance + "\n");
    }
    public void withdrawal(double money){
        System.out.println("How much would you like to withdraw?");
        Scanner scanwithdraw = new Scanner(System.in);
        double withdraw = scanwithdraw.nextDouble();
        scanwithdraw.close();
        System.out.println("Withdrawal Information");
        System.out.println("Original Account Balance:" + accountBalance);
        if (accountBalance >= withdraw) {
            accountBalance -= money;
            System.out.print("Updated Account Balance:" + accountBalance + "\n");
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }
}

