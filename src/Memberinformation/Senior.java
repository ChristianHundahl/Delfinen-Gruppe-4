package Memberinformation;
//@Emilia
import FileHandler.FileManager;
import java.io.FileNotFoundException;

public class Senior extends Membership{
//@Christian
    public Senior(String activity, double price) throws FileNotFoundException {
        super(activity, price);
        this.setActivity("Senior");
    }

    public Senior() throws FileNotFoundException{}

    @Override
    public double readMembershipFeeFromFile() throws FileNotFoundException { //@Christian
        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            String[] lineAsArray = currentLine.split(";");
            if(lineAsArray[0].equals("Senior")){
                double seniorPrice = Double.parseDouble(lineAsArray[1]);
                setPrice(seniorPrice);
            }
        }
        return this.getPrice();
    }
}