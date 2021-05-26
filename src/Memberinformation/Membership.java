package Memberinformation;
//@Emilia

import FileHandler.FileManager;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Membership {
//@Christian

    private double price;
    private String activity;
    private FileManager fm = new FileManager();
    Scanner sc = fm.getPriceSc();

    public Membership(String activity, double price) throws FileNotFoundException {
        this.activity = activity;
        this.price = price;
    }

    public Membership() throws FileNotFoundException {

    }

    public abstract double readMembershipFeeFromFile() throws FileNotFoundException;//Each subclass @Overrides

    public void setActivity(String activity) {
        this.activity = activity;
    }
    public String getActivity() {
        return activity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return activity + ";" + price;
    }
//Methods:
    //System.out.println("Press 1 to Show projected income");
    /*Read nop. of members from file
        Spilt file into:
        Junior
        Senior
        Passive
    Multiply each category no. of members w/ category price
    System.out.println(Result)*/
    /*public void showProjectedIncome() throws FileNotFoundException{
        while(){

            double projectedIncomeFromJuniors = 0;
            double projectedIncomeFromSeniors = 0;
            double projectedIncomeFromPassives = 0;

            if(this.activity == "Junior") {
                double incomeFromMember = getPrice();
                projectedIncomeFromJuniors = projectedIncomeFromJuniors + incomeFromMember;
            }

            if(this.activity == "Senior") {
                double incomeFromMember = getPrice();
                projectedIncomeFromSeniors = projectedIncomeFromSeniors + incomeFromMember;
            }
            if(this.activity == "Passive") {
                double incomeFromMember = getPrice();
                projectedIncomeFromPassives = projectedIncomeFromPassives + incomeFromMember;
            }

            System.out.println("Projected income form Junior members: " + projectedIncomeFromJuniors);
            System.out.println("Projected income form Senior members: " + projectedIncomeFromSeniors);
            System.out.println("Projected income form Passive members: " + projectedIncomeFromPassives);

        }
    }

    //System.out.println("Press 3 to change prices");
    /*Read file
    * Show current prices
    * Take input to change prices from user*/
}