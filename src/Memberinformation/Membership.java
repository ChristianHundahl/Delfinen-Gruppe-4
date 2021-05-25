package Memberinformation;
//@Emilia

import FileHandler.FileManager;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Membership {
//@Christian

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

}