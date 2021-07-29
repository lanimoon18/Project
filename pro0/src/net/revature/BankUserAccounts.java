package net.revature;
import java.util.Scanner;
import java.util.*;
public class BankUserAccounts {

    private String username;
    private String password;
    private String accountType;
    private long accountId;
    private double accountBalance;

    public BankUserAccounts(String username, String password, String accountType, long accountId, double accountBalance) {
        this.username = username;
        this.password = password;
        this.accountType = accountType;
        this.accountId = accountId;
        this.accountBalance = accountBalance;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    //TODO: verify input login and password match to access account
    // public static void login() with information to name, accounttype, and account number

    public void checkBalance() {
        System.out.println("Balance Information");
        System.out.println("Account Number:" + accountId + "    " + "Account Balance:" + accountBalance);

    }

    public void deposit(double money) {
        System.out.println("Deposit Money");
        Scanner scanmoney = new Scanner(System.in);
        double depositmoney = scanmoney.nextDouble();

        System.out.println("Deposit Information");
        System.out.println("Original Account Balance:" + accountBalance);
        this.accountBalance += money;
        System.out.print("Updated Account Balance:" + accountBalance + "\n");
    }

    public void withdrawal(double takenMoney) {

    }
}