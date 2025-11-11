package Week09;

public class SmartPhone extends Device implements Power, VolumeControl, Device.Connectivity {
    int currentVolume;
    String connectedNetwork;

    // Constructor
    public SmartPhone(String brand, String model) {
        super(brand, model);
        this.currentVolume = 0;
        this.connectedNetwork = "";
    }

    // Implementasi metode dari Power
    public void turnOn() {
        System.out.println("Turning on the device...");
    }

    public void turnOff() {
        System.out.println("Turning off the device...");
    }

    // Implementasi metode dari VolumeControl
    public void increaseVolume(int level) {
        currentVolume += level;
        System.out.println("Increasing volume by " + level + " levels.");
    }

    public void decreaseVolume(int level) {
        currentVolume -= level;
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        System.out.println("Decreasing volume by " + level + " levels.");
    }

    // Implementasi metode dari nested interface Connectivity
    public void connectToWiFi(String networkName) {
        connectedNetwork = networkName;
        System.out.println("Connecting to WiFi: " + networkName);
    }

    public void disconnectFromWiFi() {
        System.out.println("Disconnecting from WiFi...");
        connectedNetwork = "";
    }
}

