package busTicketBookingApp;

public class Bus {

	private int busNumber;
	private boolean isAcBus;
	private int capacity;

	Bus(int busNumber, boolean isAcBus, int capacity) {
		this.busNumber = busNumber;
		this.isAcBus = isAcBus;
		this.capacity = capacity;
	}

	public int getCapacity() { // accessor method
		return this.capacity;
	}

	public void setCapacity(int newCapacity) { // mutator method
		this.capacity = newCapacity;
	}

	public int getBusNumber() { // accessor method
		return this.busNumber;
	}

	public void setBusNumber(int newBusNum) { // mutator method
		this.busNumber = newBusNum;
	}

	public void displayBusInfo() {
		System.out.println("Bus number: " + this.busNumber + ", Capacity: " + this.capacity + ", "
				+ (this.isAcBus ? "AC Bus" : "Non-Ac Bus"));
	}

}
