package test;

import static org.junit.Assert.*;

import org.junit.Test;

import app.CalculoInvestimentoCDB;

public class CalculoRendimentoLiquidoTest {

	@Test
	public void testCalculoRendimentoLiquido() {
		assertEquals(1.0829f, CalculoInvestimentoCDB.calcularRendimentoLiquido(60, 1000.00 , 0.85 , 0.225), 0.01f);
	}
	
}
