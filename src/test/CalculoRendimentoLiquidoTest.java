package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoRendimentoLiquidoTest {

	@Test
	public void testCalculoRendimentoLiquido() {
		assertEquals(1.0829f, CalculoInvestimentoCDB.calcularRendimentoLiquido(60, 1.000,00 , 0.85 , 0.225), 0.0001f);
	}


}
