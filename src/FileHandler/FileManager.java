package FileHandler;
//@Christian

import Memberinformation.Member;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    private static File memberInfo = new File("resources/Members.csv");
    private static File membershipPrices = new File("resources/MembershipFeePrices.csv");
    private static FileWriter writer;

    static {
        try {
            writer = new FileWriter("resources/Members.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //readFile
    private Scanner memberSc = new Scanner(memberInfo);
    private Scanner priceSc = new Scanner(membershipPrices);

    //Empty constructor
    public FileManager() throws FileNotFoundException {}
    //Getter
    public Scanner getPriceSc(){
        return priceSc;
    }

    //Methods
    //Maybe needs to take a member in as parameter?
    public boolean isUserAlreadyInFile(Member member)throws FileNotFoundException{
       if(memberSc.hasNextLine()) {
           while (memberSc.hasNextLine()) {
               String currentLine = memberSc.nextLine();
               String[] clAsArray = currentLine.split(";");
               if (!clAsArray[0].equals(member.getName())) {
                   return true;
               }
           }
           //Creat an exception for if the user is already in the system
           throw new UserAlreadyExistsException();
       }
       return true;
    }

    //addToMemberFile
    //Maybe needs to take a member in as parameter?
    public void addToFile(Member member) throws IOException {
        isUserAlreadyInFile(member);
        if(isUserAlreadyInFile(member)){
            writer.write(member.toString()+System.lineSeparator());
            writer.flush();
        }
    }

    public void removeMemberFromFile(Member member){
        try {
            File inFile = new File(String.valueOf(memberInfo));
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

            FileWriter fw = new FileWriter("resources/TempMembers");

            BufferedReader br = new BufferedReader(new FileReader(memberInfo));
            BufferedWriter bwriter = new BufferedWriter(fw);

            String lineToRemove = member.toString();
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                if (currentLine.equals(lineToRemove)) {
                    bwriter.write(currentLine);
                    bwriter.flush();
                }
            }
            br.close();
            bwriter.close();
            if (!inFile.delete()) {
                System.out.println("File could not be deleted");
                return;
            }
            if (!tempFile.renameTo(inFile)) {
                System.out.println("File could not be renamed");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //addToMemberlistFromArraylist
}
