package com.company;

/*
Project: Team Project Design: Car Dealership:
Purpose Details: Inventory Java Class
Names: Steve Pollock + Evan Cheney
Course: IST 242
Team:  4
Date Developed: 02/17/2019
Last Date Changed: 04/24/2019
Rev: 4
*/
import java.util.ArrayList;
import java.util.Enumeration;

public class Inventory
{
    //Inventory
    private String Car;
    private String Accessories;
    private ArrayList<Inventory> Parts;

   /* public Inventory(String _car, String _accessories, String _parts){
        this.Car = _car;
        this.Accessories = _accessories;
        this.Parts = _parts;
    } */

    //Lists for all Inventory things
    ArrayList<Inventory> carList = new ArrayList();
    ArrayList<Inventory> accessoryList = new ArrayList();
    ArrayList<Inventory> partsList = new ArrayList();

    //Parts List
    String part1 = "Brakes";
    //Methods
    public String getCar() {
        return Car;

    }
    /**
     * @param           _car
     * @return          Connected true or false
     * @author          Steve Pollock
     * @version         1.0
     * @since           2019-04-25
     */
    public void setCar(String _car) {
        Car = _car;

    }
    /**
     * @param           car
     * @return          Connected true or false
     * @author          Steve Pollock
     * @version         1.0
     * @since           2019-04-25
     */

    public String getAccessories() {
        return Accessories;

    }

    public void setAccessories(String _accessories) {
        Accessories = _accessories;

    }

    public String getParts() {
        return Parts.toString();

    }

    public void setParts(ArrayList<Inventory> Parts) {
        Parts.toString();
    }

    public static void printParts(ArrayList<Inventory> partsList)
    {
        System.out.println("Parts list: ");
        for (Inventory part : partsList)
        {
            System.out.println(part.part1);
        }
    }
}