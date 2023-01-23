package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id = -1;
    private String name = "Empty";
    private int balance = 0; //added by me, helper variable
    private List<AccountRecord> charges = new ArrayList<>();

//    Default Constructor
    public Customer() {}

//    Constructor for Customers
    public Customer(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance += balance;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateBalance(int charge) {
        this.balance += charge;
    }

    public int getBalance() { //made by me, helper method
        //update this
        return this.balance;
    }

    public boolean checkPositive() { //made by me, helper method
        if (this.balance >= 0) {return true;}
        else {return false;}
    }

    public List<AccountRecord> getCharges() {
        return charges;
    }

    @Override
    public String toString() {
        //update this
        String toString = this.id + " " + this.name + " " + this.balance;
        return toString;
    }
}
