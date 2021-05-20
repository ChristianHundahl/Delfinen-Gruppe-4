package Memberinformation;
//@Emilia

import FileHandler.FileManager;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Senior extends Membership{
    private FileManager fm = new FileManager();
    Scanner sc = fm.getPriceSc();

    public Senior(String activity, double price) {
        super(activity, price);
        this.setActivity("Senior");
    }
    @Override
    public double readMembershipFeeFromFile(){
        //read file : file
        //identify senior price
        //return senior price as a double
    }
}