package Memberinformation;
//@Emilia

public class Junior extends Membership{
    private double BASIC_MEMBERSHIP_FEE = 1000;

    public Junior(String activity, double price) {
        super(activity, price);
        this.setActivity("Junior");
    }

    @Override
    public double calculateMembershipFee(){
        return BASIC_MEMBERSHIP_FEE;
    }

    public void setBASIC_MEMBERSHIP_FEE(double BASIC_MEMBERSHIP_FEE) {
        this.BASIC_MEMBERSHIP_FEE = BASIC_MEMBERSHIP_FEE;
    }
}
