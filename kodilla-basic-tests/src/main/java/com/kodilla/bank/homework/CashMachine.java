package com.kodilla.bank.homework;

import java.util.Arrays;

public class CashMachine {
    private int[] transactions;
    private int size;

    public int sum;
    int withdraw =0;
    int payment= 0;
    int transsum;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }
    public void add(int cash) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = cash;
        this.transactions = newTab;
        sum = Arrays.stream(transactions).sum();
        if (cash < 0) {
            withdraw++;
        } else if (cash > 0) {
            payment++;
        }
        transsum = withdraw + payment;
    }
    public int getCashMachineSaldo() {
        return sum;
    }
    public int[] getCash() {
        return transactions;
    }
}
