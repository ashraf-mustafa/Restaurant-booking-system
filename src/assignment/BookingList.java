/*
 * 
 */
package assignment;

/**
 * The BookingList class to manage the listing of bookings in a linked list
 * 
 * @author Ashraf Mustafa
 */
public class BookingList {
	private int counter = 0;		// To initialize the counter
	private Booking head = null; 	//assign the head of the list to null		

	
	public BookingList() {
	}


	public void setHead(Booking head) {
		this.head = head;
	}
	
	public Booking getHead(Booking head) {
		return head;
	}

	/**.
	 *
	 * @param Add the booking
	 */
	public void add(Booking booking) {
		if (this.head == null) {
			this.head = booking;	// Making the first booking.
		} else {
			booking.next = this.head;
			this.head = booking;	// add the next booking as a head node.
		}
		this.counter++;		//increment the booking count.
	}

	/**
	 * @param To delete a booking
	 */
	public void delete(Booking booking) {
		if (this.head == null) {
			System.out.println("There are no Bookings to be deleted");	//if the first node is empty (null).

		} else if (head.equals(booking)) {
			this.head = head.next;
			System.out.println("Booking deleted successfully");	// if it points to the next node, meaning that the current node is deleted.
		} else {
			Booking current = head;
			
			// iterate through the linked list
			while (current.next != null) {
				
				if (current == booking) {
					Booking previous = findPrevious(booking);
					previous.next = current.next;
					System.out.println("Booking deleted successfully");	
				}
				
				current = current.next;
			}
			if (current.next == null && current == booking) {
				Booking previous = findPrevious(booking);
				System.out.println("Booking deleted successfully"); //if the head of the current node is now the the head of previous node before deleting.
				previous.next = null;
			
			}
		}

	}

	/**
	 * @param Finding the booking location in the list
	 * @return the booking
	 */
	public Booking find(Booking booking) {

		if (head == null)
			return null;
		// Check the first element for match
		if (head == booking)
			return head;
		// assign as iterator
		Booking current = head;
		// iterate through the linked list
		while (current.next != null) {
			current = current.next;
			if (current == booking)
				return current;
		}
		return null;
	}

	/**
	 *
	 * @param Find the previous booking in the list
	 * @return the booking
	 */
	public Booking findPrevious(Booking booking) {
		// check the first element
		if (head == booking)
			return null;
		
		Booking current = head;
		Booking previous = null;
		
		// iterate through the linked list
		while (current.next != null) {
			previous = current;
			current = current.next;
			if (current == booking)
				return previous;
		}
		return null;
	}

	/**
	 * Find booking by customer's name.
	 * @return the booking
	 */
	public Booking findBookingByCustomer(String nameCustomer) {

		if (head == null)
			return null;

		if (head.nameCustomer.equals(nameCustomer))
			return head;

		Booking current = head;

		while (current.next != null) {
			current = current.next;
			if (current.nameCustomer.equals(nameCustomer))
				return current;
		}

		return null;

	}

	/**
	 
	 * @param Method to check for booking active to mark as checked in
	 * @return the booking
	 */
	public Booking checkIn(Booking booking) {
		// check the first element 
		if (booking == null) {
			//if no booking
			System.out.println("no booking");
		} else {
			//if there is a booking
			booking.checkIn();
			System.out.println("The customer has checked in successfully");
		}

		return null;

	}

	/**
	 
	 * @param method to check if there is no active booking, otherwise print that the customer is still in the restaurant
	 * @return the booking
	 */
	public Booking checkOut(Booking booking) {
		// check the first element
		if (booking == null) {
			//To be printed if the head of the booking list is empty
			System.out.println("No booking or the customer has checked out successfully");
		} else {
			//To be printed if an active booking found
			booking.checkIn();
			System.out.println("The customer is still in the restaurant");
		}

		return null;
	}

	/**
	 * List of bookings.
	 *
	 * @return the string
	 */
	public String listBookings() {
		if (head == null) {
			return "There is no booking at the restaurant for now";
		} else {
			Booking current = head;
			while (current != null) {
				// create a method that finds the table before in the list
				System.out.println(current);
				// at the moment this is only looping through all the tables

				current = current.next;
			}
			return "";
		}
	}


	

}