package FileHandler;
//@Christian

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemberFileManager {
    private static File memberInfo = new File("memberFile");

    //Methods
    //readFile
    public void fileReader() throws FileNotFoundException {
        Scanner input = new Scanner(memberInfo);
    } // maybe not needed

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

    //addToMemberFile
    //Maybe needs to take a member in as parameter?
    public void addToFile() throws IOException {
        FileWriter writer = new FileWriter(memberInfo);
    }
    //addToMemberlistFromArraylist
    //createListOfMembersInArrears
}
