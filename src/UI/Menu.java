package UI;
//@Daniell, @Emilia

import Memberinformation.*;

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

    public void registerNewMemberMenu(){
        System.out.println("Enter full name: ");
        String tempName = in.nextLine();
        System.out.println("Enter age: ");
        int tempAge = Integer.parseInt(in.nextLine());

        Member newMember = new Member(tempName, tempAge);
        System.out.println("New member registered");

        System.out.println("Choose membership:");
        System.out.println("Press 1 for Junior membership");
        System.out.println("Press 2 for Senior membership");
        System.out.println("Press 3 for Passive membership");
        int tempAnswer = Integer.parseInt(in.nextLine());
        if (tempAnswer == 1){
            Junior tempActivity = new Junior();
            newMember.setActivity(tempActivity);
            }
        if (tempAnswer == 2){
            Senior tempActivity = new Senior();
            newMember.setActivity(tempActivity);
        }
        if (tempAnswer == 3){
            Passive tempActivity = new Passive();
            newMember.setActivity(tempActivity);
        }
        System.out.println("Registration complete.");

    }
    //ToDo
    public void manageExistingMemberMenu(){
        System.out.println("Manage members");
    }

    public void showManageSwimTimesMenu(){
        System.out.println("Coming spring 2022!");
        System.out.println("Press 1 to go back to main menu");
    }

    public void showManageEconomicsMenu(){
        System.out.println("Manage economics");
        System.out.println("Press 1 to Show projected income");
        System.out.println("Press 2 to show members in arrears");
        System.out.println("Press 3 to change prices");
        System.out.println("Press 4 to to back to main menu");
    }

    public int fetchUserInput (){
        int userInput = in.nextInt();
        return userInput;
    }

    public void showMembersInArrears(){
        System.out.println("Members in arrears: ");
    }
}

//Userinput
//mainMenu
//manageMembers
//showMembersInArrears
//changePrice