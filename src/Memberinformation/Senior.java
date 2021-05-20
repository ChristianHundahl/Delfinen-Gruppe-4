package Memberinformation;
//@Emilia
import FileHandler.FileManager;
import java.io.FileNotFoundException;

public class Senior extends Membership{
//@Christian
    public Senior(String activity, double price, FileManager fm) throws FileNotFoundException {
        super(activity, price, fm);
        this.setActivity("Senior");
    }
    @Override
    public double readMembershipFeeFromFile() throws FileNotFoundException {
        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            String[] lineAsArray = currentLine.split(";");
            if(lineAsArray[0].equals("Senior")){
                int juniorPrice = Integer.parseInt(lineAsArray[1]);
                return juniorPrice;
            }
            break;
        }
        return 0;
    }
}