package digitalinnovationone.com.teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("2+1+3");
		assertEquals(6, soma);
	}
	
	@Test
	public void testSomarComMock() {
		Calculadora calculadora = mock(Calculadora.class);
		
		when(calculadora.somar("1+2")).thenReturn(10);
		
		int resultado  = calculadora.somar("1+2");
		
		assertEquals(10, resultado);
	}

}
