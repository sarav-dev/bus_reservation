package Bus_reservation;
import java.util.*;
// import java.util.Scanner;

public class reservationDemo {
    public static void main(String[] args) {
        ArrayList<bus> buses = new ArrayList<bus>();
        ArrayList<ticketBooking> bookings = new ArrayList<ticketBooking>();

        buses.add(new bus(1, true, 20));
        buses.add(new bus(2, false, 2));
        buses.add(new bus(3, true, 50));
        
        int userInput = 1;
        Scanner sc = new Scanner(System.in);

        for (bus b:buses) {
            b.displayBusInfo();
        }
        while (userInput == 1) {
            System.out.println("Enter 1 for Booking or 2 to exit");
            userInput = sc.nextInt();
            if (userInput == 1) {
                ticketBooking booking = new ticketBooking();
                if(booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed!");
                }
                else System.out.println("Sorry! Bus is full. Try another bus or date.");
            }
        }
        // sc.close();
    }
}
