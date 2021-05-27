package Memberinformation;
//@Emilia

import java.io.FileNotFoundException;

public abstract class Membership {
//@Christian

    private double price;
    private String activity;

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