package Memberinformation;
//@Emilia
import FileHandler.FileManager;
import java.io.FileNotFoundException;

public class Junior extends Membership{

    public Junior(String activity, double price, FileManager fm) throws FileNotFoundException {
        super(activity, price, fm);
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
            break;
            }
        return 0;
    }
}