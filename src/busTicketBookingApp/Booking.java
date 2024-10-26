package busTicketBookingApp;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {

	private int busNumber;
	private int seatCount;
	private Date journeyDate;

	Booking() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Bus Number: ");
		this.busNumber = scan.nextInt();
		System.out.println("How many seats do you want? ");
		this.seatCount = scan.nextInt();
		System.out.println("Enter journey date(dd-mm-yyyy): ");
		String dateInput = scan.next();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			this.journeyDate = dateFormat.parse(dateInput);
		} catch (ParseException e) {

			e.printStackTrace();
		}
//		System.out.println(this.busNumber + " " + this.seatCount + " " + this.journeyDate);
		scan.close();
	}

	public boolean isSeatAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings) {
		int availableSeats = 0;
		for (Bus bus : buses) {
			if (this.busNumber == bus.getBusNumber()) {
				availableSeats = bus.getCapacity();
			}
			if (this.seatCount < availableSeats) {
				return true;
			}
		}
		return false;
	}

}
