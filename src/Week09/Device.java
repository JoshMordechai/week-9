package Week09;

public class Device {
    String brand;
    String model;

    // Constructor
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Method untuk menampilkan info
    public void displayInfo() {
        System.out.println("Device Info: Brand: " + brand + ", Model: " + model);
    }

    // Nested interface Connectivity
    public interface Connectivity {
        void connectToWiFi(String networkName);
        void disconnectFromWiFi();
    }
}

