package test;

import static org.junit.Assert.*;

import org.junit.Test;

import app.CalculoInvestimentoCDB;

public class CalculoValorIRTest {
	
	@Test
	public void testCalculoValorIR() {
		assertEquals(3.14f, CalculoInvestimentoCDB.calcularValorIR(60, 1000.00 , 0.85 , 0.225), 0.01f);
	}
	
}
