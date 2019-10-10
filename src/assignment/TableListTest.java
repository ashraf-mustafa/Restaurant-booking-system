package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TableListTest {

	
	TableList testList = new TableList();
	
	Table testTable1 = new Table(1, 6);
	Table testTable2 = new Table(2, 7);
	Table testTable3 = new Table(3, 2);
	
	@Test
	public void testSetGetHead() {
		testList.setHead(testTable1);
		
		Assert.assertEquals(testTable1, testList.getHead());
	}

	@Test
	public void testAdd() {
		testList.add(testTable1);
		testList.add(testTable2);
		testList.add(testTable3);
		
		Assert.assertEquals(testTable3, testList.getHead());
		Assert.assertEquals(testTable2, testList.getHead().next);
		Assert.assertEquals(testTable1, testList.getHead().next.next);

	}
	
	public void findTableByNumber() {
		testList.add(testTable1);
		
		Assert.assertEquals(testTable3, testList.getHead());
		Assert.assertEquals(testTable2, testList.getHead().next);
		Assert.assertEquals(testTable1, testList.getHead().next.next);
}
	public void testDelete() {
		testList.delete(testTable1);
		testList.delete(testTable2);
		testList.delete(testTable3);
		
		Assert.assertEquals(testTable3, testList.getHead());
		Assert.assertEquals(testTable2, testList.getHead().next);
		Assert.assertEquals(testTable1, testList.getHead().next.next);

	}
	
}
