package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoValorIRTest {
	
	@Test
	public void testCalculoValorIR() {
		assertEquals(3.14f, CalculoInvestimentoCDB.calcularValorIR(60, 1.000,00 , 0.85 , 0.225), 0.01f);
	}

}
