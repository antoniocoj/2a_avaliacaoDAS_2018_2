package test;

import static org.junit.Assert.*;

import org.junit.Test;

import app.CalculoInvestimentoCDB;

public class CalculoRendimentoBrutoTest {

	@Test
	public void testCalculoRendimentoBruto() {
		assertEquals(13.97f, CalculoInvestimentoCDB.calcularRendimentoBruto(60, 1000.00 , 0.85 , 0.225), 0.01f);
	}

}
