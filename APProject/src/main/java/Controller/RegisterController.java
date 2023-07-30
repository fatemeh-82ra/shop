package Controller;

import Model.SystemInfo;
import Model.User;
import Utilitie.Records;


public class RegisterController {


    public RegisterController() {
    }

    public User signup(SystemInfo systemInfo, int which, String name, String username, String password) {
        User user;
        if (which == 1) {
            user = new User(name, username, password, false);
            systemInfo.addUser(user);
            Records.save(systemInfo.getUsers(), "user.txt");
        } else {
            user = new User(name, username, password, true);
            systemInfo.addUser(user);
            Records.save(systemInfo.getUsers(), "user.txt");
        }
        return user;
    }

    public boolean matchPassword(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])+(?=.*[A-Z])([0-9]*[a-zA-Z]){5,}[0-9]*");
    }

    public boolean isUserNameExist(SystemInfo systeminfo, String username) {
        for (User user : systeminfo.getUsers()) {
            if (user.getUserName().equals(username)) return true;
        }
        return false;
    }

    public boolean isPasswordCorrect(SystemInfo systemInfo, String username, String password) {
        for (User user : systemInfo.getUsers()) {
            if (user.getUserName().equals(username))
                if (user.getPassword().equals(password)) return true;
        }
        return false;
    }

    public boolean isUserNameUnique(SystemInfo systemInfo, String userName) {
        for (User user : systemInfo.getUsers()) {
            if (user.getUserName().equals(userName)) {
                return true;
            }
        }
        return false;
    }
}
