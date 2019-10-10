package assignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


/**
 * The Class Table.
 */
public class Table {

	
	int tableNumber;
	int numberSeats;
	Table next = null;

	/**
	 * Instantiates a new table.
	 *
	 * @param tableNumber the table number
	 * @param numberSeats the number seats
	 */
	public Table(int tableNumber, int numberSeats) {

		this.tableNumber = tableNumber;
		this.numberSeats = numberSeats;
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
	 * Gets the number seats.
	 *
	 * @return the number seats
	 */
	public int getNumberSeats() {
		return numberSeats;
	}

	/**
	 * Sets the number seats.
	 *
	 * @param numberSeats the new number seats
	 */
	public void setNumberSeats(int numberSeats) {
		this.numberSeats = numberSeats;
	}

	@Override
	public String toString() {
		return "Table [tableNumber=" + tableNumber + ", numberSeats=" + numberSeats + "]";
	}

}
