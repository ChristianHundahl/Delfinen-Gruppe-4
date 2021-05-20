package Memberinformation;
//@Emilia

public class Passive extends Membership{
    private double BASIC_MEMBERSHIP_FEE = 500;

    public Passive(String activity, double price) {
        super(activity, price);
        this.setActivity("Passive");
    }
    @Override
    public double calculateMembershipFee(){
        return BASIC_MEMBERSHIP_FEE;
    }

    public void setBASIC_MEMBERSHIP_FEE(double BASIC_MEMBERSHIP_FEE) {
        this.BASIC_MEMBERSHIP_FEE = BASIC_MEMBERSHIP_FEE;
    }
}
