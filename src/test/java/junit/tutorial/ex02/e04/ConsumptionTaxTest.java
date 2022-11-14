package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

class ConsumptionTaxTest {

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
	
	ConsumptionTax tax;
	
	@Nested
	class tax5 {
		void taxtest() throws Exception{
			tax = new ConsumptionTax(5);
		}
		@ParameterizedTest
		@CsvSource({
			"100, 105","3000, 3150","50, 52"
		})
		void test1(int price, int expected) {
			assertEquals(expected, tax.apply(price));
	}
		@Nested
		class tax10 {
			void taxtest() throws Exception{
				tax = new ConsumptionTax(10);
			}
			@ParameterizedTest
			@CsvSource({
				"50, 55",
			})
			void test1(int price, int expected) {
				assertEquals(expected, tax.apply(price));
		}
	}
		@Nested
		class tax3 {
			void taxtest() throws Exception{
				tax = new ConsumptionTax(3);
			}
			@ParameterizedTest
			@CsvSource({
				"50, 51",
			})
			void test1(int price, int expected) {
				assertEquals(expected, tax.apply(price));
		}
	}

}