package Memberinformation;
//@Emilia

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Junior extends Membership{
//@Christian
    public Junior(String activity, double price) throws FileNotFoundException {
        super(activity, price);
        this.setActivity("Junior");
    }

    public Junior() throws FileNotFoundException{
        readMembershipFeeFromFile();
        this.setActivity("Junior");
    }

    @Override
    public double readMembershipFeeFromFile() throws FileNotFoundException { //@Christian
        File membershipPrices = new File("resources/MembershipFeePrices.csv");
        Scanner readMembershipPrices = new Scanner(membershipPrices);
        while(readMembershipPrices.hasNextLine()){
            String currentLine = readMembershipPrices.nextLine();
            String[] lineAsArray = currentLine.split(";");
                if(lineAsArray[0].equals("Junior")){
                    double juniorPrice = Double.parseDouble(lineAsArray[1]);
                    setPrice(juniorPrice);
                }
            }
        return this.getPrice();
    }
}