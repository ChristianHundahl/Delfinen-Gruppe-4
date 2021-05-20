package FileHandler;
//@Christian

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    private static File memberInfo = new File("");
    private static File membershipPrices = new File("resources/MembershipFeePrices");
    private Scanner priceSc = new Scanner(membershipPrices);

    public FileManager() throws FileNotFoundException {}
    //Methods
    //readFile


    public int findJunior() throws FileNotFoundException {
        while(priceSc.hasNextLine()){
            String currentLine = priceSc.nextLine();
            String[] lineAsArray = currentLine.split(";");
            if(lineAsArray[0].equals("Junior")){
                int juniorPrice = Integer.parseInt(lineAsArray[1]);
                return juniorPrice;
            }
        }
        return 0;
    }












    /*
    //Maybe needs to take a member in as parameter?
    public boolean isUserAlreadyInFile()throws FileNotFoundException{
        Scanner fileSc = new Scanner(memberInfo);
        while(fileSc.hasNextLine()){
            String checkForMember = fileSc.nextLine();
            String[] checkForMemberAsArray = checkForMember.split(" ");
            if(!checkForMemberAsArray[0].equals()){
                return true;
            }
            //Creat an exception for if the user is already in the system
        }
    }

     */

    //addToMemberFile
    //Maybe needs to take a member in as parameter?
    public void addToFile() throws IOException {
        FileWriter writer = new FileWriter(memberInfo);
    }
    //addToMemberlistFromArraylist
    //createListOfMembersInArrears
}
