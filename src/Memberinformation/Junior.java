package Memberinformation;
//@Emilia

import FileHandler.FileManager;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Junior extends Membership{
    //How to change price of all objects without changing code?
    //To change membership price: Make file rep. database
    //Each line junior, senior, passive = has price, gets from file
    //over60 = calc by class?
    //User --> can write to file for change price
    private FileManager fm = new FileManager();

    public Junior(String activity, double price) throws FileNotFoundException {
        super(activity, price);
        this.setActivity("Junior");
    }

    public double getMembershipFee(){ //Abstract method in Membership, each subclass @Overrides
        Scanner sc = fm.getPriceSc();
        //FileManager

            //Filereader : file
                //if junior = return price
        //FileManager.readprices
            //FileManager find price for Junior
        //return price;
    }

    @Override
    public double readMembershipFeeFromFile(){
        //read file : file
        //identify junior price
        //return junior price
    }
}