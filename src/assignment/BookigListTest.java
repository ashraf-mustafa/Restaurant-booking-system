package assignment;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BookigListTest {

		BookingList testList = new BookingList();
		
		Booking Booking1 = new Booking(null, 0, 0, null, 0);
		Booking Booking2 = new Booking(null, 1, 2, null, 3);
		
		@Test
		
		public void testSetGetHead() {
			testList.setHead(Booking1);
			
			Assert.assertEquals(Booking1, testList.getHead(Booking1));
		}

		@Test
		public void testAdd() {
			testList.add(Booking1);
			testList.add(Booking2);
			
			
			Assert.assertEquals(Booking2, testList.getHead(Booking2));
			Assert.assertEquals(Booking1, testList.getHead(Booking1));
		}
		
	
		@Test
		public void testDelete() {
			testList.delete(Booking1);
			testList.delete(Booking2);
			
			
			Assert.assertEquals(Booking2, testList.getHead(Booking2));
			Assert.assertEquals(Booking1, testList.getHead(Booking1));
		}
	}


