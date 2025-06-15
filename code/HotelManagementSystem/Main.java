import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Sunrise Hotel", "Dhaka");
        Room room1 = new Room(101, "Single");
        Customer customer = new Customer("Rahim", "017xxxxxxxx");

        Reservation reservation = new Reservation(customer, room1, new Date(), new Date());

        System.out.println("Hotel: " + hotel.getName() + " at " + hotel.getLocation());
        System.out.println("Customer: " + reservation.getCustomer().getName());
        System.out.println("Room Number: " + reservation.getRoom().getRoomNumber());
        System.out.println("Room Type: " + reservation.getRoom().getType());
        System.out.println("Check-in Date: " + reservation.getCheckInDate());
    }
}