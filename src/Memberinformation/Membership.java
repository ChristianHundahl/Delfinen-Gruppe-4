package Memberinformation;
//@Emilia

import FileHandler.FileManager;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Membership {
//@Christian

    private double price;
    private String activity;
    private FileManager fm;
    Scanner sc;

    public Membership(String activity, double price) throws FileNotFoundException {
        this.activity = activity;
        this.price = price;
        this.fm = new FileManager();
        this.sc = fm.getPriceSc();
    }

    public String toString(){ //
        return price + " " + activity;
    }

    public Membership(){}

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
//Methods:
    //System.out.println("Press 1 to Show projected income");
    /*Read nop. of members from file
        Spilt file into:
        Junior
        Senior
        Passive
    Multiply each category no. of members w/ category price
    System.out.println(Result)*/
    public void showProjectedIncome() throws FileNotFoundException{
        while(memberlist members : memberlist){

            double projectedIncomeFromJuniors = 0;
            double projectedIncomeFromSeniors = 0;
            double projectedIncomeFromPassives = 0;

            if(member.Activity(Junior)) {
                double incomeFromMember = Double.parseDouble(lineAsArray[1]);
                projectedIncomeFromJuniors = projectedIncomeFromJuniors + incomeFromMember;
            }

            if(member.Activity(Senior)) {
                double incomeFromMember = Double.parseDouble(lineAsArray[1]);
                projectedIncomeFromSeniors = projectedIncomeFromSeniors + incomeFromMember;
            }
            if(member.Activity(Passive)) {
                double incomeFromMember = Double.parseDouble(lineAsArray[1]);
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