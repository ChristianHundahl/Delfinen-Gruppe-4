package UI;
//@Daniell, @Emilia

import java.util.Scanner;

public class Menu {
    private Scanner in = new Scanner(System.in);

    public void showMainMenu(){
        System.out.println("DolphinExpress - Svømmehallen Delfinen");
        System.out.println("Press 1 to Register new member");
        System.out.println("Press 2 to Manage an existing member");
        System.out.println("Press 3 to Manage economics");
        System.out.println("Press 4 to exit");
    }

    public int fetchUserInput (){
        int userInput = in.nextInt();
        return userInput;
    }
}

//Userinput
//mainMenu
//manageMembers
//showMembersInArrears
//changePrice