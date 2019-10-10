package assignment;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ItemListTest {

	ItemList testList = new ItemList();
	
	Item Item1 = new Item(null, 0, 3.0);
	Item Item2 = new Item(null, 1, 5.0);
	
	@Test
	
	public void testSetGetHead() {
		testList.setHead(Item1);
		
		Assert.assertEquals(Item1, testList.getHead(Item1));
	}

	@Test
	public void testAdd() {
		testList.add(Item1);
		testList.add(Item2);
		
		
		Assert.assertEquals(Item2, testList.getHead(Item2));
		Assert.assertEquals(Item1, testList.getHead(Item1));
	}
	
	@Test
	public void testDelete() {
		testList.delete(Item1);
		testList.delete(Item2);
		
		
		Assert.assertEquals(Item2, testList.getHead(Item2));
		Assert.assertEquals(Item1, testList.getHead(Item1));
	}

}
