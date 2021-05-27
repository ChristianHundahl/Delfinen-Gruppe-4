package Memberinformation;
//@Emilia

import FileHandler.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Membership {
//@Christian

    private double price;
    private String activity;
    private FileManager fm = new FileManager();
    Scanner sc = fm.getPriceSc();

    public Membership(String activity, double price) throws FileNotFoundException { //@Christian
        this.activity = activity;
        this.price = price;
    }

    public Membership() throws FileNotFoundException {

    }

    public abstract double readMembershipFeeFromFile() throws FileNotFoundException;//@Christian

    public void setActivity(String activity) {
        this.activity = activity;
    }
    public String getActivity() {
        return activity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return activity + ";" + price;
    }
}