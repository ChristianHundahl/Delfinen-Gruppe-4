package Terminal;

import FileHandler.FileManager;
import FileHandler.MemberManager;
import Memberinformation.Member;
import UI.Menu;

import java.io.FileNotFoundException;
import java.io.IOException;

//@Emilia

public class Controller {
    public static void main(String[] args) throws IOException {
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
                    Member tempMember = menu.registerNewMemberMenu(memberManager);
                    memberManager.addToMemberList(tempMember);
                    break;
                case 2:
                    menu.manageExistingMemberMenu();
                    memberManager.printList();
                    //TODO valg?
                    if(!memberManager.isEmpty())
                        memberManager.removeMember(menu.fetchUserInput());
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
