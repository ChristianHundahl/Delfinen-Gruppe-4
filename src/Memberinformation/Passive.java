package Memberinformation;
//@Emilia

public class Passive extends Membership{
    private double price = 500;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}
