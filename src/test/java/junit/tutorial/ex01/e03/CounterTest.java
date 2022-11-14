package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

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

	@Test
	void testCount1() {
		Counter counter = new Counter();
		//int count = 0;
		int result = counter.increment();
		assertEquals(1,result);
	}
	@Test
	void testCount2() {
		Counter counter = new Counter();
		int count = 1;
		int result = counter.increment();
		assertEquals(2,result);
	}
	@Test
	void testCount3() {
		Counter counter = new Counter();
		int count = 50;
		int result = counter.increment();
		assertEquals(51,result);
	}
}
