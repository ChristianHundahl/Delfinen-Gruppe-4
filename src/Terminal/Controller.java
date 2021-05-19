package Terminal;

import UI.Menu;

//@Emilia

public class Controller {
    public static void main(String[] args) {
        Menu menu = new Menu();

        boolean exit = false;

        while(!exit){
            menu.showMainMenu();
            int userInput = menu.fetchUserInput();
            switch(userInput){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    menu.showManageSwimTimesMenu();
                    break;
                case 4:
                    menu.showManageEconomicsMenu();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    exit = true;
                    break;
            }
        }
    }

}
