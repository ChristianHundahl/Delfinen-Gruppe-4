package FileHandler;
//@Christian
import Memberinformation.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class MemberManager {
    private FileManager fileManager = new FileManager();
    private static ArrayList<Member> memberlist = new ArrayList();

    public MemberManager()throws FileNotFoundException{
        loadMembersFromFile();
    }

    //Methods
    //addToMemberList
    public void addToMemberList(Member m) {
        if(memberExists(m))
            return;
        try {
            memberlist.add(m);
            fileManager.addToFile(m);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean memberExists(Member m){
        for(Member member : memberlist){
            if(member.compareTo(m)){
                return true;
            }
        }
        return false;
    }
    private void loadMembersFromFile(){
        ArrayList<Member> members = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileManager.getMembersFile()));
            String line;
            while((line=reader.readLine())!=null){
                String[] memberStrings = line.split(";");
                Member member = new Member();
                member.setName(memberStrings[0]);
                member.setAge(Integer.parseInt(memberStrings[1]));
                if(memberStrings[2].equals("Junior"))
                    member.setActivity(new Junior());
                else if(memberStrings[2].equals("Senior"))
                    member.setActivity(new Senior());
                else if(memberStrings[2].equals("Passive"))
                    member.setActivity(new Passive());
                else break;
                members.add(member);
            }
            memberlist = members;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printList() {
        int i = 0;
        if(memberlist.size() == 0)
            System.out.println("No members found");
        for (Member member : memberlist) {
            System.out.println(i + ": " + member);
            i++;
        }
    }
    public boolean isEmpty(){
        return memberlist.size() == 0;
    }

    public void removeMember(int x) throws IOException {
        if (!(x < memberlist.size()))
            return;
        memberlist.remove(x);
        fileManager.removeMemberFromFile(memberlist);
    }
}
