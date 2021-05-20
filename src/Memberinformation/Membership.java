package Memberinformation;
//@Emilia

import java.io.FileNotFoundException;

public abstract class Membership {
    /*Each inherited subclass
    * - has own price
    * - use own method to calculate price
    * Membership has
    * - constructor for 'Membership' object
    * - abstract method 'calculatePrice
    * - Getter + Setter 'activity'*/
    private double price;
    private String activity;

    public Membership(String activity, double price){
        this.activity = activity;
        this.price = price;
    }

    //Abstract method in Membership, each subclass @Overrides
    //FileManager
        //Filereader : file
        //if junior = return price
    //FileManager.readprices
    //FileManager find price for Junior
    //return price;
    public abstract double readMembershipFeeFromFile() throws FileNotFoundException;


    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }
}