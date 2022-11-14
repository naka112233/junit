package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	ItemStock itemStock = new ItemStock();
	Item item1 = new Item("book",100);
	Item item2 = new Item("cd",1400);



	@Test
	void testadd1() {

		ItemStock itemStock = new ItemStock();
		Item item1 = new Item("book",100);
		Item item2 = new Item("cd",1400);
		int result = itemStock.getNum(item1);
		assertEquals(0,result);

	}

@Test
	void testadd2() {
		itemStock.add(item1);
		Integer result = itemStock.getNum(item1);
		assertEquals(1,result);

	}

	@Test
	void testadd3() {
		itemStock.add(item1);
		itemStock.add(item1);
		Integer result = itemStock.getNum(item1);
		assertEquals(2,result);
	}

	@Test 
	void testadd4(){
		itemStock.add(item1);
		itemStock.add(item2);
		Integer result = itemStock.getNum(item1);
		assertEquals(1,result);

	}


}
