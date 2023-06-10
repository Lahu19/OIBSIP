import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ReservationSystem {
    private Map<String, Boolean> reservations;

    public ReservationSystem() {
        reservations = new HashMap<>();
    }

    public void makeReservation(String name) {
        if (reservations.containsKey(name)) {
            System.out.println("Sorry, the reservation is already taken.");
        } else {
            reservations.put(name, true);
            System.out.println("Reservation for " + name + " is successful.");
        }
    }

    public void cancelReservation(String name) {
        if (reservations.containsKey(name)) {
            reservations.remove(name);
            System.out.println("Reservation for " + name + " is cancelled.");
        } else {
            System.out.println("Reservation not found for " + name + ".");
        }
    }
    
    public void displayReservations() {
    System.out.println("Current reservations:");
    if (reservations.isEmpty()) {
        System.out.println("No reservations found.");
    } else {
        System.out.printf("%-20s %s%n", "Name", "Status");
        for (Map.Entry<String, Boolean> entry : reservations.entrySet()) {
            String name = entry.getKey();
            boolean status = entry.getValue();
            String reservationStatus = status ? "Reserved" : "Cancelled";
            System.out.printf("%-20s %s%n", name, reservationStatus);
        }
    }
}


    // public void displayReservations() {
    //     System.out.println("Current reservations:");
    //     for (String name : reservations.keySet()) {
    //         System.out.println(name);
    //     }
    // }
}

public class Reservation {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("1. Make a reservation");
            System.out.println("2. Cancel a reservation");
            System.out.println("3. Display current reservations");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.next();
                    reservationSystem.makeReservation(name);
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String cancelName = sc.next();
                    reservationSystem.cancelReservation(cancelName);
                    break;
                case 3:
                    reservationSystem.displayReservations();
                    break;
                case 4:
                    System.out.println("Exiting the reservation system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }
}
