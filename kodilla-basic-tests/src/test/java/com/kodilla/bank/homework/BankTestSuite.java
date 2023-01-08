package com.kodilla.bank.homework;

import com.kodilla.school.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void numberOfPaymentsAndWithdraws() {
        Bank bank = new Bank("Numer bankomatu: 112");
        bank.setPaymentOrWithdraw(1000);
        bank.setPaymentOrWithdraw(2000);
        bank.setPaymentOrWithdraw(200);
        bank.setPaymentOrWithdraw(-200);
        bank.setPaymentOrWithdraw(800);
        bank.setPaymentOrWithdraw(0);
        assertEquals(4, bank.tempP);
        assertEquals(1, bank.tempW);
        System.out.println("Number of payments =  " + bank.tempP);
        System.out.println("Number of withdraws =  " + bank.tempW);

    }
    @Test
    public void totalOfAllCashMachines() {
        Bank bank = new Bank("Numer bankomatu: 112");
        bank.setPaymentOrWithdraw(1000);
        bank.setPaymentOrWithdraw(2000);
        bank.setPaymentOrWithdraw(200);
        bank.setPaymentOrWithdraw(-200);
        bank.setPaymentOrWithdraw(800);
        bank.setPaymentOrWithdraw(0);
        assertEquals(3800, bank.getTotalCash());
        System.out.println("Total amount of cash =  " + bank.getTotalCash());


    }

    @Test
    public void averageValueOfPaymentAndWithdraw() {
        Bank bank = new Bank("Numer bankomatu: 112");
        bank.setPaymentOrWithdraw(1000);
        bank.setPaymentOrWithdraw(-1000);
        bank.setPaymentOrWithdraw(200);
        bank.setPaymentOrWithdraw(-200);
        bank.setPaymentOrWithdraw(800);
        bank.setPaymentOrWithdraw(-800);

        assertEquals(666.66, bank.getAverageOfPayments(), 0.1);
        assertEquals(-666.66, bank.getAverageOfWithdraws(), 0.1);
        System.out.println("Average of payment =  " + bank.getAverageOfPayments());
        System.out.println("Average of withdraws =  " + bank.getAverageOfWithdraws());

    }


}
