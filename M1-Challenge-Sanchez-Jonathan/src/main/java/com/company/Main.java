package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

//    Notes to self:
//    each customer has a unique number identifier *DONE*
//    each customer needs their own Customer object *DONE*
//    each transaction has a data attached
//    charges need to be parsed to int so that balance can be updated *DONE*
//    charges do not need to be parsed back into strings to output *DONE*
//    create a private balance variable in customer class *DONE*
//    create checkPositive (0 inclusive) *DONE* and checkNegative functions(Not needed)
//    Find and output number of unique customers *DONE*
//    Does "print customer information include all account records?
//    create updateBalance method *DONE*
//    For get balance, need to use the stream into a new method "sum" that will take all the charges
//    and then add them up for the getBalance method that access the Account Record. This will
//    allow me to not have to make my own variables.
//    For testing class, instead of putting everything inside the constructor, use the setter and getter
//    methods in order to set the values of the test customer object and class


    private static List<String[]> customerData = Arrays.asList(
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"},
            new String[]{"2", "Daily Planet", "-7500", "01-10-2022"},
            new String[]{"1", "Wayne Enterprises", "18000", "12-22-2021"},
            new String[]{"3", "Ace Chemical", "-48000", "01-10-2022"},
            new String[]{"3", "Ace Chemical", "-95000", "12-15-2021"},
            new String[]{"1", "Wayne Enterprises", "175000", "01-01-2022"},
            new String[]{"1", "Wayne Enterprises", "-35000", "12-09-2021"},
            new String[]{"1", "Wayne Enterprises", "-64000", "01-17-2022"},
            new String[]{"3", "Ace Chemical", "70000", "12-29-2022"},
            new String[]{"2", "Daily Planet", "56000", "12-13-2022"},
            new String[]{"2", "Daily Planet", "-33000", "01-07-2022"},
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"},
            new String[]{"2", "Daily Planet", "33000", "01-17-2022"},
            new String[]{"3", "Ace Chemical", "140000", "01-25-2022"},
            new String[]{"2", "Daily Planet", "5000", "12-12-2022"},
            new String[]{"3", "Ace Chemical", "-82000", "01-03-2022"},
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"}
    );

    public static void main(String[] args) {
        //Update this

//        Customer WayneEnterprises = new Customer(1, "Wayne Enterprises", 0);
//        Customer DailyPlanet = new Customer(2, "Daily Planet", 0);
//        Customer AceChemical = new Customer(3, "Ace Chemical", 0);

        List<Customer> customers = new ArrayList<>();
        HashSet<Integer> uniqueIds = new HashSet<>();

        for (String[] row : customerData) {
            int id = Integer.parseInt(row[0]);
            if (!uniqueIds.contains(id)) {
                uniqueIds.add(id);
                String name = row[1];
                // TODO: add account record update to charge date
                int balance = Integer.parseInt(row[2]);
                customers.add(new Customer(id, name, balance));
            }
            else {
                for (Customer customer : customers) {
                    if (customer.getId() == id) {
                        int balance = Integer.parseInt(row[2]);
                        customer.updateBalance(balance);
                        break;
                    }
                }
            }
        }

        System.out.println(customers);

        System.out.println("There are " + uniqueIds.size() + " unique customers.");



//      Print out all accounts that have a positive balance
        System.out.println("Positive accounts:");
        for (Customer customer : customers) {
            if(customer.checkPositive()) {
                System.out.println(customer);
            }
        }
        System.out.println("-----------------");
        System.out.println("Negative accounts:");
        for (Customer customer : customers) {
            if(!customer.checkPositive()) {
                System.out.println(customer);
            }
        }
    }
}

