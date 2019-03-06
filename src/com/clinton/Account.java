package com.clinton;

public class Account {

    private String name;
    private String AccNumber;
    private double balance;

    //constructor == function set up data


    public Account(String name, String accNumber, double balance) {
        this.name = name;
        AccNumber = accNumber;
        this.balance = balance;


    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNumber() {
        return AccNumber;
    }

    public void setAccNumber(String accNumber) {
        AccNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if (this.balance > amount){
            this.balance -= amount;
        }else
        {
            System.out.println("Insufficient balance");
        }
    }

    public void printDetails(){
        System.out.println("------------------");
        System.out.println("Name :" +this.name);
        System.out.println("Acc Number :" +this.AccNumber);
        System.out.println("Balance :" +this.balance);
    }


}
