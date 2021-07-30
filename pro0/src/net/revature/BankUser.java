package net.revature;
import java.util.Scanner;
import java.util.*;
public class BankUser {

    private String username;
    private String password;
    private Account account;

    public BankUser(String username, String password, Account account) {
        this.username = username;
        this.password = password;
        this.account = account;
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


}