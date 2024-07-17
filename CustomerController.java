package Controller;

import Model.SystemInfo;
import Model.User;
import Utilitie.Records;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
    public CustomerController() {
    }

    public ArrayList<User> deposit(SystemInfo systemInfo, Scanner scanner, User user) {
        String amount = scanner.nextLine();
        user.setBalance(user.getBalance() + Double.parseDouble(amount));
        List<User> users = new ArrayList<>();
        users = (List<User>) Records.load("user.txt");
        if (users != null) {
            for (User user1 : users) {
                if (user1.getUserName().equals(user.getUserName())) {
                    user1.setBalance(user1.getBalance() + Double.parseDouble(amount));
                }
            }
        }
        systemInfo.setUsers((ArrayList<User>) users);
        Records.save(systemInfo.getUsers(), "user.txt");
        return systemInfo.getUsers();
    }
}
