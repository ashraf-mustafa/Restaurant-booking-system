package assignment;

/**
 * The Class Item.
 */
public class Item {

	String itemName;
	int numberItems;
	Double price;
	Item nextItem;
	Object data;
	public Item next = null;

	/**
	 * Instantiates a new item.
	 *
	 * @param itemName the item name
	 * @param numberItems the number items
	 * @param price the price
	 */
	public Item(String itemName, int numberItems, double price) {
		super();
		this.itemName = itemName;
		this.numberItems = numberItems;
		this.price = price;
	}

	/**
	 * Gets the item name.
	 *
	 * @return the item name
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * Sets the item name.
	 *
	 * @param itemName the new item name
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * Gets the number items.
	 *
	 * @return the number items
	 */
	public int getNumberItems() {
		return numberItems;
	}

	/**
	 * Sets the number items.
	 *
	 * @param numberItems the new number items
	 */
	public void setNumberItems(int numberItems) {
		this.numberItems = numberItems;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", numberItems=" + numberItems + ", price=" + price + "]";
	}

}
