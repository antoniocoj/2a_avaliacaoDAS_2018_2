package test;

import static org.junit.Assert.*;

import org.junit.Test;

import app.CalculoInvestimentoCDB;

public class CalculoValorIRTest {
	
	@Test
	public void testCalculoValorIR() {
		assertEquals(3.14f, CalculoInvestimentoCDB.calcularValorIR(60, 1000.00 , 0.85 , 0.225), 0.01f);
	}
	
	@Test
	public void testCalculoValorIROutroValor() {
		assertEquals(35.51f, CalculoInvestimentoCDB.calcularValorIR(240, 3000.00 , 0.9 , 0.20), 0.01f);
	}
	
}
