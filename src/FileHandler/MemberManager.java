package FileHandler;
//@Christian
import Memberinformation.Member;

import java.io.FileNotFoundException;
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
            fileManager.isUserAlreadyInFile(m);
            memberlist.add(m);
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
    //updateMemberFile
    public void updateMemberFile(){

    }

    public void removeMember(int x ,Member memberToRemove){
        memberlist.remove(x);
        fileManager.removeMemberFromFile(memberToRemove);
    }
}
