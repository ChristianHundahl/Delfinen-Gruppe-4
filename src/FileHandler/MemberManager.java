package FileHandler;
//@Christian
import Memberinformation.Member;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class MemberManager {
    private FileManager fileManager = new FileManager();
    private static ArrayList<Member> memberlist = new ArrayList();

    public MemberManager()throws FileNotFoundException{}

    //Methods
    //addToMemberList
    public void addToMemberList(Member m){
        try {
            if(fileManager.isUserAlreadyInFile(m)) {
                memberlist.add(m);
                fileManager.addToFile(m);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //updateMemberFile
    public void updateMemberFile(){

    }
    public void printList(){
        System.out.println(memberlist);
    }


    public void removeMember(int x ,Member memberToRemove){
        memberlist.remove(x);
        fileManager.removeMemberFromFile(memberToRemove);
    }
}
