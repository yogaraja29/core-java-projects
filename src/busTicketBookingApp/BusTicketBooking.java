package busTicketBookingApp;

import java.util.*;

public class BusTicketBooking {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		buses.add(new Bus(1, true, 2));
		buses.add(new Bus(2, false, 3));

		int choice;

		do {
			System.out.println("---------------\n1.New Booking\n2.Bus Info\n3.Exit\n-----------------");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				Booking booking = new Booking();
				break;
			case 2:
				for (Bus bus : buses) {
					bus.displayBusInfo();
				}
				break;
			case 3:
			default:
				System.out.println("-----Thank you!!!-----");
				System.exit(0);
			}
		} while (choice >= 1 && choice <= 2);

		scan.close();

	}

}
