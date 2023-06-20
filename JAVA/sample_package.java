import java.util.*;
//package sample_package;

// package SampleJava;

class Account {
    String account_holder;
    int acc_num;

    public void printInfo() {
        System.out
                .println("account holder name is " + this.account_holder + " their account number is " + this.acc_num);
    }
}

public class sample_package {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.account_holder = "aditi";
        a1.acc_num = 4321;
        a1.printInfo();
    }
}
