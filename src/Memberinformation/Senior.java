package Memberinformation;
//@Emilia

import FileHandler.FileManager;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Senior extends Membership{
//@Christian
    Scanner sc;
    FileManager fm = new FileManager();
    public Senior(String activity, double price) throws FileNotFoundException {
        super(activity, price);
        this.setActivity("Senior");
        this.sc = fm.getPriceSc();
    }

    public Senior() throws FileNotFoundException{}

    @Override
    public double readMembershipFeeFromFile() throws FileNotFoundException { //@Christian
//        Scanner sc = super.sc;
        while(sc.hasNextLine()){
            System.out.println("test" + sc.next());
            String currentLine = sc.nextLine();
            String[] lineAsArray = currentLine.split(";");
            if(lineAsArray[0].equals("Senior")){
                double seniorPrice = Double.parseDouble(lineAsArray[1]);
                System.out.println(seniorPrice); // slet -- tilføjet af erik
                setPrice(seniorPrice);
            }
        }
        return this.getPrice();
    }
}