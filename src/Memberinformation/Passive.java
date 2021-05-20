package Memberinformation;
//@Emilia
import FileHandler.FileManager;
import java.io.FileNotFoundException;

public class Passive extends Membership{
//@Christian
    public Passive(String activity, double price, FileManager fm) throws FileNotFoundException {
        super(activity, price, fm);
        this.setActivity("Passive");
    }

    @Override
    public double readMembershipFeeFromFile() throws FileNotFoundException { //@Jonatan
        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            String[] lineAsArray = currentLine.split(";");
            if(lineAsArray[0].equals("Passive")){
                double passivePrice = Double.parseDouble(lineAsArray[1]);
                return passivePrice;
            }
            break;
        }
        return 0;
    }
}
