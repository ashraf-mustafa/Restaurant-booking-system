package assignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

// TODO: Auto-generated Javadoc
/**
 * The Class TableList.
 */
public class TableList {

	private int counter = 0;
	private Table head = null;
	

	/**
	 * Instantiates a new table list.
	 */
	public TableList() {
	}

	/**
	 * Sets the head.
	 *
	 * @param head the new head
	 */
	public void setHead(Table head) {
		this.head = head;
	}
	
	/**
	 * Gets the head.
	 *
	 * @return the head
	 */
	public Table getHead()
	{
		return head;
	}

	/**
	 * Adds a table.
	 *
	 * @param table the table
	 */
	public void add(Table table) {
		if (this.head == null) {
			this.head = table;	// initiate by adding the first table
		} else {
			table.next = this.head;	
			this.head = table;	// adds the next table as a head node
		}
		this.counter++;	//increment the counter
	}

	/**
	 * Delete a table.
	 *
	 * @param table the table
	 */
	public void delete(Table table) {
		if (this.head == null) {
			System.out.println("There are no tables at the restaurant");	//if the first node is empty (null).
			
		} else if (head.equals(table)) {
			this.head = head.next;
			System.out.println("Table deleted successfully");	// if it points to the next node, meaning that the current node is deleted.
		} else {
			Table current = head;
			// iterate through the linked list
			while (current.next != null) {
				
				if (current == table) {
					Table previous = findPrevious(table);
					previous.next = current.next;
					System.out.println("Table deleted successfully");
				}
				
				current = current.next;
			}
			if (current.next == null && current == table) {
				Table previous = findPrevious(table);
				System.out.println("Table deleted successfully"); 	//if the head of the current node is now the the head of previous node before deleting.
				previous.next = null;
			}
		}

	}

	/**
	 * Find.
	 *
	 * @param table the table
	 * @return the table
	 */
	public Table find(Table table) {

		if (head == null)
			return null;

		if (head == table)
			return head;

		Table current = head;

		while (current.next != null) {
			current = current.next;
			if (current == table)
				return current;
		}
		return null;
	}

	/**
	 * Find previous table.
	 *
	 * @param table the table
	 * @return the table
	 */
	public Table findPrevious(Table table) {

		if (head == table)
			return null;
		// Check the first element for match

		Table current = head;
		Table previous = null;
		
	
		// iterate through the linked list
		while (current.next != null) {
			previous = current;
			current = current.next;
			if (current == table)
				return previous;
		}
		return null;
	}

	/**
	 * Find the previous table node in the list
	 *
	 * @param tableNumber the table number
	 * @return the table
	 */
	public Table findTableByNumber(int tableNumber) {

		if (head == null)
			return null;

		if (head.tableNumber == tableNumber)
			return head;

		Table current = head;

		while (current.next != null) {
			current = current.next;
			if (current.tableNumber == tableNumber)
				return current;
		}
		return null;

	}

	/**
	 * List tables.
	 *
	 * @return the string
	 */
	public String listTables() {
		if (head == null) {
			return "There are no tables in the restaurant";
		} else {
			Table current = head;
			while (current != null) {
				System.out.println(current);

				current = current.next;
			}
			return "";
		}
	}

}
