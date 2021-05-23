package Terminal;

import Memberinformation.Member;
import UI.Menu;

import java.io.FileNotFoundException;

//@Emilia

public class Controller {
    public static void main(String[] args) throws FileNotFoundException {
        Menu menu = new Menu();

        boolean exit = false;

        while(!exit){
            System.out.println();
            menu.showMainMenu();
            int userInput = menu.fetchUserInput();
            switch(userInput){
                case 1:
                    Member member = menu.registerNewMemberMenu();
                    break;
                case 2:
                    menu.manageExistingMemberMenu();
                    break;
                case 3:
                    menu.showManageSwimTimesMenu();
                    while (userInput != 1){
                        userInput = menu.fetchUserInput();
                    }
                    break;
                case 4:
                    boolean goBack = false;
                    while(!goBack) {
                        menu.showManageEconomicsMenu();
                        userInput = menu.fetchUserInput();
                        switch (userInput) {
                            case 1:
                                //Show projected income
                            case 2:
                                //Show members in arrears
                            case 3:
                                //Change prices
                            case 4:
                                goBack = true;
                                break;
                        }
                    }

                    break;
                case 5:
                    System.out.println("Exiting program...");
                    exit = true;
                    break;
            }
        }
    }
}
