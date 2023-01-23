package com.company;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

//    Turns on the testing powers of JUnit
    @Test
//  Testing getBalance method
    public void shouldReturnCustomerBalance() {
//      Testing customer initialized with default Constructor
        Customer test = new Customer();
        assertEquals(0,test.getBalance());
        System.out.println(test.getBalance());

//      Testing Customer initialized with main Constructor used in program
        Customer fred = new Customer(4, "Fred", 10000);
        assertEquals(10000, fred.getBalance());
        System.out.println(fred.getBalance());

        //Helper method test (EXTRA)
        fred.updateBalance(-20000);
        assertEquals(-10000, fred.getBalance());
        System.out.println(fred.getBalance());
    }

    @Test
//  Testing toString method
    public void shouldPrintCustomerInformation() {
        Customer test = new Customer();
        assertEquals("-1 Empty 0", test.toString());
        System.out.println(test);      //Using sout statements for clarity

        Customer dalonte = new Customer(1, "Dalonte", 100000);
        assertEquals("1 Dalonte 100000", dalonte.toString());
        System.out.println(dalonte);
    }

}