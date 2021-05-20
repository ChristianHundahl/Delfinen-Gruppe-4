package Memberinformation;
//@Emilia

public class Senior extends Membership{
    private double BASIC_MEMBERSHIP_FEE = 1600;

    public Senior(String activity, double price) {
        super(activity, price);
        this.setActivity("Senior");
    }
    @Override
    public double calculateMembershipFee(){
        return BASIC_MEMBERSHIP_FEE;
    }

    public void setBASIC_MEMBERSHIP_FEE(double BASIC_MEMBERSHIP_FEE) {
        this.BASIC_MEMBERSHIP_FEE = BASIC_MEMBERSHIP_FEE;
    }
}