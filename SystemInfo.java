package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class SystemInfo implements Serializable {

    private ArrayList<User> users;
    private ArrayList<Application> applications;

    public SystemInfo() {
        users = new ArrayList<>();
        applications = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public ArrayList<Application> getApplications() {
        return applications;
    }

    public void addApplication(Application application) {
        applications.add(application);
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void setApplications(ArrayList<Application> applications) {
        this.applications = applications;
    }
}
