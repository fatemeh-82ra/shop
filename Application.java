package Model;

import java.io.Serializable;

public class Application implements Serializable {
    String Name;
    String DeveloperName;
    String descriptions;
    int downloadNumber;
    double price;

    public Application(String name, String descriptions, double price) {
        Name = name;
        this.descriptions = descriptions;
        this.price = price;
        downloadNumber = 0;
    }

    public String getName() {
        return Name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public double getPrice() {
        return price;
    }

    public int getDownloadNumber() {
        return downloadNumber;
    }

    public void setDownloadNumber(int downloadNumber) {
        this.downloadNumber = downloadNumber;
    }

    public String getDeveloperName() {
        return DeveloperName;
    }

    public void setDeveloperName(String developerName) {
        DeveloperName = developerName;
    }
}
