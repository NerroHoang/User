
package view;

import validate.Validate;

public class Menu {
    //display menu
    public static int menu() {
        System.out.println("1. Create a new account.");
        System.out.println("2. Login system.");
        System.out.println("3. Exit.");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInputIntLimit(1, 3);
        return choice;
    }
}
