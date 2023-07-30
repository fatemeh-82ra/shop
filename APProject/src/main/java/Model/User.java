package Model;

import java.io.Serializable;
import java.util.ArrayList;


public class User implements Serializable {

    /**
     * 
     */

    private final String name;
    private final String userName;
    private final String password;
    private ArrayList<Application> applications;
    private double balance;
    private String accountNumber;
    boolean isDeveloper;

    public User(String name, String userName, String password, boolean isDeveloper) {
        applications = new ArrayList<>();
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.isDeveloper = isDeveloper;
        accountNumber = "0";
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
         return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Application> getApplications() {
        return applications;
    }

    public void addApplication(Application application) {
        applications.add(application);
    }

    public void setApplications(ArrayList<Application> applications) {
        this.applications = applications;
    }
}
