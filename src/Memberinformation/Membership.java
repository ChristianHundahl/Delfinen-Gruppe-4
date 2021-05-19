package Memberinformation;
//@Emilia

public abstract class Membership {
    private double price;
    private String activity;
    public Membership(String activity, double price){
        this.activity = activity;
        this.price = price;
    }
}
