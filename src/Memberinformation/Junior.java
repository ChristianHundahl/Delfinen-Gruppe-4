package Memberinformation;
//@Emilia
import FileHandler.FileManager;
import java.io.FileNotFoundException;

public class Junior extends Membership{

    public Junior(String activity, double price) throws FileNotFoundException {
        super(activity, price);
        this.setActivity("Junior");
    }

    public Junior(){}

    @Override
    public double readMembershipFeeFromFile() throws FileNotFoundException { //@Jonatan
        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            String[] lineAsArray = currentLine.split(";");
                if(lineAsArray[0].equals("Junior")){
                    double juniorPrice = Double.parseDouble(lineAsArray[1]);
                    return juniorPrice;
                }
            break;
            }
        return 0;
    }
}