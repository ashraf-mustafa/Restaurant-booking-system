package assignment;


/**
 * The Booking class
 * 
 * @author Ashraf Mustafa
 */

public class Booking {

	
	public String nameCustomer;
	public int tableNumber;
	public int NumberPeople;
	public String time;
	public int hours;
	boolean isCurrent = false;
	public Booking next = null;

	/**
	 * Instantiates a new booking.
	 */
	public Booking(String nameCustomer, int tableNumber, int numberPeople, String time, int hours) {
		super();
		this.nameCustomer = nameCustomer;
		this.tableNumber = tableNumber;
		NumberPeople = numberPeople;
		this.time = time;
		this.hours = hours;
	}

	/**
	 * Gets the name customer.
	 *
	 * @return the name customer
	 */
	public String getNameCustomer() {
		return nameCustomer;
	}

	/**
	 * Sets the name customer.
	 *
	 * @param nameCustomer the new name customer
	 */
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	/**
	 * Gets the table number.
	 *
	 * @return the table number
	 */
	public int getTableNumber() {
		return tableNumber;
	}

	/**
	 * Sets the table number.
	 *
	 * @param tableNumber the new table number
	 */
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	/**
	 * Gets the number people.
	 *
	 * @return the number people
	 */
	public int getNumberPeople() {
		return NumberPeople;
	}

	/**
	 * Sets the number people.
	 *
	 * @param numberPeople the new number people
	 */
	public void setNumberPeople(int numberPeople) {
		NumberPeople = numberPeople;
	}

	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Sets the time.
	 *
	 * @param time the new time
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * Gets the hours.
	 *
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * Sets the hours.
	 *
	 * @param hours the new hours
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * Check in.
	 */
	public void checkIn() {
		this.isCurrent = true;
	}

	/**
	 * Check out.
	 */
	public void checkOut() {
		this.isCurrent = false;
	}

	
	@Override
	public String toString() {
		return "Booking [nameCustomer=" + nameCustomer + ", tableNumber=" + tableNumber + ", NumberPeople="
				+ NumberPeople + ", time=" + time + ", hours=" + hours + "]";
	}

}
