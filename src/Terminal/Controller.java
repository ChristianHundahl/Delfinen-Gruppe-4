package Terminal;

import UI.Menu;

public class Controller {
    public static void main(String[] args) {
        Menu menu = new Menu();

        boolean exit = false;

        while(exit == false){
            int userInput = menu.fetchUserInput();
            switch(userInput){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                case 3:
                    System.out.println("3");
                case 4:
                    System.out.println("Exiting program...");
                    exit = true;
                    break;
            }
        }
    }

}
