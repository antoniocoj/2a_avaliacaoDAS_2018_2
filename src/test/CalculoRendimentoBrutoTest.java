package test;

import static org.junit.Assert.*;

import org.junit.Test;

import app.CalculoInvestimentoCDB;

public class CalculoRendimentoBrutoTest {

	@Test
	public void testCalculoRendimentoBruto() {
		assertEquals(13.97f, CalculoInvestimentoCDB.calcularRendimentoBruto(60, 1000.00 , 0.085 , 0.225), 0.01f);
	}
	
	@Test
	public void testCalculoRendimentoBrutoOutroValor() {
		assertEquals(177.53f, CalculoInvestimentoCDB.calcularRendimentoBruto(240, 3000.00 , 0.09 , 0.20), 0.01f);
	}

}
