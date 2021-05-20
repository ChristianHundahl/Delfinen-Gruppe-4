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
    Scanner sc = fm.getPriceSc();

    public Junior(String activity, double price) throws FileNotFoundException {
        super(activity, price);
        this.setActivity("Junior");
    }

    @Override
    public double readMembershipFeeFromFile() throws FileNotFoundException {
            while(sc.hasNextLine()){
                String currentLine = sc.nextLine();
                String[] lineAsArray = currentLine.split(";");
                if(lineAsArray[0].equals("Junior")){
                    int juniorPrice = Integer.parseInt(lineAsArray[1]);
                    return juniorPrice;
                }
            }
            return 0;
    }
}