package junit.tutorial.ex02.e03;

import static org.junit.jupiter.api.Assertions.*

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

	
	class test1{
		@BeforeEach //最初の動作（共通の動作）は全部一緒の場合まとめられる
		void setUp() throws Exception {
			Range range = new Range(0d, 10.5);
			
			
			class test1_1 {

				@ParameterizedTest
				@ValueSource(doubles = {0.0, 10.5})
				void test1_1_1(double d) {
					assertTrue(range.contains(d));
				}

			}
			
			class test1_2 {

				@ParameterizedTest
				@ValueSource(doubles = {-0.1, 10.6})
				void test1_2_1(double d) {
					assertFalse(range.contains(d));
				}

			}
			
		}
		
		
		class test2 {
			
			@BeforeEach
			void setUp() throws Exception {
				Range range = new Range(-5.1, 5.1);


			
			class test2_1 {
				@ParameterizedTest
				@ValueSource(doubles = {-5.1, 5.1})
				void test2_1_1(double d) {
					assertTrue(range.contains(d));
				}
			
			
			class test2_2 {
				@ParameterizedTest
				@ValueSource(doubles = {-5.2, 5.2})
				void test2_2_1(double d) {
					assertFalse(range.contains(d));
				}
			}
		}

	}


}
