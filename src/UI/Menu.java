package UI;
//@Daniell, @Emilia

import java.util.Scanner;

public class Menu {
    private Scanner in = new Scanner(System.in);

    public void showMainMenu(){
        System.out.println("DolphinExpress");
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