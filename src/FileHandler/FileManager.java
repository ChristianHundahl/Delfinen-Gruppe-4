package FileHandler;
//@Jonatan

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
            writer = new FileWriter("resources/Members.csv", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //readFile
    private Scanner priceSc = new Scanner(membershipPrices);

    //Empty constructor
    public FileManager() throws FileNotFoundException {
    }

    //Getter
    public Scanner getPriceSc() {
        return priceSc;
    }

    public File getMembersFile() {
        return memberInfo;
    }

    //Methods
    //addToMemberFile
    private void addToFile(Member member) throws IOException {
        writer.write(member.toString() + System.lineSeparator());
        writer.flush();
    }

    public void updateFile(ArrayList<Member> members) throws IOException {
        FileWriter writer = new FileWriter("resources/Members.csv");
        for (Member m : members) {
            addToFile(m);
        }
    }
}
