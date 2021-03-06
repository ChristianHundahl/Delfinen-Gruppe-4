package Memberinformation;
//@Emilia

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Passive extends Membership{
//@Christian
    public Passive(String activity, double price) throws FileNotFoundException { //@Christian
        super(activity, price);
        this.setActivity("Passive");
    }

    public Passive() throws FileNotFoundException{ //@Christian
        readMembershipFeeFromFile();
        this.setActivity("Passive");
    }

    @Override
    public double readMembershipFeeFromFile() throws FileNotFoundException { //@Christian
        File membershipPrices = new File("resources/MembershipFeePrices.csv");
        Scanner readMembershipPrices = new Scanner(membershipPrices);
        while(readMembershipPrices.hasNextLine()){
            String currentLine = readMembershipPrices.nextLine();
            String[] lineAsArray = currentLine.split(";");
            if(lineAsArray[0].equals("Passive")){
                double passivePrice = Double.parseDouble(lineAsArray[1]);
                setPrice(passivePrice);
            }
        }
        return this.getPrice();
    }
}