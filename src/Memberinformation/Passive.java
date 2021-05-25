package Memberinformation;
//@Emilia

import java.io.FileNotFoundException;

public class Passive extends Membership{
//@Christian
    public Passive(String activity, double price) throws FileNotFoundException {
        super(activity, price);
        this.setActivity("Passive");
    }

    public Passive() throws FileNotFoundException{
        readMembershipFeeFromFile();
        this.setActivity("Passive");
    }

    @Override
    public double readMembershipFeeFromFile() throws FileNotFoundException { //@Christian
        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            String[] lineAsArray = currentLine.split(";");
            if(lineAsArray[0].equals("Passive")){
                double passivePrice = Double.parseDouble(lineAsArray[1]);
                setPrice(passivePrice);
            }
        }
        return this.getPrice();
    }
}