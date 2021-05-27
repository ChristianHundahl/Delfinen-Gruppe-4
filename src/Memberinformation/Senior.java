package Memberinformation;
//@Emilia

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Senior extends Membership{
//@Christian
    public Senior(String activity, double price) throws FileNotFoundException { //@Christian
        super(activity, price);
        this.setActivity("Senior");
    }

    public Senior() throws FileNotFoundException{ //@Christian
        readMembershipFeeFromFile();
        this.setActivity("Senior");
    }

    @Override
    public double readMembershipFeeFromFile() throws FileNotFoundException { //@Christian
        File membershipPrices = new File("resources/MembershipFeePrices.csv");
        Scanner readMembershipPrices = new Scanner(membershipPrices);
        while(readMembershipPrices.hasNextLine()){
            String currentLine = readMembershipPrices.nextLine();
            String[] lineAsArray = currentLine.split(";");
            if(lineAsArray[0].equals("Senior")){
                double seniorPrice = Double.parseDouble(lineAsArray[1]);
                setPrice(seniorPrice);
            }
        }
        return this.getPrice();
    }
}