package Terminal;

import FileHandler.FileManager;
import FileHandler.MemberManager;
import Memberinformation.Member;
import UI.Menu;

import java.io.FileNotFoundException;

//@Emilia

public class Controller {
    public static void main(String[] args) throws FileNotFoundException {
        Menu menu = new Menu();
        MemberManager memberManager = new MemberManager();
        FileManager fileManager = new FileManager();

        boolean exit = false;

        while(!exit){
            //System.out.println();
            menu.showMainMenu();
            int userInput = menu.fetchUserInput();
            switch(userInput){
                case 1:
                    Member tempMember = menu.registerNewMemberMenu();
                    memberManager.addToMemberList(tempMember);
                    break;
                case 2:
                    menu.manageExistingMemberMenu();
                    break;
                case 3:
                    menu.manageSwimTimesMenu();
                    break;
                case 4:
                    boolean goBack = false;
                    while(!goBack) {
                        menu.showManageEconomicsMenu();
                        userInput = menu.fetchUserInput();
                        switch (userInput) {
                            case 1:
                                menu.comingSpring2022Menu(); //Show projected income
                                break;
                            case 2:
                                menu.showMembersInArrears();//Show members in arrears
                                break;
                            case 3:
                                menu.comingSpring2022Menu(); //Change prices
                                break;
                            case 4:
                                goBack = true;
                                break;
                            default:
                                menu.defaultMessage();
                                break;
                        }
                    }

                    break;
                case 5:
                    System.out.println("Exiting program...");
                    exit = true;
                    break;
                default:
                    menu.defaultMessage();
                    break;
            }
        }
    }
}
