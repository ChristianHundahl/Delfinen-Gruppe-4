package FileHandler;
//@Christian

import Memberinformation.Member;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    private static File memberInfo = new File("resources/Members");
    private static File membershipPrices = new File("resources/MembershipFeePrices");

    //readFile
    private Scanner memberSc = new Scanner(memberInfo);
    private Scanner priceSc = new Scanner(membershipPrices);

    //Empty constructor
    public FileManager() throws FileNotFoundException {}
    //Getter
    public Scanner getPriceSc() { return priceSc;}

    //Methods
    //Maybe needs to take a member in as parameter?
    public boolean isUserAlreadyInFile(Member member)throws FileNotFoundException{
        while(memberSc.hasNextLine()){
            String currentLine = memberSc.nextLine();
            String[] clAsArray= currentLine.split(";");
            if(clAsArray[0].equals(member.getName())){
                return true;
            }
        }
        //Creat an exception for if the user is already in the system
        throw new UserAlreadyExistsException();
    }

    //addToMemberFile
    //Maybe needs to take a member in as parameter?
    public void addToFile(ArrayList list) throws IOException {
        FileWriter writer = new FileWriter(memberInfo);

    }
    //addToMemberlistFromArraylist
    //createListOfMembersInArrears
}
