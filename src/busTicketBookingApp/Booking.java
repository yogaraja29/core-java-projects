package busTicketBookingApp;

import java.util.ArrayList;
import java.util.Date;

public class Booking {
	private String passengerName;
	private int busNumber;
	private Date journeyDate;

	Booking(String passengerName, int busNumber, Date journeyDate) {
		this.passengerName = passengerName;
		this.busNumber = busNumber;
		this.journeyDate = journeyDate;
	}

	public boolean isSeatAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings) {
		int availableSeats = 0, bookedSeats = 0;
		for (Bus bus : buses) {
			if (this.busNumber == bus.getBusNumber()) {
				availableSeats = bus.getCapacity();
			}
		}
		for (Booking booking : bookings) {
			if (booking.busNumber == this.busNumber && booking.journeyDate.equals(this.journeyDate)) {
				bookedSeats++;
			}
		}

		return bookedSeats < availableSeats;
	}

	public void bookingInfo() {
		System.out.println(this.passengerName + " " + this.busNumber + " " + this.journeyDate);
	}

}
