package Memberinformation;
//@Emilia

import java.io.FileNotFoundException;

public class Junior extends Membership{
//@Christian
    public Junior(String activity, double price) throws FileNotFoundException {
        super(activity, price);
        this.setActivity("Junior");
    }

    public Junior() throws FileNotFoundException{}

    @Override
    public double readMembershipFeeFromFile() throws FileNotFoundException { //@Christian
        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            String[] lineAsArray = currentLine.split(";");
                if(lineAsArray[0].equals("Junior")){
                    double juniorPrice = Double.parseDouble(lineAsArray[1]);
                    setPrice(juniorPrice);
                }
            }
        return this.getPrice();
    }

}