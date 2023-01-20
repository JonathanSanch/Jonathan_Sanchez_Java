package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private int balance; //added by me
    private List<AccountRecord> charges = new ArrayList<>();

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
        balance += charge;
    }

    public int getBalance() { //made by me
        //update this
        return 0;
    }

    public checkPositive(Customer aCustomer) { //made by me
        if (aCustomer.balance >= 0) {return true;}
        else {return false}
    }

    public List<AccountRecord> getCharges() {
        return charges;
    }

    @Override
    public String toString() {
        //update this
        return "Update me";
    }
}
