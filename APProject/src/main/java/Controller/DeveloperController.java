package Controller;

import Model.SystemInfo;
import Model.User;
import Utilitie.Records;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeveloperController {
    public DeveloperController() {
    }

    public ArrayList<User> setAccountNumber(SystemInfo systemInfo, User user, Scanner scanner) {
        String accountNumber = scanner.nextLine();
        user.setAccountNumber(accountNumber);
        List<User> users = new ArrayList<>();
        users = (List<User>) Records.load("user.txt");
        if (users != null) {
            for (User user1 : users) {
                if (user1.getUserName().equals(user.getUserName())) {
                    user1.setAccountNumber(accountNumber);
                }
            }
        }
        systemInfo.setUsers((ArrayList<User>) users);
        Records.save(systemInfo.getUsers(), "user.txt");
        return systemInfo.getUsers();
    }
}
