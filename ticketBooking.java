package Bus_reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ticketBooking {
    String passName;
    int busNo;
    Date date;
    
    ticketBooking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter passenger name: ");
        passName = sc.next();
        System.out.println("Enter bus no: ");
        busNo = sc.nextInt();
        System.out.println("Enter date in dd-mm-yyyy: ");
        String dateInp = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try { 
            date  = dateFormat.parse(dateInp);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // sc.close();
    }

    public boolean isAvailable (ArrayList<ticketBooking> bookings, ArrayList<bus> buses) {
        int capacity = 0;
        for (bus Bus:buses) {
            if (Bus.getbusno() == busNo) {
                capacity = Bus.getCapacity();
            }
        }

        int booked = 0;
        for (ticketBooking tb:bookings) {
            if (tb.busNo == busNo && tb.date.equals(date)) {
                booked++;
            }
        }
        return booked < capacity?true:false;
    }
}