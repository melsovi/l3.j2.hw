package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println("Счет: " + bankAccount.getAmount());
        while (true) {
            try {
                System.out.println("Снятие наличных: " + 6000 + "\nОстаток: " + bankAccount.withDraw(6000));
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    System.out.println("Снятие наличных: " + bankAccount.getAmount() + "\nОстаток: " + bankAccount.withDraw((int) e.getRemainingAmount()));
                } catch (LimitException exception) {
                    exception.printStackTrace();
                }
                break;
            }
        }
    }
}