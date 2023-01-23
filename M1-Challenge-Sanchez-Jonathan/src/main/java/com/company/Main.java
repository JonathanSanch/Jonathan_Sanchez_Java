package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

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
//      Hashset used for the purpose of making sure customers were unique.
        List<Customer> customers = new ArrayList<>();
        HashSet<Integer> uniqueIds = new HashSet<>();

        for (String[] row : customerData) {
            int id = Integer.parseInt(row[0]);
            if (!uniqueIds.contains(id)) {
                uniqueIds.add(id);
                String name = row[1];
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

