import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Vehicle {
    private String vehicleId;
    private String type; // e.g., Car, Bus, Truck

    public Vehicle(String vehicleId, String type) {
        this.vehicleId = vehicleId;
        this.type = type;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Type: " + type;
    }
}

class Driver {
    private String driverId;
    private String name;
    private Vehicle assignedVehicle;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

    public String getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.assignedVehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Driver ID: " + driverId + ", Name: " + name + ", Assigned Vehicle: " + (assignedVehicle != null ? assignedVehicle : "None");
    }
}

public class TransportSystem {
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void assignDriverToVehicle(String driverId, String vehicleId) {
        Vehicle vehicle = null;
        for (Vehicle v : vehicles) {
            if (v.getVehicleId().equals(vehicleId)) {
                vehicle = v;
                break;
            }
        }

        if (vehicle == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        for (Driver d : drivers) {
            if (d.getDriverId().equals(driverId)) {
                d.assignVehicle(vehicle);
                System.out.println("Driver " + d.getName() + " assigned to vehicle " + vehicle.getVehicleId());
                return;
            }
        }

        System.out.println("Driver not found.");
    }

    public void displayVehicles() {
        System.out.println("Vehicles:");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    public void displayDrivers() {
        System.out.println("Drivers:");
        for (Driver d : drivers) {
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransportSystem ts = new TransportSystem();

        while (true) {
            System.out.println("1. Add Vehicle");
            System.out.println("2. Add Driver");
            System.out.println("3. Assign Driver to Vehicle");
            System.out.println("4. Display Vehicles");
            System.out.println("5. Display Drivers");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Vehicle ID:");
                    String vehicleId = scanner.nextLine();
                    System.out.println("Enter Vehicle Type:");
                    String type = scanner.nextLine();
                    ts.addVehicle(new Vehicle(vehicleId, type));
                    break;

                case 2:
                    System.out.println("Enter Driver ID:");
                    String driverId = scanner.nextLine();
                    System.out.println("Enter Driver Name:");
                    String name = scanner.nextLine();
                    ts.addDriver(new Driver(driverId, name));
                    break;

                case 3:
                    System.out.println("Enter Driver ID:");
                    driverId = scanner.nextLine();
                    System.out.println("Enter Vehicle ID:");
                    vehicleId = scanner.nextLine();
                    ts.assignDriverToVehicle(driverId, vehicleId);
                    break;

                case 4:
                    ts.displayVehicles();
                    break;

                case 5:
                    ts.displayDrivers();
                    break;

                case 0:
                    scanner.close();
                    return; // Exit to main menu

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


