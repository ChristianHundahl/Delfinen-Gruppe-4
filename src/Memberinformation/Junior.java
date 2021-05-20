package Memberinformation;
//@Emilia

public class Junior extends Membership{
    private double BASIC_MEMBERSHIP_FEE = 1000; //How to change price of all objects without changing code?
    //To change membership price: Make file rep. database
    //Each line junior, senior, passive = has price, gets from file
    //over60 = calc by class?
    //User --> can write to file for change price
    public Junior(String activity, double price) {
        super(activity, price);
        this.setActivity("Junior");
    }

    public double getMembershipFee(){ //Abstract method in Membership, each subclass @Overrides
        //FileManager
            //Filereader : file
                //if junior = return price
        //FileManager.readprices
            //FileManager find price for Junior
        return price;
    }

    @Override
    public double calculateMembershipFee(){
        return BASIC_MEMBERSHIP_FEE;
    }

    public void setBASIC_MEMBERSHIP_FEE(double BASIC_MEMBERSHIP_FEE) {
        this.BASIC_MEMBERSHIP_FEE = BASIC_MEMBERSHIP_FEE;
    }
}
