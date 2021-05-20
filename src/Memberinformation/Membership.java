package Memberinformation;
//@Emilia

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

    public abstract double calculateMembershipFee();

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }
}