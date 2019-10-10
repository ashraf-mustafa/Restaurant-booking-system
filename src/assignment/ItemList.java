package assignment;


/**
 * The Class is for the list of items in a linked list.
 */
public class ItemList {

	private int counter = 0;
	private Item head = null;
	

	/**
	 * Instantiates a new item list.
	 */
	public ItemList() {
	}
	
	
	public Item getHead(Item head) {
		return head;
	}


	public void setHead(Item head) {
		this.head = head;
	}

	/**
	 * Adds an item
	 *
	 * @param item the item
	 */
	public void add(Item item) {
		if (this.head == null) {
			this.head = item;
		} else {
			item.next = this.head;
			this.head = item;
		}
		this.counter++;
	}

	
	/**
	 * To delete an item.
	 *
	 * @param item the item
	 */
	public void delete(Item item) {
		if (this.head == null) {
			System.out.println("There are no item to be deleted");	//if the first node is empty (null).

		} else if (head.equals(item)) {
			this.head = head.next;
			System.out.println("Item deleted successfully");	// if it points to the next node, meaning that the current node is deleted.
		} else {
			Item current = head;
			
			// iterate through the linked list
			while (current.next != null) {
				
				if (current == item) {
					Item previous = findPrevious(item);
					previous.next = current.next;
					System.out.println("Item deleted successfully");
				}
				
				current = current.next;
			}
			if (current.next == null && current == item) {
				Item previous = findPrevious(item);
				System.out.println("Item deleted successfully");	//if the head of the current node is now the the head of previous node before deleting
				previous.next = null;
			}
		}

	}

	/**
	 * Find.
	 *
	 * @param item the item
	 * @return the item
	 */
	public Item find(Item item) {

		if (head == null)
			return null;
		
		// Check the first element for match
		if (head == item)
			return head;
		// assign as iterator
		Item current = head;
		// iterate through the linked list
		while (current.next != null) {
			current = current.next;
			if (current == item)
				return current;
		}
		return null;
	}

	/**
	 * Find the previous item in the list
	 *
	 * @param item the item
	 * @return the item
	 */
	public Item findPrevious(Item item) {
		// check the first element
		if (head == item)
			return null;

		Item current = head;
		Item previous = null;
		// iterate through the linked list
		while (current.next != null) {
			previous = current;
			current = current.next;
			if (current == item)
				return previous;
		}
		return null;
	}
	
	/**
	 * Find item by name.
	 *
	 * @param itemName the item name
	 * @return the item
	 */
	public Item findItemByName(String itemName) {

		if (head == null)
			return null;

		if (head.itemName.equals(itemName))
			return head;

		Item current = head;

		while (current.next != null) {
			current = current.next;
			if (current.itemName.equals(itemName))
				return current;
		}

		return null;

	}

	/**
	 * List of items.
	 *
	 * @return the string
	 */
	public String listItems() {
		if (head == null) {
			return "There is no item in the menu";
		} else {
			Item current = head;
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
