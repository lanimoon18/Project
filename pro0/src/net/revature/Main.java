package net.revature;

public class Main {

    public static void main(String[] args) {
        //String name, String password, String accountType, long accountId, double accountBalance
        BankUserAccounts account = new BankUserAccounts("Laura", "Pandas10", "checkings", 0112012036, 2356.24);

        account.checkBalance();
        account.deposit(235.02);
        account.withdrawal(1000.00);
    }
}




