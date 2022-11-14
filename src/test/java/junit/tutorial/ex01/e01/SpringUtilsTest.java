package junit.tutorial.ex01.e01;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpringUtilsTest {

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
	void testToSnakeCase() {
		String result = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result,"テストケース1　失敗");
	}

    @Test
    void testToSnakeCase2() {
    	String result = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result,"テストケース2　失敗");
    }

    @Test
    void testToSnakeCase3() {
    	String result = StringUtils.toSnakeCase("precticeJunit");
		assertEquals("prectice_junit", result,"テストケース3　失敗");
    }


}
