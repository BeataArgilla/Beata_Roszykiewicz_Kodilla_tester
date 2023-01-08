package com.kodilla.bank.homework;

public class Bank {

    private final CashMachine payment;
    private final CashMachine withdraw;
    private String machineNumber;
    private double totalPayments;
    private double totalWithdraws;
    int tempP = 0;
    int tempW = 0;
    double totalCash;
    double averageP;
    double averageW;

    public Bank(String machineNumber) { /// dlaczego tutaj nazwa musi byc Bank?
        this.withdraw = new CashMachine();
        this.payment = new CashMachine();
    }

    public void setPaymentOrWithdraw(int cash) {
        if (cash > 0) {
            this.payment.add(cash);
            totalPayments = totalPayments + cash;
            tempP++;
            averageP = totalPayments/tempP;
        } else if (cash <0){
            this.withdraw.add(cash);
            totalWithdraws = totalWithdraws + cash;
            tempW++;
            averageW = totalWithdraws/tempW;
        }
    }
    public double getTotalCash() {
        totalCash = totalPayments+totalWithdraws;
        return totalCash;
    }
    public double getAverageOfPayments() {
        return averageP;
    }
    public double getAverageOfWithdraws() {
        return averageW;
    }
}



