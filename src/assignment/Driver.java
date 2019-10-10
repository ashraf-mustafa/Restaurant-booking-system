package assignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

// TODO: Auto-generated Javadoc
/**
 * The Class Driver.
 */
public class Driver {
	
	/** The input. */
	private Scanner input;
	
	/** The list tables. */
	private TableList listTables;
	
	/** The list bookings. */
	private BookingList listBookings;
	
	/** The list items. */
	private ItemList listItems;

	/**
	 * Instantiates a new driver.
	 *
	 * @throws Exception the exception
	 */
	public Driver() throws Exception
	{
		input = new Scanner(System.in);
		listTables = new TableList();
		listBookings = new BookingList();
		listItems = new ItemList();

		runMenu();
	}

	/**
	 * Starts the application.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String args[]) throws Exception {
		Driver app = new Driver();
	}

	/**
	 * mainMenu() - This method displays the menu for the application, reads the
	 * menu option that the user entered and returns it.
	 * 
	 * @return the users menu choice
	 */
	private int mainMenu() {
		System.out.println("Welcome to my restaurant menu");
		System.out.println("--------------");
		System.out.println("  1) Add a Table");
		System.out.println("  2) List the Tables");
		System.out.println("  3) Delete a table");

		System.out.println("--------------");

		System.out.println("  4) Add A booking");
		System.out.println("  5) List the Bookings");
		System.out.println("  6) Delete a booking");

		System.out.println("--------------");
		System.out.println("  7) Add a food/drink item to be served");
		System.out.println("  8) List the items");
		System.out.println("  9) Delete an item");
		System.out.println("--------------");
		System.out.println("  10) Check In");

		System.out.println("  11) Check Out");
		System.out.println("  12) List of all table, bookings and items:");
		
		System.out.println("  13) Save");
		System.out.println("  14) Load");
		System.out.println("  15) Reset");
		System.out.println("--------------");
		System.out.println("  0) Exit");
		System.out.print("==>> ");
		int option = input.nextInt();
		return option;
	}

	/**
	 * This is the method that controls the loop.
	 *
	 * @throws Exception the exception
	 */
	private void runMenu() throws Exception
	{
		int option = mainMenu();
		while (option != 0) {

			switch (option) {
			case 1:
				addTable();
				break;
			case 2:
				System.out.println(listTables.listTables());
				break;
			
			case 3:
				System.out.println(listTables.listTables());
				deleteTable();
				break;
			case 4:
				addBooking();
				break;
			case 5:
				System.out.println(listBookings.listBookings());
				break;

			case 6:
				System.out.println(listBookings.listBookings());
				deleteBooking();
				System.out.println("Booking deleted.");
				

				break;
			case 7:
				addItem();
				break;
			case 8:
				System.out.println(listItems.listItems());
				break;
			case 9:
				System.out.println(listItems.listItems());
				deleteItem();
				break;

			case 10:
				checkInBooking();
				break;

			case 11:
				checkOutBooking();
				break;
				
			case 12:
				System.out.println(listTables.listTables());
				System.out.println(listBookings.listBookings());
				System.out.println(listItems.listItems());
				
			case 13:
				save();
				break;
			case 14:
				load();
				break;
				
			case 15:
				reset();
				break;
				
				
			default:
				System.out.println("Invalid option entered: " + option);
				break;
			
			}

			// pause the program so that the user can read what we just printed to the
			// terminal window
			System.out.println("\nPress any key to continue...");
			input.nextLine();
			input.nextLine(); // this second read is required - bug in Scanner class; a String read is ignored
								// straight after reading an int.

			// display the main menu again
			option = mainMenu();
		}

		// the user chose option 0, so exit the program
		System.out.println("Exiting... bye");
		System.exit(0);
	}

	/**
	 * Adds  table.
	 */
	public void addTable() {
		System.out.print("Please enter the table number: ");
		int number = input.nextInt();
		System.out.print("Please enter the number of seats: ");
		int seats = input.nextInt();
		listTables.add(new Table(number, seats));
	}

	/**
	 * Adds a booking.
	 */
	public void addBooking() {
		System.out.print("Please enter your name:\n ");
		String nameCustomer = input.nextLine();
		nameCustomer = input.nextLine();

		System.out.print("Please enter the number of the table you want to book:\n ");
		int tableNumber = input.nextInt();

		System.out.print("Please enter the number of people the booking is for:\n ");
		int people = input.nextInt();
		System.out.print("Please enter the time is the booking for (From 10:00 to 21:00):\n ");
		String time = input.nextLine();
		time = input.nextLine();
		System.out.print("For how many hours the booking is for?\n ");
		int hours = input.nextInt();
		listBookings.add(new Booking(nameCustomer, tableNumber, people, time, hours));
	}

	/**
	 * Adds an item.
	 */
	public void addItem() {
		System.out.print("Please enter the Food/Drink items you want to purchase : \n ");
		String itemName = input.nextLine();
		itemName = input.nextLine();
		System.out.print("Please enter the quantity you want: \n");
		int itemNumber = input.nextInt();
		System.out.print("Our restaurantt is a Pay What You Want ...\n ");
		System.out.print("How much do you wish to pay in Euros for the items you bought? ..\n ");
		double price = input.nextDouble();

		listItems.add(new Item(itemName, itemNumber, price));
	}

	/**
	 * Delete a table.
	 */
	public void deleteTable() {
		listTables.listTables();
		System.out.print("Please enter table number that you would like to delete : \n ");
		int tableNumber = input.nextInt();
		Table tableToDelete = listTables.findTableByNumber(tableNumber);
		listTables.delete(tableToDelete);
	}

	/**
	 * Delete a booking.
	 */
	public void deleteBooking() {
		System.out.print("Please enter your name that you booked with: \n ");
		input.nextLine();
		String nameCustomer = input.nextLine();
		Booking bookingToDelete = listBookings.findBookingByCustomer(nameCustomer);
		listBookings.delete(bookingToDelete);
	}
	
	/**
	 * Delete an item.
	 */
	public void deleteItem() {
		System.out.print("Please enter the item you want to delete: \n ");
		input.nextLine();
		String itemName = input.nextLine();
		Item itemToDelete = listItems.findItemByName(itemName);
		listItems.delete(itemToDelete);
	}

	/**
	 * Check in booking.
	 */
	public void checkInBooking() {
		System.out.print("Please enter your name that you booked with: \n ");
		input.nextLine();
		String nameCustomer = input.nextLine();
		Booking bookingToCheckIn = listBookings.findBookingByCustomer(nameCustomer);
		listBookings.checkIn(bookingToCheckIn);

	}

	/**
	 * Check out booking.
	 */
	public void checkOutBooking() {
		System.out.print("Please enter your name that you booked with: \n ");
		input.nextLine();
		String nameCustomer = input.nextLine();
		Booking bookingToCheckOut = listBookings.findBookingByCustomer(nameCustomer);
		listBookings.checkOut(bookingToCheckOut);
	}


	/**
	 * Reset all the data to null.
	 */
	public void reset() {
		listTables.setHead(null);
		listBookings.setHead(null);

	}

	 /**
 	 * To load the lists of bookings, tables and items form an XML file.
 	 *
 	 * @throws Exception the exception
 	 */
 	@SuppressWarnings("unchecked")
	    public void load() throws Exception
	    {
	        XStream xstream = new XStream(new DomDriver());
	        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("load.xml"));
	        listTables = (TableList) is.readObject();
	        listBookings = (BookingList) is.readObject();
	        listItems = (ItemList) is.readObject();
	        is.close();
	    }
	    
	    /**
    	 * To save the lists of bookings, tables and items to an XML file.
    	 *
    	 * @throws Exception the exception
    	 */
    	public void save() throws Exception
	    {
	        XStream xstream = new XStream(new DomDriver());
	        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("save.xml"));
	        out.writeObject(listTables);
	        out.writeObject(listBookings);
	        out.writeObject(listItems);
	        out.close();    
	    }
	    
}
