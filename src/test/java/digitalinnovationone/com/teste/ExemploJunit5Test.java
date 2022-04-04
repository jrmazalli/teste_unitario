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
				.sum() > 5);    // A soma deve ser maior que 5
	}
	
	@Test
	void groupAssertions() {
		int[] numeros = {0,1,2,3,4};
		assertAll("numeros",
				() -> assertEquals(numeros[0],1),
				() -> assertEquals(numeros[3],3),
				() -> assertEquals(numeros[4],1));
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
		String someString = "Apenas uma string";
		assumingThat(someString.equals("JApenas uma string"), 
						() -> assertEquals(2+2,4));
	}
}
