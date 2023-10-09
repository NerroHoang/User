
import manager.Manager;
import view.Menu;

public class Main {
    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    Manager.createNewAccount();
                    break;
                case 2:
                    Manager.loginSystem();
                    break;
                case 3:
                    return;
            }
        }
    }
}
