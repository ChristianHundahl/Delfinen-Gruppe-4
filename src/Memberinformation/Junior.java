package Memberinformation;
//@Emilia
import FileHandler.FileManager;
import java.io.FileNotFoundException;

public class Junior extends Membership{

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
                    return setPrice(juniorPrice);
                }
            break;
            }
        return 0;
    }
}