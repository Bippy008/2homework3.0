package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount usersBankAccount = new BankAccount(20000);
        while(true) {
            try {
                usersBankAccount.withDraw(6000);
            } catch (LimitException limitException) {
                limitException.getMessage();
                try {
                    usersBankAccount.withDraw((int) limitException.getRemainingAmount());
                } catch (LimitException limitException1) {
                    limitException1.printStackTrace();
                }
                break;
            }
        }
    }
}
