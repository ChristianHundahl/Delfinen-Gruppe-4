package Terminal;

import FileHandler.FileManager;
import FileHandler.MemberManager;
import Memberinformation.Member;
import Memberinformation.Membership;
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
        boolean goBack;

        while(!exit){
            menu.showMainMenu();

            int userInput = menu.fetchUserInput();
            switch(userInput){
                case 1:
                    Member tempMember = menu.registerNewMemberMenu(memberManager);
                    memberManager.addToMemberList(tempMember);
                    break;
                case 2:
                    menu.manageExistingMemberMenu();

                    if (!memberManager.isEmpty()){
                        goBack = false;
                        while(!goBack){
                            memberManager.printList(); //Add +1 to index
                            int chosenMember = menu.fetchUserInput(); //ToDO fix så man ikke kan vælge tal uden for listen

                            boolean idkAnymore = false;
                            while(!idkAnymore){
                                menu.changeOrDeleteMenu();
                                userInput = menu.fetchUserInput();
                                switch(userInput){
                                    case 1:
                                        boolean goBackToChangeDelete = false;
                                        while(!goBackToChangeDelete){
                                            menu.showChangeInformationMenu();
                                            userInput = menu.fetchUserInput();
                                            switch(userInput){
                                                case 1:
                                                    String newName = menu.changeName();
                                                    memberManager.changeMemberName(chosenMember,newName);
                                                    menu.doneGoingBack();
                                                    //goBackToChangeDelete = true;
                                                    break;
                                                case 2:
                                                    int newAge = menu.changeAge();
                                                    memberManager.changeMemberAge(chosenMember,newAge);
                                                    menu.doneGoingBack();
                                                    //goBackToChangeDelete = true;
                                                    break;
                                                case 3:
                                                    Membership newActivity = menu.changeMembership();
                                                    memberManager.changeMemberActivity(chosenMember,newActivity);
                                                    menu.doneGoingBack();
                                                    //goBackToChangeDelete = true;
                                                case 4:
                                                    goBackToChangeDelete = true;
                                                    break;
                                                default:
                                                    menu.defaultMessage();
                                                    break;
                                            }
                                        }
                                        //goBack = true;
                                        //idkAnymore = true;
                                        break;
                                    case 2:
                                        memberManager.removeMember(chosenMember);
                                        System.out.println("Member deleted. Going back to main menu.");
                                        goBack = true;
                                        idkAnymore = true;
                                        break;
                                    case 3:
                                        goBack = true;
                                        idkAnymore = true;
                                        break;
                                    default:
                                        menu.defaultMessage();
                                        break;
                                }
                            }
                        }
                    }
                    else{
                        System.out.println("Going back to main menu...");
                        goBack = true;
                        break;
                    }
                    break;
                case 3:
                    menu.manageSwimTimesMenu();
                    break;
                case 4:
                    goBack = false;
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
