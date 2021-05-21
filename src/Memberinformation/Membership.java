package Memberinformation;
//@Emilia

import FileHandler.FileManager;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Membership {
//@Christian
    //How to change price of all objects without changing code?
    //To change membership price: Make file rep. database
    //Each line junior, senior, passive = has price, gets from file
    //over60 = calc by class?
    //User --> can write to file for change price

    private double price;
    private String activity;
    private FileManager fm;
    Scanner sc;

    public Membership(String activity, double price) throws FileNotFoundException {
        this.activity = activity;
        this.price = price;
        this.fm = new FileManager();
        this.sc = fm.getPriceSc();
    }

    public Membership(){}

    public abstract double readMembershipFeeFromFile() throws FileNotFoundException;//Each subclass @Overrides
    //FileManager
    //Filereader : file
    //if junior = return price
    //FileManager.readprices
    //FileManager find price for Junior
    //return price;

    public void setActivity(String activity) {
        this.activity = activity;
    }
    public String getActivity() {
        return activity;
    }

    public double setPrice(double price) {
        this.price = price;
        return price;
    }
    public double getPrice() {
        return price;
    }
}