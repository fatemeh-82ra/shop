package Controller;

import Model.Application;
import Model.SystemInfo;
import Model.User;
import Utilitie.Records;

import java.util.ArrayList;
import java.util.List;

public class LoadController {
    public LoadController() {
    }

    public ArrayList<User> loadUser(SystemInfo systemInfo) {
        List<User> users = new ArrayList<>();
        users = (List<User>) Records.load("user.txt");
        if (users != null) {
            systemInfo.setUsers((ArrayList<User>) users);
        }
        return systemInfo.getUsers();
    }

    public ArrayList<Application> loadAllApps(SystemInfo systemInfo) {
        List<Application> applications = new ArrayList<>();
        applications = (List<Application>) Records.load("all-apps.txt");
        if (applications != null) {
            systemInfo.setApplications((ArrayList<Application>) applications);
        }
        return systemInfo.getApplications();
    }

    public ArrayList<Application> loadUserApps(User user) {
        List<Application> apps = new ArrayList<>();
        apps = (List<Application>) Records.load("created-apps.txt");
        ArrayList<Application> applications = new ArrayList<>();
        if (apps != null) {
            for (Application app : apps) {
                if (app.getDeveloperName().equals(user.getName())) {
                    applications.add(app);
                }
            }
            user.setApplications(applications);
        }
        return user.getApplications();
    }

    public ArrayList<Application> loadDownloadApps(User user) {
        List<Application> applications = new ArrayList<>();
        applications = (List<Application>) Records.load("download-apps.txt");
        ArrayList<Application> apps = new ArrayList<>();
        if (applications != null) {
            for (Application application : user.getApplications()) {
                for (Application application1 : applications) {
                    if (application.getName().equals(application1.getName()) && application.getDeveloperName().equals(application1.getDeveloperName())) {
                        apps.add(application1);
                    }
                }
            }
            user.setApplications(apps);
        }
        return user.getApplications();
    }
}

