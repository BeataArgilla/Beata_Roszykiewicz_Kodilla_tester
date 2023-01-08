package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void tableShouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transaction = cashMachine.getCash();
        assertEquals(0, transaction.length);
        System.out.println("transaction.length=  " + transaction.length);
    }

    @Test
    public void checkPaymentsInCashMachine() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(-300);
        cashMachine.add(1000);
        int[] transaction = cashMachine.getCash();

        assertEquals(3, transaction.length);
        System.out.println("transaction.length" + transaction.length);
        assertEquals(100, transaction[0]);
        System.out.println("payment of Cash =  " + transaction[0]);
        assertEquals(-300, transaction[1]);
        System.out.println("payment of Cash =  " + transaction[1]);
        assertEquals(1000, transaction[2]);
        System.out.println("payment of Cash =  " + transaction[2]);
    }

    @Test
    public void checkSumOfCashMachine() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(-300);
        cashMachine.add(1000);
        cashMachine.getCashMachineSaldo();
        assertEquals(800, cashMachine.getCashMachineSaldo());
        System.out.println("Sum in CashMachine =  " + cashMachine.getCashMachineSaldo());
    }

    @Test
    public void numberOfPaymentAndWithdrawNumber() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(-300);
        cashMachine.add(1000);
        cashMachine.add(1000);
        cashMachine.add(-1000);
        cashMachine.add(1000);
        cashMachine.add(-1000);
        assertEquals(4, cashMachine.payment);
        System.out.println("Number of payments =  " + cashMachine.payment);
        assertEquals(3, cashMachine.withdraw);
        System.out.println("Number of withdraw =  " + cashMachine.withdraw);
    }
    @Test
    public void numberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(-300);
        cashMachine.add(1000);
        cashMachine.add(1000);
        cashMachine.add(-1000);
        cashMachine.add(1000);
        cashMachine.add(-1000);
        assertEquals(7, cashMachine.transsum);
        System.out.println("Number of transactions =  " + cashMachine.transsum);

    }
}
