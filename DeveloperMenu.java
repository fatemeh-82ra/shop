package View;

import Controller.DeveloperController;
import Controller.LoadController;
import Model.SystemInfo;
import Model.User;

import java.util.Scanner;

public class DeveloperMenu {
    DeveloperController developerController = new DeveloperController();
    ApplicationMenu applicationMenu = new ApplicationMenu();
    LoadController loadController = new LoadController();

    public DeveloperMenu() {
    }

    public boolean run(SystemInfo systemInfo, Scanner scanner, User user) {
        user.setApplications(loadController.loadUserApps(user));
        String input = scanner.nextLine();
        switch (input) {
            case "logout":
                return true;
            case "account":
                systemInfo.setUsers(developerController.setAccountNumber(systemInfo, user, scanner));
                return false;
            case "apps":
                user.setApplications(loadController.loadUserApps(user));
                applicationMenu.run(2, user, scanner, systemInfo);
                return false;
            default:
                System.out.println("Invalid command!");
                return false;
        }
    }
}
