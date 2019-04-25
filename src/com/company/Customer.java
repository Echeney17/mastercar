package com.company;

/*
Project: Team Project Design: Car Dealership:
Purpose Details: Customer Java Class
Course: IST 242
Team:  4
Date Developed: 02/17/2019
Last Date Changed: 04/24/2019
Rev: 4
*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {
    //---- Data Members ----//

    //customer Name
    private int customerId;
    private String First;
    private String Last;
    private String phone;

    //Car Buying
    private String preference;


    //---- Method Members ----//

    //--Customer Name--//

    public Customer(int _customerId) {
        this.customerId = _customerId;  //Increments the ID count
    }

    //Setter and Getter for CustomerID

    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the id of the customer with the given argument
     *
     * @param _customerId int
     * @author Ryan Hough
     * @version 1.0
     * @since 2019-04-24
     */
    public void setCustomerId(int _customerId) {
        this.customerId = _customerId;
    }

    //Setter and Getter for First name

    /**
     * returns the first name of the customer
     *
     * @return First String
     * @author Ryan Hough
     * @version 1.0
     * @since 2019-04-24
     */
    public String getFirst() {
        return First;
    }

    /**
     * sets the first name of the customer
     *
     * @param _First String
     * @author Ryan Hough
     * @version 1.0
     * @since 2019-04-24
     */
    public void setFirst(String _First) {
        this.First = _First;
    }

    //Setter and Getter for Last name

    /**
     * returns the last name of the customer
     *
     * @return last String
     * @author Ryan Hough
     * @version 1.0
     * @since 2019-04-24
     */
    public String getLast() {
        return Last;
    }

    /**
     * sets the last name of the customer
     *
     * @param _Last String
     * @author Ryan Hough
     * @version 1.0
     * @since 2019-04-24
     */
    public void setLast(String _Last) {
        this.Last = _Last;
    }

    //Setter and Getter for customer Phone number

    /**
     * returns the phone of the customer
     *
     * @return phone String
     * @author Ryan Hough
     * @version 1.0
     * @since 2019-04-24
     */
    public String getphone() {
        return phone;
    }

    /**
     * sets the phone of the customer
     *
     * @param _phone String
     * @author Ryan Hough
     * @version 1.0
     * @since 2019-04-18
     */
    public void setphone(String _phone) {
        this.phone = _phone;
    }

    //Setter and Getter for customer buying Preference

    /**
     * returns the preference of the customer
     *
     * @return preference String
     * @author Ryan Hough
     * @version 1.0
     * @since 2019-04-24
     */
    public String getpreference() {
        return preference;
    }

    /**
     * sets the preference of the customer
     *
     * @param _preference String
     * @author Ryan Hough
     * @version 1.0
     * @since 2019-04-24
     */

    public void setpreference(String _preference) {
        this.preference = _preference;
    }

    /**
     * Add a new customer to the sysytem
     *
     * @return cust Customer Item in ArrayList
     * @author Ryan Hough
     * @version 1.0
     * @since 2019-04-24
     */


    public static Customer addCustomer() {
        int cCount = 1;
        Customer cust = new Customer(cCount++);
        //try Block to check customer Input for a string
        try {

            Scanner scnr = new Scanner(System.in);
            System.out.println("Please Enter The Customer's First Name: ");
            cust.setFirst(scnr.nextLine());
            System.out.println("Please Enter The Customer's Last Name: ");
            cust.setLast(scnr.nextLine());
            System.out.println("Please Enter The Customer's Phone Number ");
            cust.setphone(scnr.nextLine());
            System.out.println("Please Enter The Customer's Buying Preference (New or Used)");
            cust.setpreference(scnr.nextLine());

        }
        //catch block to handle exception
        catch (InputMismatchException input) {
            System.out.println("Please enter correct input... ");
        }

        return cust;

    }

    /**
     * Print a list of customers added to the system
     *
     * @param cList Customer Array List
     * @author Ryan Hough
     * @version 1.0
     * @since 2019-04-24
     */

    public static void printCustomer(ArrayList<Customer> cList) {
        for (Customer cust : cList) {
            System.out.println("Customer Id: " + cust.getCustomerId());
            System.out.println("Customer Name: " + cust.getFirst() + " " + cust.getLast());
            System.out.println("Customer Phone: " + cust.getphone());
            System.out.println("Buying Preference: " + cust.getpreference());
        }
    }
}