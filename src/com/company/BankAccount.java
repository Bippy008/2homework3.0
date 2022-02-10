package com.company;

public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount >= sum) {
            System.out.println("Выдано: " + sum + ". Остаток: " + (amount-sum));
            amount -= sum;
        } else {
            throw new LimitException("На счету недостаточно денег. Вам будет выдан остаток: " + amount, amount);
        }
    }
}
