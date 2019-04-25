package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {

    int cCount = 1;
    int sCount = 1;

    public static void main(String[] args) {
        //Car list
        Hashtable<String, Double> carTotal = new Hashtable<String, Double>();
        Enumeration<String> carNames;
        String carStr;

        carTotal.put("Sedan", 13602.12);
        carTotal.put("Hybrid", 22451.43);
        carTotal.put("Sport", 15010.94);

        //Accessories list
        Hashtable<String, Double> accessoryTotal = new Hashtable<String, Double>();
        Enumeration<String> accessoryNames;
        String accessoryStr;

        accessoryTotal.put("Seat Liner", 29.99);
        accessoryTotal.put("Weather Mat", 59.99);
        accessoryTotal.put("Windshield Wipers", 24.99);
        accessoryTotal.put("Wiper Fluid", 12.99);
        accessoryTotal.put("Head Lights", 124.99);

        //Parts list
        Hashtable<String, Double> partTotal = new Hashtable<String, Double>();
        Enumeration<String> partNames;
        String partStr;

        partTotal.put("Tire", 139.99);
        partTotal.put("Brakes", 119.99);
        partTotal.put("Brake pads", 25.99);
        partTotal.put("Valves", 32.99);
        partTotal.put("Rims", 189.99);


        Main main = new Main();

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char CUST_PRNT = 'P';
        final char INV_PRNT = 'I';
        final char SALES_CODE = 'T';
        final char DEAL_CODE = 'D';
        final char SALES_PERSON = 'S';
        final char HELP_CODE = '?';
        char userAction;
        System.out.println("Team 4 Car Dealership");
        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customer, List 'I'nventory, Add 'O'rder, List 'S'ales People or 'E'xit: ";
        final String PROMPT_INV_ACTION = "List 'C'ars, List 'A'ccessories, List 'P'arts or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Salesperson> sList = new ArrayList<>();
        ArrayList<Dealership> dList = new ArrayList<>();
        ArrayList<String> invList = new ArrayList<>();

        invList.add("Cars");
        invList.add("Accessories");
        invList.add("Parts");

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch (userAction) {
                case CUST_CODE:
                    cList.add(main.addCustomer());
                    break;
                case CUST_PRNT:
                    Customer.printCustomer(cList);
                    break;
                case INV_PRNT:
                    carNames = carTotal.keys();
                    accessoryNames = accessoryTotal.keys();
                    partNames = partTotal.keys();

                    userAction = getAction(PROMPT_INV_ACTION);
                    if(userAction == 'C')
                        while(carNames.hasMoreElements())
                        {
                            carStr = (String) carNames.nextElement();
                            System.out.println(carStr + " costs: $" + carTotal.get(carStr));
                        }
                    else if(userAction == 'A')
                    {
                        while(accessoryNames.hasMoreElements())
                        {
                            accessoryStr = (String) accessoryNames.nextElement();
                            System.out.println(accessoryStr + " costs: $" + accessoryTotal.get(accessoryStr));
                        }
                    }
                    else if(userAction == 'P')
                    {
                        while(partNames.hasMoreElements())
                        {
                            partStr = (String) partNames.nextElement();
                            System.out.println(partStr + " costs: $" + partTotal.get(partStr));
                        }
                    }
                    break;
                case SALES_CODE:
                    //SalesLead.listSalesLead);
                    break;
                case DEAL_CODE:
                    dList.add(main.locationDealership());
                    break;
                case SALES_PERSON:
                    sList.add(main.addListenToTheCustomersNeeds());
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public Customer addCustomer() {
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter The Customer's First Name: ");
        cust.setFirst(scnr.nextLine());
        System.out.println("Please Enter The Customer's Last Name: ");
        cust.setLast(scnr.nextLine());
        System.out.println("Please Enter The Customer's Phone Number ");
        cust.setphone(scnr.nextLine());
        System.out.println("Please Enter The Customer's Buying Preference (New or Used)");
        cust.setpreference(scnr.nextLine());
        return cust;
    }

    public Salesperson addListenToTheCustomersNeeds() {
        Salesperson needs = new Salesperson();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter The Customer's Price Range: ");
        needs.setPriceRange(scnr.nextLine());
        System.out.println("Please Enter The Customer's Vehicle Type (ie SUV, Sedan): ");
        needs.setVehicleType(scnr.nextLine());
        System.out.println("Please Enter The Customer's Car Color:  ");
        needs.setColor(scnr.nextLine());
        System.out.println("Please Enter The Customer's Payment Type: ");
        needs.setPayment(scnr.nextLine());
        System.out.println("Please Enter The Customer's Car Need: ");
        needs.setNeed(scnr.nextLine());
        return needs;
    }

    public Dealership locationDealership() {
        Dealership location = new Dealership();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter The Customer's Address: ");
        location.setAddress(scnr.nextLine());
        System.out.println("Please Enter The Customer's Phone Number:  ");
        location.setHours(scnr.nextLine());
        System.out.println("Please Enter The Customer's Payment Type: ");
        location.setPhoneNumber(scnr.nextLine());
        return location;
    }
}