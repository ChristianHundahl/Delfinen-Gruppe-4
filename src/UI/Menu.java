package UI;
//@Emilia

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

    //ToDO Should it return member instead?? Then controller adds member to file
    public Member registerNewMemberMenu() throws FileNotFoundException{
        //System.out.println("Enter full name: ");
        //String tempName = in.nextLine();
        //in.nextLine();
        //System.out.println("Enter age: ");
        //int tempAge = Integer.parseInt(in.nextLine());

        String tempName = "";
        int tempAge = 0;
        Membership newMembership = null;

        boolean isConfirmed = false;
        while(!isConfirmed){
            System.out.println("Enter full name: ");
            //in.nextLine();
            tempName = in.nextLine(); //ToDO exceptions? no empty strings


            System.out.println("Enter age: ");
            tempAge = fetchUserInput();

            System.out.println("Choose membership:"); //Automate senior/junior???
            System.out.println("Press 1 for Junior membership");
            System.out.println("Press 2 for Senior membership");
            System.out.println("Press 3 for Passive membership");
            //in.nextLine();
            int tempAnswer = fetchUserInput();

            String activity = "";

            switch(tempAnswer){
                case 1 -> {
                    newMembership = new Junior();
                    activity = "Junior Membership";
                }
                case 2 -> {
                    newMembership = new Senior();
                    activity = "Senior Membership";
                }
                case 3 -> {
                    newMembership = new Passive();
                    activity = "Passive membership";
                }
            }

            System.out.println("New member:");
            System.out.println("Name: " + tempName);
            System.out.println("Age: " + tempAge);
            System.out.println(activity);

            System.out.println("Press 1 to confirm");
            System.out.println("Press 2 to reenter information");

            int tempAnswer2 = fetchUserInput();

            switch (tempAnswer2){
                case 1:
                    //Member newMember = new Member(tempName, tempAge);
                    //newMember.setActivity(newMembership);
                    isConfirmed = true;
                    break;
                case 2:
                    continue;
            }

            /*
            if (tempAnswer2 == 1){
                Member newMember = new Member(tempName, tempAge);
                newMember.setActivity(newMembership);
                isConfirmed = true;
            }
            if (tempAnswer2 == 2){
                continue;
            }

             */
        }
        Member newMember = new Member(tempName, tempAge);
        newMember.setActivity(newMembership);
        System.out.println("Registration complete.");

        /*System.out.println("Choose membership:");
        System.out.println("Press 1 for Junior membership");
        System.out.println("Press 2 for Senior membership");
        System.out.println("Press 3 for Passive membership");
        in.nextLine();
        int tempAnswer = Integer.parseInt(in.nextLine());

        Membership newMembership = null;

        switch(tempAnswer){
            case 1 -> newMembership = new Junior();
            case 2 -> newMembership = new Senior();
            case 3 -> newMembership = new Passive();
        }

         */


        boolean goBack = false;
        System.out.println("Press 1 to return to main menu");
        while (!goBack){
            int answer = fetchUserInput();
            if (answer == 1){
                goBack = true;
            }
        }


        /*

        try{
            switch(tempAnswer){
                case 1 -> newMembership = new Junior();
                case 2 -> newMembership = new Senior();
                case 3 -> newMembership = new Passive();
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not find file");
            //Hvad skal der ske
        }

        /*if (tempAnswer == 1){
            Junior tempActivity = null;

            try{
                tempActivity = new Junior();
            }
            catch(FileNotFoundException e){
                System.out.println("Cannot find file - terminating the program");
            }
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
        System.out.println("Registration complete.");*

        */
        return newMember;
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
        //TODO Make exception for non-ints, mismatchexception
        int userInput;

        while (true){
            String input = in.nextLine();
            try{
                userInput = Integer.parseInt(input);
                return userInput;
            }
            catch (Exception e){
                System.out.println("Invalid Input. Try again: "); //TOdo CHange this!!
                continue;
            }
        }
    }

    //@Daniell
    public void showMembersInArrears(){
        System.out.println("Members in arrears: ");
    }
}

//showMembersInArrears
//changePrice