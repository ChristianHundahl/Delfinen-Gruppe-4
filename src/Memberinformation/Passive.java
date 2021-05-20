package Memberinformation;
//@Emilia

public class Passive extends Membership{

    public Passive(String activity, double price) {
        super(activity, price);
        this.setActivity("Passive");
    }
    @Override
    public double readMembershipFeeFromFile(){
        //read file : file
        //identify passive price
        //return passive price
    }
}
