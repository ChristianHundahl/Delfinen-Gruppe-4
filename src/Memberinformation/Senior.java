package Memberinformation;
//@Emilia

public class Senior extends Membership{

    public Senior(String activity, double price) {
        super(activity, price);
        this.setActivity("Senior");
    }
    @Override
    public double readMembershipFeeFromFile(){
        //read file : file
        //identify senior price
        //return senior price
    }
}