package com.company;


public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }


    public void deposit(double sum) {
        this.amount = amount + sum;
    }

    public double withDraw(int sum) throws LimitException {
        if (getAmount() < sum) {
            throw new LimitException("Сумма, которую вы хотите снять больше остатка на счете. Ваш остаток: " + amount, amount);
        }
        return amount = amount - sum;
    }
}
