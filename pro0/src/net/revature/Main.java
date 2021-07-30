package net.revature;

public class Main {

    public static void main(String[] args) {
        //String name, String password, String accountType, long accountId, double accountBalance
        Account acc = new Account(03123154, "checking", 2536.23);
        BankUser account = new BankUser("Laura", "Pandas10", acc );

        acc.checkBalance();
        acc.deposit(235.02);
        //acc.withdrawal(1000.00);
    }
}




