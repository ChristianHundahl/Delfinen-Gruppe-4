package Memberinformation;
//@Emilia
import FileHandler.FileManager;
import java.io.FileNotFoundException;

public class Passive extends Membership{
//@Christian
    public Passive(String activity, double price) throws FileNotFoundException {
        super(activity, price);
        this.setActivity("Passive");
    }

    public Passive() throws FileNotFoundException{}

    @Override
    public double readMembershipFeeFromFile() throws FileNotFoundException { //@Christian
        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            String[] lineAsArray = currentLine.split(";");
            if(lineAsArray[0].equals("Passive")){
                double passivePrice = Double.parseDouble(lineAsArray[1]);
                return setPrice(passivePrice);
            }
            break;
        }
        return 0;
    }
}
