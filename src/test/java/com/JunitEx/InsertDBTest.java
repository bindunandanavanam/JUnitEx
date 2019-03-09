package com.JunitEx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class InsertDBTest {
	
 static InsertDB ins;
	
 		@BeforeAll
 		public static void init() {
 			ins=new InsertDB();
 		}
	 
	//@Test
	//void testValues() {
//		assertEquals(1,ins.intoDB(10, "bindu"));
	//}
//	@Test
//	void updateValues() {
//	assertEquals(1, ins.updateDB("manisha",10));
//	}
 		@Test
 		void delval() {
 			assertEquals(1, ins.deleteDB(10));
 		}

}
