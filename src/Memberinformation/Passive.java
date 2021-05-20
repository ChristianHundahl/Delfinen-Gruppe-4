package Memberinformation;
//@Emilia

import FileHandler.FileManager;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Passive extends Membership{
    private FileManager fm = new FileManager();
    Scanner sc = fm.getPriceSc();

    public Passive(String activity, double price) {
        super(activity, price);
        this.setActivity("Passive");
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
