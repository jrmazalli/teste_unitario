package digitalinnovationone.com.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.Test;

public class ExemploJunit5Test {

	@Test
	void lambdaExpressions() {
		assertTrue(Stream.of(1,2,3)
				.mapToInt(i -> i)
				.sum() > 5);    // Sum should be greater than 5
	}
	
	@Test
	void groupAssertions() {
		int[] numbers = {0,1,2,3,4};
		assertAll("numbers",
				() -> assertEquals(numbers[0],1),
				() -> assertEquals(numbers[3],3),
				() -> assertEquals(numbers[4],1));
	}
	
	@Test
	void trueAssumption() {
		assumeTrue(5 > 1);
		assertEquals(5 + 2, 7);
	}
	
	@Test
	void falseAssumption() {
		assumeTrue(5 < 1);
		assertEquals(5 + 2, 7);
	}
	
	@Test
	void assumptionThat() {
		String someString = "Just a string";
		assumingThat(someString.equals("Just a string"), 
						() -> assertEquals(2+2,4));
	}
}
