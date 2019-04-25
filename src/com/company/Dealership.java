package com.company;

/*
Project: Team Project Design: Car Dealership Create the Java Classes
Purpose Details: Sales Lead Java Class
Course: IST 242
Team:  4
Date Developed: 02/17/2019
Last Date Changed: 04/25/2019
Rev:
*/

public class Dealership {
    //---- Data Members ----//

    //Inventory
    public int VINNumber;
    public String VehicleType;
    public int Milage;
    public float Price;

    //Location
    public String Address;
    public String Hours;
    public String PhoneNumber;

    //Customer
    private String Name;
    private String Number;
    private String Email;


    //---- Method Members ----//

    //--Inventory--//
    //Setter and Getter for VINNumber
    public int getVINNumber() { return VINNumber; }
    public void setVINNumber(int _VINNumber) {this.VINNumber = _VINNumber;}
    //Setter and Getter for VehicleType
    public String getVehicleType() { return VehicleType; }
    public void setVehicleType(String _VehicleType) {this.VehicleType = _VehicleType;}
    //Setter and Getter for Milage
    public int getMilage() { return Milage; }
    public void setMilage(int _Milage) {this.Milage = _Milage;}
    //Setter and Getter for Price
    public float getPrice() { return Price; }
    public void setPrice(float _Price) {this.Price = _Price;}

    //--Location--//
    //Setter and Getter for Address
    public String getAddress() { return Address; }
    public void setAddress(String _Address) {this.Address = _Address;}
    //Setter and Getter for Trucks
    public String getHours() { return Hours; }
    public void setHours(String _Hours) {this.Hours = _Hours;}
    //Setter and Getter for PhoneNumber
    public String getPhoneNumber() { return PhoneNumber; }
    public void setPhoneNumber(String _PhoneNumber) {this.PhoneNumber = _PhoneNumber;}


    //--Customer--//
    //Setter and Getter for Sedan
    public String getName() { return Name; }
    public void setName(String _Name) {this.Name = _Name;}
    //Setter and Getter for Trucks
    public String getNumber() { return Number; }
    public void setNumber(String _Number) {this.Number = _Number;}
    //Setter and Getter for Hybrid
    public String getEmail() { return Email; }
    public void setEmail(String _Email) {this.Email = _Email;}


}
