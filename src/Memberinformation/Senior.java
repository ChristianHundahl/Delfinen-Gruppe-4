package Memberinformation;
//@Emilia

public class Senior extends Membership{
    private double price = 1600;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}