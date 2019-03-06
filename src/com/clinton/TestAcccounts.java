package com.clinton;


public class TestAcccounts {
    public static void main(String[] args) {
        Account acc1 = new Account("Mary", "001", 3000.50);
        Account acc2 = new Account("Husssein", "002", 300.00);
        Account acc3 = new Account("Miry", "003", 2700.39);
        Account acc4 = new Account("Musa", "004", 4350.75);
        Account acc5 = new Account("Jim", "005", 3890.60);

        System.out.println(acc1.getBalance());
        acc1.setBalance(6500.34);
        System.out.println(acc1.getBalance());

        acc2.deposit(1000);
        acc2.printDetails();
        acc2.withdraw(300);
        acc2.printDetails();

        Account[] accounts = { acc1, acc2, acc3, acc4 , acc5 };

        for (Account k : accounts)
        {
            k.deposit(100);
            k.printDetails();
        }

    }
}
