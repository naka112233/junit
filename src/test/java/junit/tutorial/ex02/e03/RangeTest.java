package junit.tutorial.ex02.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

class RangeTest {

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

	@Nested
	class test1 {
		@ParameterizedTest
		@ValueSource(doubles = {0.0, 10.5})
		Range range = new Range();
			//@ValueSource(doubles = {0.0, 10.5})
			void test1(double d) {
			assertFalse(range.contains(d));
	}


}
