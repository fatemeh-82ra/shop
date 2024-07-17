package Controller;

import Model.Application;
import Model.SystemInfo;
import Model.User;

import java.util.ArrayList;
import java.util.Comparator;

public class ApplicationController {


    public ApplicationController() {
    }

    public ArrayList<Application> allApplications(ArrayList<Application> applications) {
        applications.sort(new Sort());
        return applications;
    }

    public ArrayList<Application> downloadApplications(ArrayList<Application> applications) {
        applications.sort(new Sort());
        return applications;
    }

    public ArrayList<Application> developerApplications(ArrayList<Application> applications) {
        applications.sort(new Sort());
        return applications;
    }

    public ArrayList<User> setUser(SystemInfo systemInfo, User user) {
        for (User systemInfoUser : systemInfo.getUsers()) {
            if (systemInfoUser.getUserName().equals(user.getUserName())) {
                systemInfoUser.setBalance(user.getBalance());
                systemInfoUser.setApplications(user.getApplications());
            }
        }
        return systemInfo.getUsers();
    }

    static class Sort implements Comparator<Application> {
        public int compare(Application application1, Application application2) {
            return application1.getName().compareTo(application2.getName());
        }
    }
}

