package busTicketBookingApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BusTicketBooking {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Bus> buses = new ArrayList<Bus>();
		buses.add(new Bus(1, true, 1));
		buses.add(new Bus(2, false, 2));
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		int choice = 0;
		while (true) {
			System.out.println("---------------\n1.New Booking\n2.Bus Info\n3.Print All Bookings\n4.Exit\n--------------");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				String passengerName;
				int busNumber;
				Date journeyDate = null;

				System.out.println("Enter Passenger Name: ");
				passengerName = scan.next();
				System.out.println("Enter Bus Number: ");
				busNumber = scan.nextInt();
				System.out.println("Enter journey date(dd-mm-yyyy): ");
				String dateInput = scan.next();
				// convert string to date object
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				try {
					journeyDate = dateFormat.parse(dateInput);
				} catch (ParseException e) {
					e.printStackTrace();
				}

				Booking booking = new Booking(passengerName, busNumber, journeyDate);

				if (booking.isSeatAvailable(buses, bookings)) {
					bookings.add(booking); // append into bookings list
					System.out.println(passengerName + " has booked ticket successfully!");
				} else {
					System.out.println("Bus is full. Try another bus or date!");
				}
				break;
			case 2:
				for (Bus bus : buses) {
					bus.displayBusInfo();
				}
				break;
			case 3:
				for (Booking b : bookings) {
					b.bookingInfo();
				}
				break;
			case 4:
			default:
				System.out.println("Thank you!!!");
				scan.close();
				System.exit(0);
			}

		}

	}

}
