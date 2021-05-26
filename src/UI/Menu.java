package UI;
//@Emilia

import FileHandler.MemberManager;
import Memberinformation.*;
import FileHandler.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
    private Scanner in = new Scanner(System.in);

    public void showMainMenu(){
        System.out.println("DolphinExpress - Svømmehallen Delfinen");
        System.out.println("Press 1 to Register new member");
        System.out.println("Press 2 to Manage an existing member");
        System.out.println("Press 3 to Manage swim times");
        System.out.println("Press 4 to Manage economics");
        System.out.println("Press 5 to exit");
    }

    public Member registerNewMemberMenu(MemberManager mm) throws FileNotFoundException{
        String tempName = "";
        int tempAge = 0;
        Membership newMembership = null;
        String activity = "";

        boolean isConfirmed = false;
        Member member = new Member();

        while(!isConfirmed){
            System.out.println("Enter full name: ");
            tempName = in.nextLine();
            if (tempName.equals("")){
                System.out.println("No input. Try again.");
                continue;
            }

            System.out.println("Enter age: ");
            tempAge = fetchUserInput();

            System.out.println("Choose membership:"); //Automate senior/junior???
            System.out.println("Press 1 for Junior membership");
            System.out.println("Press 2 for Senior membership");
            System.out.println("Press 3 for Passive membership");

            boolean membershipChosen = false;
            while (!membershipChosen){
                int tempAnswer = fetchUserInput();

                switch(tempAnswer){
                    case 1 -> {
                        newMembership = new Junior();
                        activity = "Junior Membership";
                        membershipChosen = true;
                    }
                    case 2 -> {
                        newMembership = new Senior();
                        activity = "Senior Membership";
                        membershipChosen = true;
                    }
                    case 3 -> {
                        newMembership = new Passive();
                        activity = "Passive membership";
                        membershipChosen = true;
                    }
                    default -> defaultMessage();
                }
            }

            System.out.println("New member:");
            System.out.println("Name: " + tempName);
            System.out.println("Age: " + tempAge);
            System.out.println(activity);

            member.setName(tempName);
            member.setAge(tempAge);
            member.setActivity(newMembership);

            if (mm.memberExists(member)){
                System.out.println("Member already exists please reenter information");
            }else {
                System.out.println();
                System.out.println("Press 1 to confirm");
                System.out.println("Press 2 to reenter information");
                //ToDo What does the default do?
                int tempAnswer2 = fetchUserInput();
                switch (tempAnswer2) {
                    case 1:
                        isConfirmed = true;
                        break;
                    case 2:
                        continue;
                    default:
                        defaultMessage();
                }
            }

        }
        System.out.println("Registration complete.");

        boolean goBack = false;
        System.out.println("Press 1 to return to main menu");
        while (!goBack){
            int answer = fetchUserInput();
            if (answer == 1){
                goBack = true;
            }
        }
        return member;
    }

    //ToDo
    public void manageExistingMemberMenu(){
        System.out.println("Manage members");
    }

    public void manageSwimTimesMenu(){
        System.out.println("Coming spring 2022!");
        System.out.println("Press 1 to go back to main menu");
        press1();
    }

    public void comingSpring2022Menu(){
        System.out.println("Coming spring 2022!");
        System.out.println("Press 1 to go back");
        press1();
    }

    public void press1(){ //Kinda awkward when a non-integer is entered
        int userInput = fetchUserInput();
        while (userInput != 1){
            userInput = fetchUserInput();
        }
    }

    public void showManageEconomicsMenu(){
        System.out.println("Manage economics");
        System.out.println("Press 1 to show projected income");
        System.out.println("Press 2 to show members in arrears");
        System.out.println("Press 3 to change prices");
        System.out.println("Press 4 to to back to main menu");
    }

    public int fetchUserInput (){
        int userInput;

        while (true){
            String input = in.nextLine();
            try{
                userInput = Integer.parseInt(input);
                return userInput;
            }
            catch (Exception e){
                defaultMessage();
            }
        }
    }

    public void defaultMessage(){
        System.out.println("Invalid input. Try again:");
    }

    //????
    public void showMembersInArrears(){
        System.out.println("Members in arrears: ");
        System.out.println("And this is where I'd run my showMembersInArrears method...");
        System.out.println("If I had any!!!              ...Dinklebeeeeeerg..!");
        System.out.println("Press 1 to go back");
        press1();
    }
}

